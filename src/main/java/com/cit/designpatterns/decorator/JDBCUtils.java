package com.cit.designpatterns.decorator;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils
{
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static
    {
        try
        {
            // 通过类加载器的方法获得文件输入流
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
            Properties props = new Properties();
            props.load(is);
            driver = props.getProperty("db.driver");
            url = props.getProperty("db.url");
            username = props.getProperty("db.username");
            password = props.getProperty("db.password");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接方法
     *
     * @return
     */
    public static Connection getConnection()
    {
        Connection conn = null;
        try
        {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 释放资源方法
     *
     * @param conn
     * @param pstmt
     * @param rs
     */
    public static void release(Connection conn, PreparedStatement pstmt, ResultSet rs)
    {
        if (rs != null)
        {
            try
            {
                rs.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        if (pstmt != null)
        {
            try
            {
                pstmt.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        if (conn != null)
        {
            try
            {
                conn.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
