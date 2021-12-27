package com.lee.web.board1.connection;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
public class MapperTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void MapperTest() throws Exception{
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            log.info(sqlSession + " = mybatis 연결 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
