package com.bbtong.Service.Impl;

import com.bbtong.Dao.ClientDao;
import com.bbtong.Pojo.Client;
import com.bbtong.Pojo.SelectClient;
import com.bbtong.Service.ClientService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 客户表
 */

@Service
public class ClientServiceImpl implements ClientService {

    @Resource
    private ClientDao clientDao;

    /**
     * 用户添加自己客户的方法
     *
     * @param client 这里面存储着，用户传来的数据到serviceImpl中进行操作
     * @return
     */
    @Override
    public Result AddClient(Client client) {
        //创建实体来接受数据，和返回数据
        Result result = new Result();
        int zhi = clientDao.AddClient(client);
        if (zhi > 0) {
            result.setCode(200);
            result.setMessage("上传成功");
        } else {
            result.setCode(400);
            result.setMessage("上传失败，请重试");
        }
        return result;
    }

    /**
     * 用户查询自己的客户的方法
     *
     * @param userId 用户自己的ID
     * @param index  当前是多少页
     * @return 戴辆
     */
    @Override
    public ResultPage SelectQuery(Integer userId, Integer typeId, Integer index) {
        //用来接受数据库返回的数据，传到controller层中
        ResultPage resultPage = new ResultPage();
        //创建map函数用来存储数据，用于sql语句的查询
        Map<String, Object> map = new HashMap<String, Object>();
        //一页显示的条数
        resultPage.setSize(5);
        //将用户的ID存到map中
        map.put("userId", userId);
        //如果typeId为null(空)的话，择查询准客户 类型的客户
        if (null == typeId) {
            typeId = 1;
        }
        //将typeId存到map中，用于后面的查询
        map.put("typeId", typeId);
        //先查询用户一共有多少客户，然后再来计算有多少页
        resultPage.setCount(clientDao.SelectQueryNumber(map));
        //计算总的页数，先将计算的结果转化成double类型然后再向下取整，再将值转换成int的类型
        resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getCount()));
        //判断有没有数据，如果条数为0，则说明没有客户
        if (resultPage.getCount() == 0) {
            resultPage.setCode(200);
            resultPage.setMessage("没有客户");
            resultPage.setCount(0);
            return resultPage;
        }

        //从多少条
        map.put("state", 0);
        //查询到多少条
        map.put("end", index * resultPage.getSize());
        //查询所有客户的数据
        List<SelectClient> selectClientList = clientDao.SelectQuery(map);
        if (selectClientList.size() > 0) {
            if (index == resultPage.getPageCount()) {//判断当前是不是最后一页，如果是最后一页的话，则显示最后一页的信息
                resultPage.setMessage("当前已经是最后一页");
            } else {
                resultPage.setMessage("查询成功");
            }
            resultPage.setCount(200);
            resultPage.setData(selectClientList);
        } else {
            resultPage.setCount(400);
            resultPage.setMessage("查询失败，请重试");
        }

        return resultPage;
    }

    /**
     * 用户查询对应的客户的详情信息
     *
     * @param userId   用户的ID
     * @param clientId 客户的ID
     * @return 戴辆
     */
    @Override
    public ResultPage Particulars(Integer userId, Integer clientId) {
        //创建接收数据的实体
        ResultPage resultPage = new ResultPage();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将用户的userId存到map中
        map.put("userId", userId);
        //将用户的要查询的客户ID存到map中
        map.put("clientId", clientId);
        SelectClient client = clientDao.Particulars(map);
        if (null != client.getClientId()) {
            resultPage.setCode(200);//200表示成功
            resultPage.setMessage("详情信息");//表示详细结果
            resultPage.setData(client);//将查询的结果写到数据中去
        } else {
            resultPage.setCode(400);//400表示失败
            resultPage.setMessage("没有找到数据");
        }
        return resultPage;
    }

    /**
     * 提醒客户在这一个月内生日的客户
     *
     * @param userId  用户ID
     * @param Time    当前的时间
     * @param NewTime 加上一个月的时间
     * @return 戴辆
     */
    @Override
    public ResultPage Birthday(Integer userId, Integer Time, String NewTime, Integer index) {
        //创建来接受后台返回的数据
        ResultPage resultPage = new ResultPage();
        //表示一页显示多少条数据
        resultPage.setSize(5);
        //当前的页码为多少页
        resultPage.setIndex(index);
        //创建map的函数来，储存数据,将日期转换成int类型用于，数据的比较
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//用户的ID
        map.put("Time", Time);//当前的时间
        map.put("NewTime", Integer.parseInt(NewTime));//一个月后的时间
        //忽略前面0条数据
        map.put("state", 0);
        if (Integer.parseInt(NewTime) <= 0201) {//查询十二月到一月生日的人
            //表示当前这个月生日的客户总共有多少
            resultPage.setCount(clientDao.BirthdayNumber(map));
            if (resultPage.getCount() > 0) {//查询返回的数据是否大于0条
                //计算总的页数,(用总的条数除以每页显示的数据，再将其转换成double类型，然后想下取整，再转换成int类型)
                resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
                if (index > resultPage.getPageCount()) {//如果页数大于总页数的话就，让index显示为最后一页
                    index = resultPage.getPageCount();
                }
                //查询后面的多少条数据
                map.put("end", index * resultPage.getSize());
                if (index == resultPage.getPageCount()) {//用当前的页数与总的页数比较，如果一样就提示是最后一页。
                    resultPage.setMessage("当前已经是最后一页");
                } else {
                    resultPage.setMessage("当前加载的是第:" + index + "页");
                }
                //查询显示对应页的数据
                List<SelectClient> selectClientList = clientDao.Birthday(map);
                //表示查询成功
                resultPage.setCode(200);
                //将查询成功的数据写入到数据中
                resultPage.setData(selectClientList);
            } else {
                resultPage.setCode(400);
                //表示在这个一个月内没有客户生日,则表示0位
                resultPage.setCount(0);
                //显示客户生日的条数
                resultPage.setMessage(Time + "到" + NewTime + "有" + resultPage.getCount() + "位客户生日");
            }

        } else {
            //获取在这个一个月内生日的客户的总条数
            resultPage.setCount(clientDao.NewBirthdayNumber(map));
            if (resultPage.getCount() > 0) {//判断数据数据是不是大于0
                //计算总的页数,(用总的条数除以每页显示的数据，再将其转换成double类型，然后想下取整，再转换成int类型)
                resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
                if (index > resultPage.getPageCount()) {//如果页数大于总页数的话就，让index显示为最后一页
                    index = resultPage.getPageCount();
                }
                //查询后面的多少条数据
                map.put("end", index * resultPage.getSize());
                if (index == resultPage.getPageCount()) {//用当前的页数与总的页数比较，如果一样就提示是最后一页。
                    resultPage.setMessage("当前已经是最后一页");
                } else {
                    resultPage.setMessage("当前加载的是第:" + index + "页");
                }
                //获取数据
                List<SelectClient> selectClientList = clientDao.NewBirthday(map);
                //表示查询成功
                resultPage.setCode(200);
                //将数据写到要返回的数据中
                resultPage.setData(selectClientList);
            } else {
                //表示查询失败
                resultPage.setCode(400);
                //表示这一个月内没有客户生日，则表示0位
                resultPage.setCount(0);
                //显示客户生日的条数
                resultPage.setMessage(Time + "到" + NewTime + "有" + resultPage.getCount() + "位客户生日");
            }
        }
        return resultPage;
    }

    /**
     * 用户快到车险的客户提醒(提前一个月提醒)
     *
     * @param userId  用户的userId
     * @param Time    当前的时间
     * @param NewTime 一个月以后的时间
     * @return 戴辆
     */
    @Override
    public ResultPage InsuranceWarn(Integer userId, String Time, String NewTime, Integer index) {
        //获取数据库传来的数据传到controller层中去
        ResultPage resultPage = new ResultPage();
        //创建map函数来来存储参数用于dao层的查询
        Map<String, Object> map = new HashMap<String, Object>();
        //将当前的页码存到resultpage中
        resultPage.setIndex(index);
        //将一页显示多少条数数据，也存到数据中
        resultPage.setSize(5);
        //因为是手机h5项目所以，在分页的时候忽略前面的0条就可以了
        map.put("state", 0);
        //当前的日期是多少
        map.put("Time", Time);
        //一个月之后的日期是多少
        map.put("NewTime", NewTime);
        //查询车险快到了的总条数
        resultPage.setCount(clientDao.InsuranceWarnNumber(map));
        if (resultPage.getCount() > 0) {
            //计算总的页数,(用总的条数除以每页显示的数据，再将其转换成double类型，然后想下取整，再转换成int类型)
            resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
            //如果当前的页数大于总的页数的话，就让其显示最后的一页的数据
            if (index == resultPage.getPageCount() || index > resultPage.getPageCount()) {
                //将查询显示多少条数据的存到map中
                map.put("end", resultPage.getPageCount() * resultPage.getSize());
            } else {
                //将查询显示多少条数据的存到map中
                map.put("end", resultPage.getIndex() * resultPage.getSize());
            }
            //查询对应的数据，然后显示
            List<SelectClient> selectClientList = clientDao.InsuranceWarn(map);
            //表示数据查询成功
            resultPage.setCode(200);
            //将储存存到resultpage中用于前端数据的存储
            resultPage.setMessage("在这个一个月之内总共有：" + resultPage.getPageCount() + "位用户生日");
        } else {
            //当前出现异常或，在这一个月之内没有人生日
            resultPage.setCode(400);
            resultPage.setMessage("在这一个月之内没有人生日");
        }
        return resultPage;
    }

}
