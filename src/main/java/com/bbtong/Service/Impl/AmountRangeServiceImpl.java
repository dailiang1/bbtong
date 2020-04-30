package com.bbtong.Service.Impl;

import com.bbtong.Dao.AmountRangeDao;
import com.bbtong.Pojo.AmountRange;
import com.bbtong.Service.AmountRangeService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 车保金额类
 */

@Service
public class AmountRangeServiceImpl implements AmountRangeService {

    @Resource
    private AmountRangeDao amountRangeDao;

    /**
     * 查询车保金额的类型
     * @return
     */
    @Override
    public Result SelectAmount() {
        //创建接收实体类的数据
        Result result=new Result();
        //创建车保金额类的数组实体来接受数据
        List<AmountRange> amountRangeList=amountRangeDao.SelectAmount();
        if(amountRangeList.size()>0){
            result.setCode(200);
            result.setMessage("查询成功");
            result.setData(amountRangeList);
        }else{
            result.setCode(400);
            result.setMessage("查询失败");
        }
        return result;
    }
}
