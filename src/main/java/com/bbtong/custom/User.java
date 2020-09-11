package com.bbtong.custom;

import com.bbtong.Dao.UserDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 用来判断用户资格的类
 */
@Repository
public class User {

    /**
     * 创建userdao的实体类，用来调用查询对应的数据
     */
    @Resource
    private UserDao userDao;

    /**
     * 查询用户 是否存在并且为大家保险的用户。
     *
     * @param userId 用户的id
     */
    public Integer djUser(Integer userId) {
        //创建一个变量为code 用来返回数据 当数据为10001 表示:用户存在，并且为大家保险用户、当数据为10002 表示用户不存在、当数据为10003 表示用户存在但是 不是大家保险用户、10004表示出现错误。
        Integer code = null;
        //创建一个map函数用来存储userId
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("userId", userId);//将userId存到map函数中
        try {
            //第一步 判断用户是不是存在
            int exist = userDao.ExistUser(map);
            if (exist == 0) {//如果为0的话则说明没有查询到账号
                code = 10002;//表示用户不存在
                return code;
            }
            //第二步 判断用户是不是大家保险用户
            int condition = userDao.ConditionUser(map);
            if (condition == 0) {//如果为0话则说明没有查询到账号
                code = 10003;
                return code;
            }
            code = 10001;
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            code = 10004;//表示出现错误
        }
        //将数据返回出去
        return code;
    }

    /**
     * 通过用户的id 查询用户对应的名称
     * @return
     */
    public String UserName(Integer userId){
        return userDao.userName(userId);
    }
}
