package Week4.project;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Developers developers = new DevelopersImpl();
        ResultSet resultSet = developers.loadDevelopers();
        Writer writer = new ConsoleWriter();
        writer.write(resultSet);
    }
}
