package edu.timnas.sistembengkelmotor.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.timnas.sistembengkelmotor.impl.JasaDaoImpl;
import edu.timnas.sistembengkelmotor.impl.KategoriOnderdilDaoImpl;
import edu.timnas.sistembengkelmotor.impl.MekanikDaoImpl;
import edu.timnas.sistembengkelmotor.impl.MerkDaoImpl;
import edu.timnas.sistembengkelmotor.impl.MotorDaoImpl;
import edu.timnas.sistembengkelmotor.impl.RakDaoImpl;
import edu.timnas.sistembengkelmotor.impl.TypeDaoImpl;
import edu.timnas.sistembengkelmotor.service.JasaDao;
import edu.timnas.sistembengkelmotor.service.KategoriOnderdilDao;
import edu.timnas.sistembengkelmotor.service.MekanikDao;
import edu.timnas.sistembengkelmotor.service.MerkDao;
import edu.timnas.sistembengkelmotor.service.MotorDao;
import edu.timnas.sistembengkelmotor.service.RakDao;
import edu.timnas.sistembengkelmotor.service.TypeDao;
import java.sql.Connection;
import java.sql.SQLException;

public class SistemBengkelMotorDatabase {
    
    private static Connection connection;
//  objek yang sudah dideklarasikan itu satu tapi dapat diakses oleh semua class
    private static KategoriOnderdilDao kategoriOnderdilDao;
    private static RakDao rakDao;
    private static MekanikDao mekanikDao;
    private static MerkDao merkDao;
    private static TypeDao typeDao;
    private static MotorDao motorDao;
    private static JasaDao jasaDao;
    
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
    
//Mekanik
    public static MekanikDao getMekanikDao() throws SQLException{
        if (mekanikDao == null) {
            mekanikDao = new MekanikDaoImpl(getConnection());   
        }
        return mekanikDao;
    }
    
//Merk
    public static MerkDao getMerkDao() throws SQLException{
        if (merkDao == null) {
            merkDao = new MerkDaoImpl(getConnection());   
        }
        return merkDao;
    }
    
//Type
    public static TypeDao getTypeDao() throws SQLException{
        if (typeDao == null) {
            typeDao = new TypeDaoImpl(getConnection());   
        }
        return typeDao;
    }
//Motor
    public static MotorDao getMotorDao() throws SQLException{
        if (motorDao == null) {
            motorDao = new MotorDaoImpl(getConnection());   
        }
        return motorDao;
    }
    
//Jasa
    public static JasaDao getJasaDao() throws SQLException{
        if (jasaDao == null) {
            jasaDao = new JasaDaoImpl(getConnection());   
        }
        return jasaDao;
    }
    
}
