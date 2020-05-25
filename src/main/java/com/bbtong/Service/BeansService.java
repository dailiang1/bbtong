package com.bbtong.Service;

import com.bbtong.Pojo.Beans;
import com.bbtong.Util.Result;
import com.bbtong.Util.ResultPage;

/**
 * 和豆申请表
 */

public interface BeansService {
    /**
     * 根据人车生活卡，申请和豆
     *
     * @param beans controller层传来的参数。(用户的user_id，人车生活的卡号，提交的时间)
     *              戴辆
     */
    Result Submit(Beans beans);

    /***
     *查询对应的用户的，人车生活卡和豆申请情况
     * @param userId 用户的ID
     * @param index 用来记录当前的页的页数
     * @param beansState 表示当前当前的状态 (待审核还是已审核，默认是待审核)
     * 戴辆
     */
    ResultPage Query(Integer userId, Integer index, Integer beansState);

    /***
     * 管理人员查询对应的数据，查看数据或审核数据
     * @param index 当前页数为多少页
     * @param beansState 查询什么数据，为待审核数据，还是已审核数据
     * @return 戴辆
     */
    ResultPage SelectQuery(Integer index, Integer beansState);
}
