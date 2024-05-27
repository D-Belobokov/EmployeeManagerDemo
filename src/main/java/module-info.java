module com.example.employeemanagmentdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.commons;
    requires java.sql;
    requires java.desktop;


    opens com.example.employeemanagmentdemo to javafx.fxml;
    exports com.example.employeemanagmentdemo;
}