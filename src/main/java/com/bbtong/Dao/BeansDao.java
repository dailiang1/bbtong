package com.bbtong.Dao;

import com.bbtong.Pojo.Beans;
import com.bbtong.Pojo.BeansExample;
import java.util.List;
import java.util.Map;

import com.bbtong.Pojo.BeansUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 和豆申请表
 */

@Mapper
public interface BeansDao {
    long countByExample(BeansExample example);

    int deleteByExample(BeansExample example);

    int deleteByPrimaryKey(Integer beansId);

    int insert(Beans record);

    int insertSelective(Beans record);

    List<Beans> selectByExample(BeansExample example);

    Beans selectByPrimaryKey(Integer beansId);

    int updateByExampleSelective(@Param("record") Beans record, @Param("example") BeansExample example);

    int updateByExample(@Param("record") Beans record, @Param("example") BeansExample example);

    int updateByPrimaryKeySelective(Beans record);

    int updateByPrimaryKey(Beans record);

    /**
     * 提交和豆的申请，根据人车生活卡。
     * @param beans 这是和豆申请卡的实体类，用来接受数据
     * 戴辆
     */
    int Submit(Beans beans);

    /**
     * 查询用户当前对应的数据
     * @param map
     * @return
     */
    int QueryNumber(Map map);

    /**
     * 查询对应用户，没有审核的和豆申请
     * @param map 中存储用户的user_id,还有index，当前的页数，以及end每页显示的条数
     * @return 戴辆
     */
    List<Beans> Query(Map map);

    /**
     * 管理员查询待审核的商品的条数
     * 戴辆
     */
    int SelectQueryNumber(Map map);

    /**
     * 管理员查询对应的数据，审核的条数或已审核的数据
     * @param map 用来存储条件，待审核还是已核实，还有页数
     * @return
     */
    List<BeansUser> SelectQuery(Map map);

}