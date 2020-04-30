package com.bbtong.Service.Impl;

import com.bbtong.Dao.TypeDao;
import com.bbtong.Pojo.Type;
import com.bbtong.Service.TypeService;
import com.bbtong.Util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/***
 * 客户类型表
 */

@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeDao typeDao;

    /**
     * 创建查询客户类型表的数据
     * @return 戴辆
     */
    @Override
    public Result SelectType() {
        //创建数组来查询客户类型表中的数据
        Result result=new Result();
        List<Type> typeList=typeDao.SelectType();
        if(typeList.size()>0){//判断是否查询到了数据
            result.setCode(200);//200表示成功
            result.setMessage("查询成功");
            result.setData(typeList);
        }else{
            result.setCode(400);
            result.setMessage("查询失败");
        }
        return result;
    }
}
