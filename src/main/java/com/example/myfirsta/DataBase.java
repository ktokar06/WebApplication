package com.example.myfirsta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class DataBase extends  Configs{
    Connection dbConnection;

    public  Connection getDbConnection()
            throws  ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = getConnection(connectionString,
                dbUser, dbPass);

        return dbConnection;
    }
    public  void SingUpUsers(Users users)
    {
        String insert = "INSERT  INTO " + Const.USER_TABLE + "(" +
                Const.USER_NAME + "," + Const.USER_LASTNAME + "," +
                Const.USER_USERNAME + "," + Const.USER_PASSWORD + "," +
                Const.USER_LAOCATION + "," + Const.USER_GENDER + ")" +
                "VALUES(?,?,?,?,?,?)";



        try {
            PreparedStatement prSt;
            prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, users.getName());
            prSt.setString(2, users.getLastName());
            prSt.setString(3, users.getUserName());
            prSt.setString(4,users.getPassword());
            prSt.setString(5, users.getLaocation());
            prSt.setString(6, users.getGender());
            int i;
            i = prSt.executeUpdate();
        }
        catch (SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public  ResultSet getUsers(Users users)
    {
        ResultSet resultSet = null;

        String select = " SELECT * FROM " + Const.USER_TABLE + " WHERE " +
                Const.USER_USERNAME + " =? AND " + Const.USER_PASSWORD + "=?";

        try {
            PreparedStatement prSt;
            prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, users.getUserName());
            prSt.setString(2, users.getPassword());

             resultSet = prSt.executeQuery();
        }
        catch (SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return resultSet;
    }
}
