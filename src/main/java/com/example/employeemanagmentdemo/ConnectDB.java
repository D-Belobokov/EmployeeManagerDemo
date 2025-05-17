package com.example.employeemanagmentdemo;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn1 =  DriverManager.getConnection(
                    "jdbc:sqlite:C:\\Users\\D.Belobokov\\IdeaProjects\\EmployeeManagerDemo\\src\\main\\resources\\identifier.sqlite"
            );
                    //("jdbc:mysql://localhost:3306/empldemo",
                    //"root", "root");
            System.out.println(" подключено !");
            JOptionPane.showMessageDialog(null,"База данных подключена");
            return conn1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
