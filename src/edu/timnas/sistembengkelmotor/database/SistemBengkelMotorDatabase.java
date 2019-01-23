package edu.timnas.sistembengkelmotor.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.timnas.sistembengkelmotor.entity.Kasir;
import edu.timnas.sistembengkelmotor.impl.DetailPembelianDaoImpl;
import edu.timnas.sistembengkelmotor.impl.DetailPenjualanDaoImpl;
import edu.timnas.sistembengkelmotor.impl.DetailServiceDaoImpl;
import edu.timnas.sistembengkelmotor.impl.JasaDaoImpl;
import edu.timnas.sistembengkelmotor.impl.KasirDaoImpl;
import edu.timnas.sistembengkelmotor.impl.KategoriOnderdilDaoImpl;
import edu.timnas.sistembengkelmotor.impl.MekanikDaoImpl;
import edu.timnas.sistembengkelmotor.impl.MerkDaoImpl;
import edu.timnas.sistembengkelmotor.impl.MotorDaoImpl;
import edu.timnas.sistembengkelmotor.impl.OnderdilDaoImpl;
import edu.timnas.sistembengkelmotor.impl.PelangganDaoImpl;
import edu.timnas.sistembengkelmotor.impl.PembelianDaoImpl;
import edu.timnas.sistembengkelmotor.impl.PenjualanDaoImpl;
import edu.timnas.sistembengkelmotor.impl.RakDaoImpl;
import edu.timnas.sistembengkelmotor.impl.SupplierDaoImpl;
import edu.timnas.sistembengkelmotor.impl.TypeDaoImpl;
import edu.timnas.sistembengkelmotor.service.DetailPembelianDao;
import edu.timnas.sistembengkelmotor.service.DetailPenjualanDao;
import edu.timnas.sistembengkelmotor.service.DetailServiceDao;
import edu.timnas.sistembengkelmotor.service.JasaDao;
import edu.timnas.sistembengkelmotor.service.KasirDao;
import edu.timnas.sistembengkelmotor.service.KategoriOnderdilDao;
import edu.timnas.sistembengkelmotor.service.MekanikDao;
import edu.timnas.sistembengkelmotor.service.MerkDao;
import edu.timnas.sistembengkelmotor.service.MotorDao;
import edu.timnas.sistembengkelmotor.service.OnderdilDao;
import edu.timnas.sistembengkelmotor.service.PelangganDao;
import edu.timnas.sistembengkelmotor.service.PembelianDao;
import edu.timnas.sistembengkelmotor.service.PenjualanDao;
import edu.timnas.sistembengkelmotor.service.RakDao;
import edu.timnas.sistembengkelmotor.service.SupplierDao;
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
    private static OnderdilDao onderdilDao;
    private static SupplierDao supplierDao;
    private static KasirDao kasirDao;
    private static PelangganDao pelangganDao;
    private static PembelianDao pembelianDao;
    private static DetailPembelianDao detailPembelianDao;
    private static PenjualanDao penjualanDao;
    private static DetailPenjualanDao detailPenjualanDao;
    private static DetailServiceDao detailServiceDao;
    
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
    
//Onderdil
    public static OnderdilDao getOnderdilDao() throws SQLException{
        if (onderdilDao == null) {
            onderdilDao = new OnderdilDaoImpl(getConnection());   
        }
        return onderdilDao;
    }
    
//Supplier
    public static SupplierDao getSupplierDao() throws SQLException{
        if (supplierDao == null) {
            supplierDao = new SupplierDaoImpl(getConnection());   
        }
        return supplierDao;
    }
    
//Kasir
    public static KasirDao getKasirDao() throws SQLException{
        if (kasirDao == null) {
            kasirDao = new KasirDaoImpl(getConnection());   
        }
        return kasirDao;
    }
    
//Pelanggan
    public static PelangganDao getPelangganDao() throws SQLException{
        if (pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl(getConnection());   
        }
        return pelangganDao;
    }
    
//Pembelian
    public static PembelianDao getPembelianDao() throws SQLException{
        if (pembelianDao == null) {
            pembelianDao = new PembelianDaoImpl(getConnection());   
        }
        return pembelianDao;
    }
    
//Detail Pembelian
    public static DetailPembelianDao getDetailPembelianDao() throws SQLException{
        if (detailPembelianDao == null) {
            detailPembelianDao = new DetailPembelianDaoImpl(getConnection());   
        }
        return detailPembelianDao;
    }
    
//Penjualan
    public static PenjualanDao getPenjualanDao() throws SQLException{
        if (penjualanDao == null) {
            penjualanDao = new PenjualanDaoImpl(getConnection());   
        }
        return penjualanDao;
    }
    
//DetailPenjualan
    public static DetailPenjualanDao getDetailPenjualanDao() throws SQLException{
        if (detailPenjualanDao == null) {
            detailPenjualanDao = new DetailPenjualanDaoImpl(getConnection());   
        }
        return detailPenjualanDao;
    }
    
//DetailService
    public static DetailServiceDao getDetailServiceDao() throws SQLException{
        if (detailServiceDao == null) {
            detailServiceDao = new DetailServiceDaoImpl(getConnection());   
        }
        return detailServiceDao;
    }
    
}
