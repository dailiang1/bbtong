package com.bbtong.Dao;

import com.bbtong.Pojo.dj.Agent;
import com.bbtong.Pojo.dj.AgentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgentDao {
    long countByExample(AgentExample example);

    int deleteByExample(AgentExample example);

    int deleteByPrimaryKey(Integer agentId);

    int insert(Agent record);

    int insertSelective(Agent record);

    List<Agent> selectByExample(AgentExample example);

    Agent selectByPrimaryKey(Integer agentId);

    int updateByExampleSelective(@Param("record") Agent record, @Param("example") AgentExample example);

    int updateByExample(@Param("record") Agent record, @Param("example") AgentExample example);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKey(Agent record);
}