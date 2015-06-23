package com.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by abing on 2015/5/20.
 */
@Service("service1")
public class UseJdbcTransiction {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public  static  void  main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springTransaction.xml");
        UseJdbcTransiction serviec = (UseJdbcTransiction) ctx.getBean("service1");
        JdbcTemplate jdbcTemplate1 = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        BasicDataSource basicDataSource =(BasicDataSource) jdbcTemplate1.getDataSource();

        System.out.println("autoCommit : " + basicDataSource.getDefaultAutoCommit());
        jdbcTemplate1.execute("INSERT INTO TUSER VALUES('tom','123456','10')");

//        serviec.


    }
}
