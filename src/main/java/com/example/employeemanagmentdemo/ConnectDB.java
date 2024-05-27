package com.example.employeemanagmentdemo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn1 = (Connection) DriverManager.getConnection
                    ("jdbc:mysql://localhost/employeemanagment",
                    "root", "1705");
            System.out.println(" подключено !");
            JOptionPane.showMessageDialog(null,"База данных подключена");
            return conn1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
