package lmsfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class DB {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/lms";
    private static final String USER = "root";
    private static final String PASSWORD = "";

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

    public static void executeUpdate(String sql) {
        try (Connection con = open(); Statement statement = con.createStatement()) {

            statement.executeUpdate(sql);

        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public static ResultSet executeQuery(String sql, Object... params) {
        try (Connection con = open(); PreparedStatement preparedStatement = con.prepareStatement(sql)) {

            for (int i = 0; i < params.length; i++) {
                preparedStatement.setObject(i + 1, params[i]);
            }

            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            handleSQLException(e);
            return null;
        }
    }

    public static ResultSet executeQuery(String sql) {
        try (Connection con = open(); PreparedStatement preparedStatement = con.prepareStatement(sql)) {
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            handleSQLException(e);
            return null;
        }
    }

    public static void handleSQLException(SQLException e) {
        e.printStackTrace();
    }
}
