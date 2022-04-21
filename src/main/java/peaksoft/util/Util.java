package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private Connection connection;

    public Util() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dao",
                "postgres", "annembenim");
    }

    public Connection getConnection() {
        // ushul methoddgo connectino kaitarynyzdar
        return connection;
    }
}
