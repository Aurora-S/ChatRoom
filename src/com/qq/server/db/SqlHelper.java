
package com.qq.server.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * 对数据库操作的类
 * 对数据库的操作，就是crud（增加、读取查询、修改、删除
 */
public class SqlHelper {

    //定义需要的对象
    PreparedStatement ps=null;
    ResultSet rs=null;
    Connection ct=null;
    String driverName="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/proD?useUnicode=true&characterEncoding=UTF-8";
    //?serverTimezone=GMT%2B8&useSSL=false
    String user="root";
    String passwd="mysql@1999";


    //构造函数，初始化ct
    public SqlHelper()
    {
        try{
            //加载驱动
            Class.forName(driverName);
            ct=DriverManager.getConnection(url,user,passwd);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public ResultSet query(String sql,String []paras){
        try{
            ps=ct.prepareStatement(sql);
            //对sql的参数赋值
            for(int i=0;i<paras.length;i++){
                ps.setString(i+1,paras[i]);
            }
            rs=ps.executeQuery();
        }catch(Exception e){

        }
        return rs;
    }

    //关闭资源的方法
    public void close(){
        try{
            if(rs!=null)
                rs.close();
            if(ps!=null)
                ps.close();
            if(ct!=null)
                ct.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
