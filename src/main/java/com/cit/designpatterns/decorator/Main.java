package com.cit.designpatterns.decorator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        String sql = "SELECT country_id, country, last_update FROM country WHERE country LIKE ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        MyDataSource dataSource = new MyDataSource();

        try
        {
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "C%");
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                int country_id = rs.getInt(1);
                String country = rs.getString(2);
                java.sql.Timestamp last_update = rs.getTimestamp(3);
                System.out.println("country_id = " + country_id + ", country = " + country + ", last_update = " + last_update);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            JDBCUtils.release(conn, pstmt, rs);
        }
    }
}
