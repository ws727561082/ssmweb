//package com.yuanian.ssm.test;
//
//import com.yuanian.ssm.bean.Department;
//import com.yuanian.ssm.bean.Eployee;
//import com.yuanian.ssm.dao.DepartmentMapper;
//import com.yuanian.ssm.dao.EployeeMapper;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.UUID;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:applicationContext.xml"})
//public class MapperTest {
//    @Autowired
//    SqlSession sqlSession;
//    @Autowired
//    DepartmentMapper departmentMapper;
//    @Autowired
//    EployeeMapper eployeeMapper;
//    @Test
//    public void testCRUD(){
//        System.out.println(departmentMapper);
//        EployeeMapper mapper=sqlSession.getMapper(EployeeMapper.class);
//        for(int i=0;i<1000;i++){
//            String uid=UUID.randomUUID().toString().substring(0,5)+i;
//            mapper.insertSelective(new Eployee(null,"uid","M",uid+"@wangshuai",1));
//
//        }
//        System.out.println("批量完成");
////        eployeeMapper.insertSelective(new Eployee(null,"Jerry","M","aaa@qq.com",2));
////        departmentMapper.insertSelective(new Department(null,"划水用浆部"));
////        departmentMapper.insertSelective(new Department(null,"划水不用桨部"));
///* 测试department*/
//        //创建SpringIOC容器
////        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
////        DepartmentMapper bean=ioc.getBean(DepartmentMapper.class);
//    }
//}
