package com.funtl.spring.hello.moudule.template;

import java.sql.ResultSet;

//行的映射接口 ，把数据库一行映射为一个对象
public interface RowMapper<T> {
    T  mapRow(ResultSet rs, int rownum) throws  Exception;
}
