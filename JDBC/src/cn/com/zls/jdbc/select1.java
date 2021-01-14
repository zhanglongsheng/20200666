package cn.com.zls.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class select1 {
    public static void main(String[] args) throws Exception{
        //1.获取数据库驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取链接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "123456");
        //3.获取链接数据库对象
        Statement statement = connection.createStatement();
        //4.执行sql并返回结果集

        ResultSet resultSet = statement.executeQuery("select * from city");

        //5.遍历结果集
        while (resultSet.next()){
           /* int cityId = resultSet.getInt("cityId");
            String cityName = resultSet.getString("cityName");
            System.out.println(cityId+"   "+cityName+"    ");*/
            int cityId = resultSet.getInt(1);
            String cityName =resultSet.getString(2);
            System.out.println(cityId+"   "+cityName+"    ");
        }
        //6.关闭资源
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println("我是大笨蛋");
    }


}
