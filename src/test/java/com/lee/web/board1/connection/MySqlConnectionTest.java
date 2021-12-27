package com.lee.web.board1.connection;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest("classpath:application.yml")
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
public class MySqlConnectionTest {

    @Autowired
    private DataSource ds;

    @Test
    public void ConnectionTest() {
        try (Connection con = ds.getConnection()) {
            log.info(con + "= 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
