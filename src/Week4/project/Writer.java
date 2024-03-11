package Week4.project;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Writer {
    void write(ResultSet resultSet) throws SQLException;
}
