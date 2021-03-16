package com.funtl.spring.hello.moudule.template;

import java.sql.ResultSet;
import java.util.List;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.template
 * @ClassName: MerberDao
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:24
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description:
 */
public class MerberDao {
    //为什么不继承，主要是为了解耦
    //这里没有传直接的数据源 ，这里可以是mysql或者oracle的数据源都可以
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);
    public List<?> query(){
        String sql = "select * from t_member";

        return jdbcTemplate.executeQuery(sql, new RowMapper<Merber>() {
            @Override
            public Merber mapRow(ResultSet rs, int rownum) throws Exception {
                Merber merber = new Merber();
                merber.setUserName(rs.getString("username"));
                merber.setPassword(rs.getString("password"));
                merber.setNickName(rs.getString("nickname"));
                merber.setAge(rs.getInt("age"));
                merber.setAddr(rs.getString("addr"));
                return merber;
            }
        },null);
    }
}
