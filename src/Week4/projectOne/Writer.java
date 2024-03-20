package Week4.projectOne;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Writer {
    void write(ResultSet resultSet) throws SQLException;
}
