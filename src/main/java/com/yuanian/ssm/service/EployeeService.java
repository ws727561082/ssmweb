package com.yuanian.ssm.service;

import com.yuanian.ssm.bean.Eployee;
import com.yuanian.ssm.bean.EployeeExample;
import com.yuanian.ssm.bean.Msg;
import com.yuanian.ssm.dao.EployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EployeeService {
    @Autowired
    EployeeMapper eployeeMapper;
    public List<Eployee> getAll(){
        return eployeeMapper.selectByExampleWithDept(null);
    }

    public Msg saveEmp(Eployee eployee) {
        eployeeMapper.insertSelective(eployee);
        return Msg.success();
    }

    /**
     * 检验用户名是否可用
     *
     * @param empName
     * @return  true：代表当前姓名可用   fasle：不可用
     */
    public boolean checkUser(String empName) {
        // TODO Auto-generated method stub
        EployeeExample example = new EployeeExample();
        EployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmpNameEqualTo(empName);
        long count = eployeeMapper.countByExample(example);
        return count == 0;
    }

    /**
     * 按照员工id查询员工
     * @param id
     * @return
     */
    public Eployee getEmp(Integer id) {
        // TODO Auto-generated method stub
        Eployee employee = eployeeMapper.selectByPrimaryKey(id);
        return employee;
    }

    public void updateEmp(Eployee eployee) {
        // TODO Auto-generated method stub
        eployeeMapper.updateByPrimaryKeySelective(eployee);
    }

    public void deleteEmp(Integer id) {
        // TODO Auto-generated method stub
        eployeeMapper.deleteByPrimaryKey(id);
    }

    public void deleteBatch(List<Integer> ids) {
        // TODO Auto-generated method stub
        EployeeExample example = new EployeeExample();
        EployeeExample.Criteria criteria = example.createCriteria();
        //delete from xxx where emp_id in(1,2,3)
        criteria.andEmpIdIn(ids);
        eployeeMapper.deleteByExample(example);
    }

}
