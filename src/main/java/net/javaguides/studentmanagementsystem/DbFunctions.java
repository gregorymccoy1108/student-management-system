package net.javaguides.studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbFunctions {

    private final String user = "postgres";
    private final String password = "2524131Omg@";

    public Connection connectToDb(String dbname) {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, password);
            if(conn != null) {
                System.out.println("Connection Established");
            }else {
                System.out.println("Connection Failed");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

}
