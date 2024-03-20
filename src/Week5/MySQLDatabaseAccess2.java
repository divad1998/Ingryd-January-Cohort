package Week5;

import Week4.projectOne.DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDatabaseAccess2 implements DatabaseAccess {
    private String url;
    MySQLDatabaseAccess2() {
        this.url = "jdbc:mysql://localhost:3306/developer";
    }
    @Override
    public Object connectToDatabase() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(this.url, "david", "david");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
