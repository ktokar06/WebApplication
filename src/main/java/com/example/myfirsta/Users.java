package com.example.myfirsta;

import java.util.jar.Attributes;

public class Users {
    private  String Name;
    private  String LastName;
    private  String UserName;
    private  String Password;
    private  String Laocation;
    private  String Gender;


    public Users(String name, String lastName, String userName, String password, String laocation, String gender) {
        Name = name;
        LastName = lastName;
        UserName = userName;
        Password = password;
        Laocation = laocation;
        Gender = gender;
    }

    public Users() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLaocation() {
        return Laocation;
    }

    public void setLaocation(String laocation) {
        Laocation = laocation;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}

