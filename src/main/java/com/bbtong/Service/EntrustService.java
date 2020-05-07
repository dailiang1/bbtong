package com.bbtong.Service;

import com.bbtong.Pojo.Entrust;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;

/***
 * 委托订单表
 */

public interface EntrustService {
    /**
     * 客户发布委托的方法
     * @param entrust 用来存储controller层传来的数据
     * @return
     */
    Result AddEntrust(Entrust entrust);

    /**
     * 大家保险查询自己的委托
     * @param userId 用户的ID
     * @param index 当前的页数
     * @return 戴辆
     */
    ResultPage DaSelectEntrust(Integer userId,Integer index);
}
