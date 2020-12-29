package cn.com.zls.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Drvier2 {
    public static void main(String[] args) throws  Exception{
        //1.注册驱动，加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获得链接
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root" ;
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

        if (connection !=null){
            System.out.println("yes" );
        } else{
            System.out.println("no");
        }
       //3.获得执行sql语句的对象
        Statement statement = connection.createStatement();
      //SQL语句
        String sql = "insert into city (cityId,cityName) values (50,'')" ;
      //返回值，结果
        int result = statement.executeUpdate(sql);

        System.out.println(result);

    }
}
