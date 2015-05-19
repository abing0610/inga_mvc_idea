package com.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import java.io.InputStream;

/**
 * Created by abing on 2015/5/18.
 */
public class SqlSessionTest {
    public  static  void  main(String[] args) throws  Exception{
        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

//        ApplicationContext
//        WebApplicationContext
    }
}
