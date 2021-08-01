package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/db";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "E629rn2868!&";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Не удалось установить подключение к БД.");
        }
    }

    public Connection getConnection(){
        Connection connection = null;
        try {
            return   connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Не удалось установить подключение к БД.");
        }
    }
}

