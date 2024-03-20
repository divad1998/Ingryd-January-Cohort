package Week5;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExercise {
    static void persistViaPreparedStatement() {
        ConsoleSource consoleSource = new ConsoleSource();
        MySQLDatabaseAccess2 db = new MySQLDatabaseAccess2();
        try(Connection connection = (Connection) db.connectToDatabase()) {
            PreparedStatement statement = connection.prepareStatement("CREATE Table IF NOT EXISTS developers(id Integer, name Text, age Integer, location Text, skill Text)");
            statement.execute();
            int id = 1;
            for (int i = 0;; i++) {
                String name = consoleSource.promptForData("name");
                if (name.equalsIgnoreCase("null")) {
                    statement.close();
                    break;
                }
                int age = Integer.parseInt(consoleSource.promptForData("age"));
                String location = consoleSource.promptForData("location");
                if (location.equalsIgnoreCase("null")) {
                    statement.close();
                    break;
                }
                String skill = consoleSource.promptForData("skill");
                if (skill.equalsIgnoreCase("null")) {
                    statement.close();
                    break;
                }

                statement = connection.prepareStatement("INSERT into developers(id, name, age, location, skill) values(?, ?, ?, ?, ?)");
                statement.setInt(1, id);
                statement.setString(2, name);
                statement.setInt(3, age);
                statement.setString(4, location);
                statement.setString(5, skill);

                statement.execute();
                id++;
            }
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        persistViaPreparedStatement();
    }
}
