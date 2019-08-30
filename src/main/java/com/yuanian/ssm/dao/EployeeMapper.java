package com.yuanian.ssm.dao;

import com.yuanian.ssm.bean.Eployee;
import com.yuanian.ssm.bean.EployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EployeeMapper {
    long countByExample(EployeeExample example);

    int deleteByExample(EployeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Eployee record);

    int insertSelective(Eployee record);

    List<Eployee> selectByExample(EployeeExample example);

    Eployee selectByPrimaryKey(Integer empId);

    List<Eployee> selectByExampleWithDept(EployeeExample example);

    Eployee selectByPrimaryKeyWithDept(Integer empId);


    int updateByExampleSelective(@Param("record") Eployee record, @Param("example") EployeeExample example);

    int updateByExample(@Param("record") Eployee record, @Param("example") EployeeExample example);

    int updateByPrimaryKeySelective(Eployee record);

    int updateByPrimaryKey(Eployee record);
}