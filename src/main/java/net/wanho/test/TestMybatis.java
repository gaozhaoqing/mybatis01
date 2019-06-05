package net.wanho.test;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class TestMybatis {


    private SqlSession sqlSession;

    @Before
    public void before() {

        InputStream inputStream = TestMybatis.class.getClassLoader().getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
//        创建会话
         sqlSession = sf.openSession();


    }




}
