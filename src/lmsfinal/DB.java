package lmsfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/lms";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Private constructor to prevent instantiation
    private DB() {
    }

    public static Connection open() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    public static void close(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public static void execute(String sql) {
        try (Connection con = open();
             Statement statement = con.createStatement()) {
            
            // Execute the SQL statement with concatenated values
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public static void handleSQLException(SQLException e) {
        e.printStackTrace(); // Handle the exception according to your needs
    }
}
