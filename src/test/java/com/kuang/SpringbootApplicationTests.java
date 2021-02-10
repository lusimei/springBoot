package com.kuang;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM student_manage.users");
//        System.out.println(maps);
//        DataSource dataSource = jdbcTemplate.getDataSource();
//        System.out.println(dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        System.out.println("最大连接数："+druidDataSource.getMaxActive());
        System.out.println("初始化连接数："+druidDataSource.getInitialSize());
    }

}
