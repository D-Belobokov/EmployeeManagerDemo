package com.example.employeemanagmentdemo.myTest;

import com.example.employeemanagmentdemo.ConnectDB;

import java.sql.Connection;

public class testDb {
    public static void main(String[] args) {
        Connection connection = ConnectDB.ConnectDB();
    }
}
