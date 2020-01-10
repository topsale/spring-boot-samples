package com.funtl.spring.hello.moudule.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackgeName: com.funtl.spring.hello.moudule.template
 * @ClassName: JdbcTemplate
 * @Author: Administrator
 * Date: 2020/1/1 0001 18:23
 * project name: spring-boot-alibaba-samples
 * @Version:
 * @Description: jdbc 的模板类
 */
public class JdbcTemplate {
    /**
     * 模拟试下了一个jdbcTemplate模板类，
     * 比如从数据源中获取一个链接，
     * 然后创建语句集，
     * 执行语句集获取结果集，
     * 解析结果集，
     * 最后结果集、语句集、连接的关闭都是固定的流程，
     * 而一个对象的如何映射成一个对象是需要具体的实现，
     * 这个由具体调用类实现对象的映射，
     * 这个步骤是可以重新定义的
     */
    private DataSource dataSource ;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    /**
     * 得到连接
     * @return
     * @throws SQLException
     */
    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    /**
     * 获得标准的语句集
     * @param sql
     * @param connection
     * @return
     * @throws SQLException
     */
    private PreparedStatement getPreparedStatement(String sql,Connection connection) throws SQLException {
        return connection.prepareStatement(sql);
    }

    /**
     * 得到结果集
     * @param preparedStatement
     * @param values
     * @return
     * @throws SQLException
     */
    private ResultSet getResultSet(PreparedStatement preparedStatement,Object[] values) throws SQLException {
        int i=0;
        for (Object value: values){
            preparedStatement.setObject(i++,value);
        }
        return preparedStatement.getResultSet();
    }
    /**
     * 解析结果集
     * @param resultSet
     * @param rowMapper
     * @return
     * @throws Exception
     */
    private List<?>  parsedResultSet(ResultSet resultSet,RowMapper<?> rowMapper) throws Exception {
        int rownumber = 1;
        List<Object> list = new ArrayList<Object>();
        while (resultSet.next()){
            list.add (rowMapper.mapRow(resultSet,rownumber++));
        }
        return  list;
    }
    /**
     * 关闭结果集
     * @param rs
     * @throws SQLException
     */
    private void  closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }
    /**
     * 关闭语句集
     * @param statement
     * @throws SQLException
     */
    private  void closePreparedStatement(PreparedStatement statement ) throws SQLException {
        statement.close();
    }
    /**
     * 关闭连接
     * @param connection
     * @throws SQLException
     */
    private  void closeConnect(Connection connection ) throws SQLException {
        //通常把它放到连接池回收
        connection.close();
    }
    public List<?> executeQuery(String sql , RowMapper<?> mapper , Object[] values){
        try {
            //1.获得连接
            Connection connection =  this.getConnection();
            //2.获取语句集
            PreparedStatement pstm = this.getPreparedStatement(sql,connection);
            //3.执行语句集，获得结果集
            ResultSet rs= this.getResultSet(pstm,values);
            //4.解析结果集
            List<?> list  = this.parsedResultSet(rs,mapper);
            //5.关闭结果集
            this.closeResultSet(rs);
            //6.关闭语句集
            this.closePreparedStatement(pstm);
            //7.关闭连接
            this.closeConnect(connection);
            return  list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
