package Week4.projectOne;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsoleWriter implements Writer {
    @Override
    public void write(ResultSet resultSet) {
        try (resultSet) {
            System.out.println("Id \tName \tAge \tlocation \tSkill");
            while (resultSet.next()) {
                //accessing each row
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String location = resultSet.getString(4);
                String skill = resultSet.getString(5);
                System.out.printf("%d \t%s \t%d \t%s \t%s\n", id, name, age, location, skill);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}