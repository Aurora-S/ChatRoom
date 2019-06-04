
package com.qq.server.model;

import com.qq.server.db.SqlHelper;

import java.sql.ResultSet;

/**
 * 用户表数据模型,用它完成对用户的各种操作。
 * 这里主要编写项目需要的业务操作
 * @since 1.0.0
 */
public class UserModel {
    /**
     *
     * @param uid 用户编号
     * @param p 用户密码
     * @return 该用户的职位，如果该用户不存在则返回""（空）
     */
    public String checkUser(String uid,String p){
        String zhiwei="";
        SqlHelper sp=null;
        try{

            //组织sql语句和参数列表
            String sql="select zhiwei.zhiwei from login,zhiwei where login.id=zhiwei.id and login.id=? " +
                    "and login.id=?";
            String paras[]={uid,p};
            sp=new SqlHelper();
            ResultSet rs=sp.query(sql,paras);
            if(rs.next())
            {
                //则取出职位
                zhiwei=rs.getString(1);//1:select zhiwei.zhiwei from...
            }
        }catch(Exception e){

        }finally{
            sp.close();
            //关于上面的rs是否关闭：java是引用传递，把sp关闭了就相当于也关了rs
        }

        return zhiwei;
    }
}
