package Week4.project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public interface DatabaseAccess {
    /**
     * connects to the database and returns a database access object
     *
     * @return
     *
     */
    Object connectToDatabase();
}
