package Week4.projectOne;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Developers developers = new DevelopersImpl();
        ResultSet resultSet = developers.loadDevelopers();
    }
}
