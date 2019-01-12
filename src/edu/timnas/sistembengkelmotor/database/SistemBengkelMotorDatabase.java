package edu.timnas.sistembengkelmotor.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class SistemBengkelMotorDatabase {
    
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/sistembengkelmotor");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
}
