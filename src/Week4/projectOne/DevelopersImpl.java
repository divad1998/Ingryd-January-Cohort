package Week4.projectOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DevelopersImpl implements Developers {
    @Override
    public ResultSet loadDevelopers() {
        DatabaseAccess databaseAccess = new MySqlDatabaseAccess();
        Statement statement = (Statement) databaseAccess.connectToDatabase();
        ResultSet resultSet = null;
        FileSource fileSource = new FileSource("/home/divad/Documents/Programming/Java/Ingryd January Cohort/project.txt");
        try (BufferedReader reader = fileSource.getReader()) {
            String createTableQuery = "CREATE Table IF NOT EXISTS developers(id Integer, name Text, age Integer, location Text, skill Text)";
            statement.execute(createTableQuery);
            //read file
            String line;
            int id = 1;
            while ((line = reader.readLine()) != null) {
                String[] strArray = line.split(", ");
                String name = strArray[0];
                int age = Integer.parseInt(strArray[1]);
                String location = strArray[2];
                String skill = strArray[3].replace("#", "");
                //write to db: name, age, location, skill
                String createDeveloperQuery = String.format("INSERT into developers(id, name, age, location, skill) values(%d, '%s', %d, '%s', '%s') ", id, name, age, location, skill);
                statement.execute(createDeveloperQuery);
                id++;
            }
            //fetch developers data in db
            String getDevelopersQuery = "SELECT * FROM developers";
            resultSet = statement.executeQuery(getDevelopersQuery);
        } catch (SQLException | IOException e) {
            System.out.println(e.getMessage());
        }
        return resultSet;
    }
}