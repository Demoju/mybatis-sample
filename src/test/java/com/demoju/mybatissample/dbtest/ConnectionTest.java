package com.demoju.mybatissample.dbtest;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class ConnectionTest {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void DBConnection() {
        try {
            Connection con = sqlSessionFactory.openSession().getConnection();
            System.out.println("DB Connection Success");
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
