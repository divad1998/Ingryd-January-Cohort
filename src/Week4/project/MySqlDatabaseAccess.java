package Week4.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDatabaseAccess implements DatabaseAccess {
    private String url;
    MySqlDatabaseAccess() {
        this.url = "jdbc:mysql://localhost:3306/developer";
    }

    public Statement connectToDatabase() {
        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection(this.url, "david", "david");
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return statement;
    }
}
