package com.cit.designpatterns.flyweight;

import com.cit.designpatterns.decorator.JDBCUtils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBInitInfo
{
    public static List<DBbean> beans = null;

    static
    {
        beans = new ArrayList<DBbean>();
        try
        {
            // 通过类加载器的方法获得文件输入流
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
            Properties props = new Properties();
            props.load(is);
            //
            DBbean Mysql = new DBbean();
            Mysql.setDriverName(props.getProperty("db.driver"));
            Mysql.setUrl(props.getProperty("db.url"));
            Mysql.setUserName(props.getProperty("db.username"));
            Mysql.setPassword(props.getProperty("db.password"));
            Mysql.setMinConnections(5);
            Mysql.setMaxConnections(100);
            Mysql.setPoolName("MySQL_Pool");
            beans.add(Mysql);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}