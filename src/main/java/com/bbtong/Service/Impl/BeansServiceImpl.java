package com.bbtong.Service.Impl;

import com.bbtong.Dao.BeansDao;
import com.bbtong.Pojo.Beans;
import com.bbtong.Pojo.BeansUser;
import com.bbtong.Service.BeansService;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 申请和豆的ServiceImpl
 */

@Service
public class BeansServiceImpl implements BeansService {

    @Resource
    private BeansDao beansDao;

    /***
     *根据人车生活卡，申请和豆
     * @param beans controller层传来的参数。(用户的user_id，人车生活的卡号，提交的时间)
     * 戴辆
     */
    @Override
    public Result Submit(Beans beans) {
        //创建Result的实体来接受返回的参数
        Result result = new Result();
        int successful = beansDao.Submit(beans);
        if (successful > 0) {
            result.setCode(200);
            result.setMessage("提交成功，等待审核");
        } else {
            result.setCode(400);
            result.setMessage("提交失败，请重新提交");
        }
        return result;
    }

    /**
     * 查询用户人车生活卡，审核的情况
     *
     * @param userId     用户的ID
     * @param index      用来记录当前的页的页数
     * @param beansState 表示当前当前的状态 (待审核还是已审核，默认是待审核)
     * @return 戴辆
     */
    @Override
    public ResultPage Query(Integer userId, Integer index, Integer beansState) {
        //创建Result的实体来接受返回的参数
        ResultPage resultPage = new ResultPage();
        //一页显示的多少的条数据
        resultPage.setSize(5);
        //当前是多少页
        resultPage.setIndex(index);

        //创建map的实例来查询存储数据
        Map<String, Object> map = new HashMap<String, Object>();
        //那个用户的查询的
        map.put("userId", userId);
        //查询什么状态的数据
        map.put("beansState", beansState);
        //用实体类来接受，有多少条的数据
        resultPage.setCount(beansDao.QueryNumber(map));
        //用来计算当前有多少页
        resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
        if (resultPage.getPageCount() == index) {
            resultPage.setCode(200);
            resultPage.setMessage("当前已经是最后一页");
            map.put("end", resultPage.getSize() * index);
            resultPage.setData(beansDao.Query(map));
            return resultPage;
        }
        //将一页显示多少条数据，存到map中
        map.put("end", resultPage.getSize() * resultPage.getIndex());
        List<Beans> beansList = beansDao.Query(map);
        if (beansList.size() > 0 || beansList.size() == 0) {
            resultPage.setCode(200);
            resultPage.setMessage("查询数据成功");
            resultPage.setData(beansList);
        } else {
            resultPage.setCode(400);
            resultPage.setMessage("查询数据失败");
        }
        return resultPage;
    }


    /**
     * 管理查询数据或显示数据
     *
     * @param index      当前页数为多少页
     * @param beansState 查询什么数据，为待审核数据，还是已审核数据
     * @return 戴辆
     */
    @Override
    public ResultPage SelectQuery(Integer index, Integer beansState) {
        //创建Result的实体来接受返回的参数
        ResultPage resultPage = new ResultPage();
        //创建map函数来存储数据,用于后端的查询
        Map<String, Object> map = new HashMap<String, Object>();
        //将查询什么数据的参数存到map中
        map.put("beansState", beansState);
        //将页数存起来
        resultPage.setIndex(index);
        //一页显示几条数据
        resultPage.setSize(5);
        //用来接受存储，还有多少条待审核的数据
        resultPage.setCount(beansDao.SelectQueryNumber(map));
        //计算总的页数
        resultPage.setPageCount((int) Math.ceil((double) resultPage.getCount() / resultPage.getSize()));
        if (resultPage.getPageCount() == index) {
            resultPage.setCode(200);
            resultPage.setMessage("当前已经是最后一页");
            //忽略多少条数据
            map.put("state", (index - 1) * resultPage.getSize());
            //查询多少条数据
            map.put("end", resultPage.getSize());
            resultPage.setData(beansDao.SelectQuery(map));
            return resultPage;
        }
        //忽略多少条数据
        map.put("state", (index - 1) * resultPage.getSize());
        //查询多少条数据
        map.put("end", resultPage.getSize());
        List<BeansUser> beansList = beansDao.SelectQuery(map);
        if (beansList.size() > 0 || beansList.size() == 0) {
            resultPage.setCode(200);
            resultPage.setMessage("查询数据成功");
            resultPage.setData(beansList);
        } else {
            resultPage.setCode(400);
            resultPage.setMessage("查询数据失败");
        }
        return resultPage;
    }
}
