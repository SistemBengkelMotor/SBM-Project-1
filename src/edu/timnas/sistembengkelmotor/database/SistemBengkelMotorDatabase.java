package edu.timnas.sistembengkelmotor.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.timnas.sistembengkelmotor.impl.KategoriOnderdilDaoImpl;
import edu.timnas.sistembengkelmotor.impl.RakDaoImpl;
import edu.timnas.sistembengkelmotor.service.KategoriOnderdilDao;
import edu.timnas.sistembengkelmotor.service.RakDao;
import java.sql.Connection;
import java.sql.SQLException;

public class SistemBengkelMotorDatabase {
    
    private static Connection connection;
//  objek yang sudah dideklarasikan itu satu tapi dapat diakses oleh semua class
    private static KategoriOnderdilDao kategoriOnderdilDao;
    private static RakDao rakDao;
    
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
    
//KategoriOnderdil
    public static KategoriOnderdilDao getKategoriOnderdilDao() throws SQLException{
        if (kategoriOnderdilDao == null) {
            kategoriOnderdilDao = new KategoriOnderdilDaoImpl(getConnection());
        }
        return kategoriOnderdilDao;
    }
    
//Rak    
    public static RakDao getRakDao() throws SQLException{
        if (rakDao == null) {
            rakDao = new RakDaoImpl(getConnection());   
        }
        return rakDao;
    }
    
    
}
