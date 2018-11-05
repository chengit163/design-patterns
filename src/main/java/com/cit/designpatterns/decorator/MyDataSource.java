package com.cit.designpatterns.decorator;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

public class MyDataSource implements DataSource
{
    //1.创建一个容器用于存储Connection对象
    private static LinkedList<Connection> pool = new LinkedList<Connection>();

    //2.创建5个连接放到容器中去
    static
    {
        for (int i = 0; i < 5; i++)
        {
            Connection conn = JDBCUtils.getConnection();
            //放入池子中connection对象已经经过改造了
            MyConnection myconn = new MyConnection(conn, pool);
            pool.add(myconn);
        }
    }

    /**
     * 归还连接对象到连接池中去
     */
    public void backConnection(Connection conn)
    {
        pool.add(conn);
    }

    /**
     * 重写获取连接的方法
     */
    @Override
    public Connection getConnection() throws SQLException
    {
        Connection conn = null;
        //3.使用前先判断
        if (pool.size() == 0)
        {
            //4.池子里面没有，我们再创建一些
            for (int i = 0; i < 5; i++)
            {
                conn = JDBCUtils.getConnection();
                //放入池子中connection对象已经经过改造了
                MyConnection myconn = new MyConnection(conn, pool);
                pool.add(myconn);
            }
        }
        //5.从池子里面获取一个连接对象Connection
        conn = pool.remove(0);
        return conn;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException
    {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException
    {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException
    {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException
    {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException
    {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException
    {

    }

    @Override
    public int getLoginTimeout() throws SQLException
    {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException
    {
        return null;
    }
}
