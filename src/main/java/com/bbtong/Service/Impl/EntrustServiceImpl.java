package com.bbtong.Service.Impl;

import com.bbtong.Base.*;
import com.bbtong.Dao.EntrustDao;
import com.bbtong.Pojo.DeliveryOrder;
import com.bbtong.Pojo.Entrust;
import com.bbtong.Service.EntrustService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultHave;
import com.bbtong.Util.ResultPage;
import org.apache.commons.lang3.StringUtils;
import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.apache.taglibs.standard.tag.common.sql.DataSourceUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 委托订单表
 */

@Service
public class EntrustServiceImpl implements EntrustService {

    /**
     * 委托订单的dao层
     */
    @Resource
    private EntrustDao entrustDao;

    /**
     * 用户发布委托订单
     *
     * @param entrust 用来存储controller层传来的数据
     * @return 戴辆
     */
    @Override
    public Result AddEntrust(Entrust entrust) {
        //创建实体来接收数据
        Result result = new Result();
        //创建数据来接受后台返回的结果
        int zhi = entrustDao.AddEntrust(entrust);
        //用来判断是否添加成功，如果成功的话，就返回结果成功
        if (zhi > 0) {
            result.setCode(200);
            result.setMessage("发布成功");
        } else {
            result.setCode(400);
            result.setMessage("发布失败");
        }
        return result;
    }

    /**
     * 大家保险的用户查询自己的委托单
     *
     * @param userId 用户的ID
     * @param index  当前的页数
     * @return 戴辆
     */
    @Override
    public ResultPage DaSelectEntrust(Integer userId, Integer index) {
        //创建函数来接受数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来接受数据
        Map<String, Object> map = new HashMap<String, Object>();
        //设置一页显示多少条数据
        resultPage.setSize(5);
        //设置当前的页码
        resultPage.setIndex(index);
        //将数据存到map数组中用于查询总的条数，以及页数
        map.put("userId", userId);
        map.put("state", 0);
        //将返回的条数用resultPage的数据接收
        resultPage.setCount(entrustDao.DaSelectEntrustNumber(map));
        //计算总的页数,先计算总的页数，然后向下取整，再将其转换成int类型
        resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
        //如果当前页数为总页数，则表示查询到了最后一页，显示最后一页的数据
        if (index == resultPage.getPageCount() || index > resultPage.getPageCount()) {
            map.put("end", resultPage.getSize() * resultPage.getPageCount());
        } else {
            map.put("end", resultPage.getSize() * index);
        }
        //创建数组来接受对应的数据
        List<DaEntrust> daEntrustList = entrustDao.DaSelectEntrust(map);
        //判断是否查到了数据，来进行操作
        if (daEntrustList.size() > 0) {
            //查到了数据，对于数组的数据，应该用foreach循环来循环显示
            for (DaEntrust item : daEntrustList) {
                //如果没有人对此单有意向的话就让其为0
                if (null == item.getNewUserId()) {
                    item.setNumber(0);
                    break;//break跳出当前的循环，进入下面的循环
                }
                //创建一个数组来接受有多少人数
                String list[] = item.getNewUserId().split(",");
                //将有多少人有意向存到对应人数字段中
                item.setNumber(list.length);
            }
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setData(daEntrustList);
        } else {
            resultPage.setCode(200);
            resultPage.setMessage("当前没有数据");
        }
        return resultPage;
    }

    /**
     * 大家保险的用户查询自己对应的委托信息
     *
     * @param userId    用户的ID
     * @param entrustId 委托订单的ID
     * @return 戴辆
     */
    @Override
    public Result DaParticulars(Integer userId, Integer entrustId) {
        //创建对应接受数据的实体
        Result result = new Result();
        //创建map的函数来进行数据的操作
        Map<String, Object> map = new HashMap<String, Object>();
        //将userId存到map中用于sql的查询操作
        map.put("userId", userId);
        //将entrustId存到map中用于sql的查询
        map.put("entrustId", entrustId);
        //查询当前订单是否已经派送人了
        Entrust entrust = entrustDao.Entrust(map);
        if (entrust.getFinallyUserId() != null) {
            result.setCode(200);
            result.setMessage("改委托已经派单，请您联系接单人");
            return result;
        }
        //查询对应订单的信息的和人数
        List<DaParticulars> daParticularsList = entrustDao.DaParticulars(map);
        if (daParticularsList.size() > 0) {//判断数组是不是为空，如果数组为空的话，则表示没有数据
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(daParticularsList);
        } else {
            result.setCode(400);
            result.setMessage("没有用户或当前异常");
        }
        return result;
    }

    /**
     * 大家保险的用户将委托派给指定的人
     *
     * @param userId               发布委托人的ID
     * @param finallyUserId        接收委托人的ID
     * @param entrustId            委托的ID
     * @param friendName           接单人的姓名
     * @param friendPhone          接单人的电话
     * @param InsuranceCompanyName 接单人保险公司的名称
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultPage SendOrders(Integer userId, Integer finallyUserId, Integer entrustId, String friendName, String friendPhone, String InsuranceCompanyName) {
        //创建resultpage的实体来接收数据
        ResultPage resultPage = new ResultPage();
        //创建map函数来接受参数，进行操作
        Map<String, Object> map = new HashMap<String, Object>();
        //将userId和newUserId，以及entrustId存到map中进行操作
        map.put("userId", userId);//委托人的ID
        //查询委托人的姓名和电话
        Information information = entrustDao.Information(map);
        map.put("userName", information.getUserName());//委托人的姓名
        map.put("userPhone", information.getUserPhone());//委托人的电话
        map.put("userInsuranceCompanyName", information.getInsuranceCompanyName());//委托人的保险公司
        map.put("finallyUserId", finallyUserId);//接单人的ID
        map.put("entrustId", entrustId);//委托的ID
        map.put("friendName", friendName);//接单人的姓名
        map.put("friendPhone", friendPhone);//接单人的电话
        map.put("insuranceCompanyName", InsuranceCompanyName);//接单人保险公司名称
        try {
            //第一步将委托派送给指定的人，并且将委托的状态变成已经接单，并且接受返回的结果，
            int UpdateEntrust = entrustDao.UpdateEntrust(map);
            //第二步将除了接单的人之外的其他人，变的可以有意向委托
            int UpdateNewUserId = entrustDao.UpdateNewUserId(map);
            //第三步将两个人确认好友关系
            int AddFriend = entrustDao.AddFriend(map);
            //第四步将信息写入到接单表中
            int AddOrder = entrustDao.AddOrder(map);
            //第五步将接单人可以接单的状态修改成不可以接单
            int UpdateOrder = entrustDao.UpdateOrder(map);
            resultPage.setCode(200);
            resultPage.setMessage("派单成功");
        } catch (Exception e) {
//            resultPage.setCode(300);
//            resultPage.setMessage("没有指派成功");
//            throw new ArithmeticException(e.getMessage());
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultPage.setCode(300);
            resultPage.setMessage("出现异常");
        }
        return resultPage;
    }

    /**
     * 委托人查询自己发布的委托
     *
     * @param userId 委托人的ID
     * @return 戴辆
     */
    @Override
    public Result IssueRecord(Integer userId) {
        //创建实体类来接收查询的数据,并且返回数据给controller层
        Result result = new Result();
        //创建函数来接受数据,entrustlist中存的数据
        List<Entrust> entrustList = entrustDao.IssueRecord(userId);
        if (entrustList.size() > 0) {//判断数组的长度是否大0，如果大于0 的话，则说明有数据，
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(entrustList);
        } else {//如果进入else 则说明没有数据
            result.setCode(400);
            result.setMessage("没有数据，或出现了异常");
        }
        return result;
    }

    /**
     * 用户查询自己接过的委托
     *
     * @param userId 用户的ID
     * @return 戴辆
     */
    @Override
    public Result OrderRecord(Integer userId) {
        //创建实体类来接受，返回的数据和将数据执行的结果返回给controller层
        Result result = new Result();
        //创建对应的list数组来接受数据
        List<Entrust> entrustList = entrustDao.OrderRecord(userId);
        if (entrustList.size() > 0) {//判断数组的长度是否大0，如果大于0 的话，则说明有数据，
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(entrustList);
        } else {//如果进入else 则说明没有数据
            result.setCode(400);
            result.setMessage("没有数据，或出现了异常");
        }
        return result;
    }

    /**
     * 用户有意向委托
     *
     * @param userId    用户的ID
     * @param entrustId 委托的ID
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultHave HaveEntrust(Integer userId, Integer entrustId) {
        //创建实体类来操作数据
        ResultHave resultHave = new ResultHave();
        //创建map函数来进行数据的操作
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//将用户Id写入到map中
        map.put("entrustId", entrustId);//将委托ID写入到map中
        try {
            //第一步 先查询数据库 1.用户是否还能有意向 2.是否还能接单 3.是否开发通了年费 4.诚信是否合格
            HaveUser haveUser = entrustDao.SelectUser(map);
            //1.判断诚信是否达标
            if (haveUser.getUserIntegrity() == 0) {
                resultHave.setCode(100002);
                resultHave.setMessage("当前诚信不合格");
                return resultHave;
            }
            if (haveUser.getTestState() == 0) {
                resultHave.setCode(10000);
                resultHave.setMessage("实名审核中");
                return resultHave;
            }
            //2.判断其开通年费没有
//            if (haveUser.getUserMemberState() == 0) {
//                resultHave.setCode(100001);
//                resultHave.setMessage("请先开通年费");
//                return resultHave;
//            }
            //3.判断他当前是否还可以接单
            if (haveUser.getUserOrderState().equals("1")) {
                resultHave.setCode(100003);
                resultHave.setMessage("请先完成对应要处理的订单");
                return resultHave;
            }
            //4.判断他当前是否还有意向的机会
            if (haveUser.getIntentionState().equals("1")) {
                resultHave.setCode(100004);
                resultHave.setMessage("当前已经没有，有意向的机会了");
                return resultHave;
            }
            //第二步 通过委托ID查询对应的所有有意向人的ID
            String newUserId = entrustDao.NewUserId(map);
            //创建一个数组来接受数据
            String[] newUser = newUserId.split(",");
            //创建foreach循环来循环函数
            for (String item : newUser
            ) {
                if (item.equals(userId.toString())) {
                    resultHave.setCode(100009);
                    resultHave.setMessage("当前已经意向了");
                    return resultHave;
                }
            }
            //判断长度是否大于0，如果大于零则说明不是第一个添加到数组中的时候就需要加","号,如果是第一个就直接添加
            if (newUser.length > 0) {
                newUserId = newUserId + "," + userId;
            } else {
                //将int类型转换成string类型
                newUserId = userId.toString();
            }
            //创建map函数来将数据存储起来
            map.put("newUserId", newUserId);

            //第三步 将用户写入到有意向的用户中
            int updatenewUserId = entrustDao.Update(map);
            if (updatenewUserId == 0) {
                resultHave.setCode(300);
                resultHave.setMessage("出现异常");
                return resultHave;
            }
            //第四步 将用户自己的有意向机会改成1(表示不可以)
            int Intention = entrustDao.Intention(map);
            if (Intention == 0) {
                resultHave.setCode(300);
                resultHave.setMessage("出现异常");
                return resultHave;
            }
            resultHave.setCode(200);
            resultHave.setMessage("添加成功");
        } catch (Exception e) {//出现异常的话就捕捉，然后事务回滚
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            resultHave.setCode(300);
            resultHave.setMessage("出现异常");
        }
        return resultHave;
    }

    /**
     * 用户查看自己有意向委托的信息
     *
     * @param userId 用户的ID
     * @return 戴辆
     */
    @Override
    public ResultHave UserIntention(Integer userId) {
        //创建实体类来接受数据
        ResultHave resultHave = new ResultHave();
        //创建实体来接受，用户有意向并且还没有接单的委托
        UserIntention userIntention = entrustDao.UserIntention(userId);
        //判断有没有查到数据
        if (null != userIntention) {
            resultHave.setCode(200);
            resultHave.setMessage("成功");
            resultHave.setData(userIntention);
        } else {
            resultHave.setCode(300);
            resultHave.setMessage("您当前没有有意向委托，或者出现异常");
        }
        return resultHave;
    }

    /**
     * 用户查询自己当前有意向的委托信息
     *
     * @param userId    用户的ID
     * @param entrustId 当前要取消委托的ID
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public Result OffIntention(Integer userId, Integer entrustId) {
        //创建实体类result来接受数据
        Result result = new Result();
        //创建map的函数来接受参数
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//将userId的数据存到map 中
        map.put("entrustId", entrustId);//将entrustId 的数据存到map中
        //第一步通过委托的ID获取，当前订单所有的有意向的人
        String newUserId = entrustDao.NewUserId(map);
        //创建一个数组来接受数据
        String[] newUser = newUserId.split(",");
        //将数组转换成list数组
        List<String> list = Arrays.asList(newUser);
        //将数组转换成Arrays数组
        List<String> arrayList = new ArrayList<String>(list);
        //便利循环数组数据
        for (String item : list) {
            //如果要删除的数据和循环的数据相同，就删除这个指定的数据
            if (item.equals(userId.toString())) {
                arrayList.remove(userId.toString());
            }
        }
        //利用apeach.comment.lang3中的StringUtils方法中的strip将数据转换成数组，然后再将[]去掉。
        newUserId = StringUtils.strip(arrayList.toString().replace(" ", ""), "[]");
        //将数据写入到map中
        map.put("newUserId", newUserId);
        try {
            //第二步 将修改之后的数据写入到数据库中
            int DateNewUserId = entrustDao.DateNewUserId(map);
            //第三步将用户的是否有意向委托修改成可以
            int DateIntention = entrustDao.DateIntention(map);
            result.setCode(200);
            result.setMessage("取消成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 用户查询他当前正在处理的委托
     *
     * @param userId 用户的userId
     * @return 戴辆
     */
    @Override
    public ResultHave QueryEntrust(Integer userId) {
        //创建实体类来返回数据
        ResultHave resultHave = new ResultHave();
        //创建map函数来接受数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将userId存到map中
        map.put("userId", userId);
        //查询数据
        UserIntention userIntention = entrustDao.QueryEntrust(map);
        if (null != userIntention) {
            resultHave.setCode(200);
            resultHave.setMessage("查询成功");
            resultHave.setData(userIntention);
        } else {
            resultHave.setCode(400);
            resultHave.setMessage("查询失败");
        }
        return resultHave;
    }

    /**
     * 用户完成委托之后确认
     *
     * @param userId             发布委托用户的ID
     * @param newUserId          接单人的ID
     * @param entrustId          委托的ID
     * @param entrustReturnMoney 需要还单的金额
     * @param entrustReturnTime  规定还单的期限
     * @return 戴辆
     */
    @Transactional(rollbackFor = Exception.class)//事务的注解，当方法中出现异常的时候事务回滚。
    @Override
    public Result Accomplish(Integer userId, Integer newUserId, Integer entrustId, Double entrustReturnMoney, Integer entrustReturnTime) {
        //创建result来返回数据和存储数据
        Result result = new Result();
        //创建map函数来存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//将userId存到map中
        map.put("newUserId", newUserId);//将newUserId存到map中
        map.put("entrustId", entrustId);//将entrustId存到map中
        map.put("entrustReturnMoney", entrustReturnMoney);//将entrustReturnMoney存到map中
        //获取当前日期
        Date date = new Date();
        //创建Calendar实例
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);   //设置当前时间
        //在当前的日期上增加对应的天数
        cal.add(Calendar.DAY_OF_WEEK, entrustReturnTime);
        //将时间格式化成yyyy-MM-dd HH:mm:ss的格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将设置好的时间存到map 中
        map.put("entrustReturnTime", format.format(cal.getTime()));
        try {
            //第一步 将委托的状态修改成待审核完成
            int AlterState = entrustDao.AlterState(map);
            //第二步 将信息写入到还单表中
            int SaveAlso = entrustDao.SaveAlso(map);
            //判断是不是等于1，如果等于1的话，则说明没问题，如果不等于1的话则说明sql中出现了错误
            if (SaveAlso != 1) {
                throw new RuntimeException("错误信息");
            }
            result.setCode(200);
            result.setMessage("委托确认成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 委托人确认审核对应的委托是否完成了，如果完成了的话，就将委托的状态修改
     *
     * @param userId    委托人的ID
     * @param entrustId 委托的ID
     * @return 戴辆
     */
    @Transactional
    @Override
    public Result DaAffirm(Integer userId, Integer entrustId) {
        //创建result实体来接受数据
        Result result = new Result();
        //创建map函数来操作数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将userId存到map中
        map.put("userId", userId);
        //将entrustId存到map参数中
        map.put("entrustId", entrustId);
        //将委托的状态修改
        try {
            int DaAffirm = entrustDao.DaAffirm(map);
            if (DaAffirm != 1) {
                throw new RuntimeException("错误信息");
            }
            result.setCode(200);
            result.setMessage("完成成功");
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            result.setCode(300);
            result.setMessage("出现异常");
        }
        return result;
    }

    /**
     * 用户查询正在处理委托的还单记录
     *
     * @param userId    用户ID
     * @param entrustId 当前正在处理的委托的ID
     * @return 戴辆
     */
    @Transactional
    @Override
    public Result UserSelectDeliveryOrder(Integer userId, Integer entrustId) {
        //创建实体来来进行数据操作
        Result result = new Result();
        //创建map函数来存储数据，进行操作
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", userId);//将userId存到map的数据中
        map.put("entrustId", entrustId);//将entrustId存到map数据中
        try {
            //创建list数组来接受数据
            List<DeliveryOrder> deliveryOrderList = entrustDao.selectDeliveryOrder(map);
            if (deliveryOrderList.size() > 0) {//判断有没有查到数据，没有查到数据的话，数组的长度就不大于0
                result.setMessage("查询查询成功");
            } else {
                result.setMessage("当前没有数据");
            }
            result.setCode(200);
            result.setData(deliveryOrderList);
        } catch (Exception e) {//出现异常就会进入catch
            result.setCode(500);
            result.setMessage("出现未知错误");
        }
        return result;
    }

    /**
     * 用户还单的时候提交 信息写入到数据库中去
     *
     * @param newUserId           还单人的ID
     * @param deliveryOrderNumber 委托的车牌号
     * @param deliveryOrderMoney  还的委托的金额
     * @return 戴辆
     */
    @Transactional
    @Override
    public ResultHave UserAlso(Integer newUserId, String deliveryOrderNumber, Double deliveryOrderMoney) {
        //创建实体来接受数据 和 操作数据
        ResultHave resultHave = new ResultHave();
        //创建map函数来存储数据用于数据库的查询
        Map<String, Object> map = new HashMap<String, Object>();
        //将还委托单的人的ID存到map中，用来查询(待还单的Id和待还单的用户ID)
        map.put("newUserId", newUserId);
        //防止有人跳过数据审核，直接调用端口来提交数据，判断这一单是否已经完成
        Integer entrustState = entrustDao.entrustState(map);
        if (entrustState == null || entrustState != 3) {
            resultHave.setCode(100011);
            resultHave.setMessage("非法访问");
            return resultHave;
        }
        //将还单委托的车牌号存到map中
        map.put("deliveryOrderNumber", deliveryOrderNumber);
        //将还单的金额存到map中
        map.put("deliveryOrderMoney", deliveryOrderMoney);
        //获取当前的时间，将当前时间存到数据库中
        Date now = new Date();
        //设置时间的编码格式
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //将当前时间存到map中，也就是提交委托的时间
        map.put("deliveryGradeTime", dateFormat.format(now));
        try {
            //第一步 先通过还单人的ID 查询数据
            AlsoId alsoId = entrustDao.AlsoId(map);
            //将查到的数据存到map中用于后面的操作
            map.put("newEntrustId", alsoId.getNewEntrustId());//待还单的ID
            map.put("userId", alsoId.getUserId());//待还单的用户(即发布委托的委托人)
            //第二步将委托写入到数据库中，也就是存到还单表中
            int cun = entrustDao.AddDeliveryOrder(map);
            resultHave.setCode(200);
            resultHave.setMessage("提交成功，等待审核");
        } catch (Exception e) {
            //表示未知错误
            resultHave.setCode(100010);
            resultHave.setMessage("出现未知错误");
            return resultHave;
        }
        return resultHave;
    }

    /**
     * 大家保险用户查看自己已经完成了的委托(历史委托方法)
     *
     * @param userId 用户id
     * @return 戴辆
     */
    @Override
    public Result GetDaHistoryEntrust(Integer userId) {
        //创建实体类，来存储数据库返回的数据
        Result result = new Result();
        //创建list数组来接受已经完成的委托数据
        List<GetDaEntrust> getDaEntrustList = entrustDao.GetDaHistoryEntru(userId);
        if (getDaEntrustList.size() > 0 && getDaEntrustList.size() != 0) {
            result.setCode(200);//表示成功
            result.setMessage("查询成功");
            //将数据存到data中
            result.setData(getDaEntrustList);
        } else {
            result.setCode(400);
            result.setMessage("没有数据");
        }
        return result;
    }

    /**
     * 大家保险用户 查看对应委托还单的还单信息
     *
     * @param user_Id   用户的id
     * @param entrustId 委托的id
     * @return 戴辆
     */
    @Override
    public Result GetOrderEntrust(Integer user_Id, Integer entrustId) {
        //创建实体类来接受操作数据
        Result result = new Result();
        //创建map数据在接受数据
        Map<String, Object> map = new HashMap<String, Object>();
        //将userId存到map中
        map.put("userId", user_Id);
        //将entrustId存到map中
        map.put("entrustId", entrustId);
        //通过userId和entrustId去查询数据,用list数组来接收返回的数据
        List<OrderEntrust> orderEntrustList = entrustDao.GetOrderEntrust(map);
        //判断数据是否正常，如果数组小于0则说明数据错误
        if (orderEntrustList.size() > 0) {
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(orderEntrustList);
        } else {
            result.setCode(500);
            result.setMessage("内部错误");
        }
        return result;
    }

    /**
     * 其他保险的用户 进入到委托大厅
     *
     * @param userId             用户的id
     * @param insuranceCompanyId 对应保险公司的id
     * @return
     */
    @Override
    public ResultPage GetEntrust(Integer userId, Integer insuranceCompanyId) {
        //创建接受数据和返回数据的实体
        ResultPage resultPage = new ResultPage();
        //创建map函数来村吹数据，用于数据库的查询
        Map<String, Object> map = new HashMap<String, Object>();
        //将用户的信息存到map中
        map.put("userId", userId);//用户的userid
        map.put("insuranceCompanyId", insuranceCompanyId);//用户保险公司的id
        //第一步 先通过查询有多少条数据
        int number = entrustDao.GetEntrustNumber(map);
        //查询条数之后，判断条数是不是大于0，如果不大于0的话，则说明没有数据，直接存储数据，然后返回
        if (number != 0) {
            //如果条数不等于0则说明有数据，将数据查出来，然后存储返回给前台
            List<AtEntrust> atEntrustList = entrustDao.GetEntrust(map);
            //将查询数据，存储返回给controller层
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setData(atEntrustList);
        } else {
            resultPage.setCode(200);
            resultPage.setMessage("查询成功");
            resultPage.setCount(number);
        }
        return resultPage;
    }

    /**
     * 其他保险 查看历史委托 还单订单明细
     *
     * @param userId    用户的useriD
     * @param entrustId 查询委托的id
     * @return 戴辆
     */
    @Override
    public Result GetOrder(Integer userId, Integer entrustId) {
        //创建Result来接受和存储数据
        Result result = new Result();
        //创建map函数来存储数据用于数据库查询
        Map<String, Object> map = new HashMap<String, Object>();
        //将数据存到map函数中
        map.put("userId", userId);//用户的userId
        map.put("entrustId", entrustId);//对应委托的id
        // 创建对应list数组来接受函数
        List<OrderEntrust> orderEntrustList = entrustDao.GetOrder(map);
        //通过list数组的长度来判断有没有数据，如果没有数据的话，就说明内部错误
        if (orderEntrustList.size() > 0) {
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(orderEntrustList);
        } else {
            result.setCode(500);
            result.setMessage("内部错误，请稍后再试");
        }
        return result;
    }

    /**
     * 其他保险用户 提交完成委托申请
     *
     * @param userId    用户id
     * @param entrustId 委托的id
     * @return 戴辆
     */
    @Transactional
    @Override
    public Result PutEntrust(Integer userId, Integer entrustId) {
        //创建Result的实体来接受和操作数据
        Result result = new Result();
        //创建map函数来存储数据用于数据库查询
        Map<String, Object> map = new HashMap<String, Object>();
        //将数据存到map函数中
        map.put("userId", userId);//用户的userId
        map.put("entrustId", entrustId);//对应委托的id
        //将委托的状态修改成2，表示待确认完成
        try {
            int zhi = entrustDao.PutEntrust(map);
            result.setCode(200);
            result.setMessage("修改成功");
        } catch (Exception e) {
            //表示未知错误
            result.setCode(500);
            result.setMessage("出现未知错误");
            return result;
        }
        return result;
    }

    /**
     * 大家保险用户处理 用户提交委托完成的申请
     *
     * @param userId    用户id
     * @param entrustId 委托的id
     * @return
     */
    @Transactional
    @Override
    public Result daPutEntrust(Integer userId, Integer entrustId) {
        //创建Result的实体来接受和操作数据
        Result result = new Result();
        //创建map函数来存储数据用于数据库查询
        Map<String, Object> map = new HashMap<String, Object>();
        //将数据存到map函数中
        map.put("userId", userId);//用户的userId
        map.put("entrustId", entrustId);//对应委托的id
        //将委托的状态修改成2，表示待确认完成
        try {
            int zhi = entrustDao.daPutEntrust(map);
            result.setCode(200);
            result.setMessage("修改成功");
        } catch (Exception e) {
            //表示未知错误
            result.setCode(500);
            result.setMessage("出现未知错误");
            return result;
        }
        return result;
    }
}
