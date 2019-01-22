package edu.timnas.sistembengkelmotor.main;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.DetailPembelian;
import edu.timnas.sistembengkelmotor.entity.Jasa;
import edu.timnas.sistembengkelmotor.entity.Kasir;
import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import edu.timnas.sistembengkelmotor.entity.Mekanik;
import edu.timnas.sistembengkelmotor.entity.Merk;
import edu.timnas.sistembengkelmotor.entity.Motor;
import edu.timnas.sistembengkelmotor.entity.Onderdil;
import edu.timnas.sistembengkelmotor.entity.Pelanggan;
import edu.timnas.sistembengkelmotor.entity.Pembelian;
import edu.timnas.sistembengkelmotor.entity.Penjualan;
import edu.timnas.sistembengkelmotor.entity.Rak;
import edu.timnas.sistembengkelmotor.entity.Supplier;
import edu.timnas.sistembengkelmotor.entity.Type;
import edu.timnas.sistembengkelmotor.error.DetailPembelianException;
import edu.timnas.sistembengkelmotor.error.JasaException;
import edu.timnas.sistembengkelmotor.error.KasirException;
import edu.timnas.sistembengkelmotor.error.KategoriOnderdilException;
import edu.timnas.sistembengkelmotor.error.MekanikException;
import edu.timnas.sistembengkelmotor.error.MerkException;
import edu.timnas.sistembengkelmotor.error.MotorException;
import edu.timnas.sistembengkelmotor.error.OnderdilException;
import edu.timnas.sistembengkelmotor.error.PelangganException;
import edu.timnas.sistembengkelmotor.error.PembelianException;
import edu.timnas.sistembengkelmotor.error.PenjualanException;
import edu.timnas.sistembengkelmotor.error.RakException;
import edu.timnas.sistembengkelmotor.error.SupplierException;
import edu.timnas.sistembengkelmotor.error.TypeException;
import edu.timnas.sistembengkelmotor.service.DetailPembelianDao;
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
import java.sql.SQLException;
import java.util.List;

public class SistemBengkelMotor {
    public static void main(String[] args) throws SQLException, 
            KategoriOnderdilException, RakException, MekanikException, 
            MerkException, TypeException, MotorException, JasaException,
            OnderdilException,SupplierException,KasirException,
            PelangganException,PembelianException,DetailPembelianException,
            PenjualanException{
                
//        SistemBengkelMotorDatabase.getConnection();
    /* 
//   Insert data
        KategoriOnderdilDao dao = SistemBengkelMotorDatabase.getKategoriOnderdilDao();
        KategoriOnderdil katon =  new KategoriOnderdil();
        
        katon.setNamaKaton("Busi Motor");
        
        dao.insertKategoriOnderdil(katon);

//    Update data
        KategoriOnderdilDao dao = SistemBengkelMotorDatabase.getKategoriOnderdilDao();
        KategoriOnderdil katon =  dao.getKategoriOnderdil(1);
        
        katon.setNamaKaton("Rem Motor Ninja R");
        
        dao.updateKategoriOnderdil(katon);
    
//  Tampil data
        KategoriOnderdilDao dao = SistemBengkelMotorDatabase.getKategoriOnderdilDao();
                
        List<KategoriOnderdil> list = dao.selectAllKategoriOnderdil();
        
        for (KategoriOnderdil kategoriOnderdil:list) {
            System.out.println("ID   : "+kategoriOnderdil.getIdKaton());
            System.out.println("Nama : "+kategoriOnderdil.getNamaKaton());
        }

//  Delete Data
        KategoriOnderdilDao dao = SistemBengkelMotorDatabase.getKategoriOnderdilDao();
        
        dao.deleteKategoriOnderdil(1);
    */
    
        PenjualanDao dao = SistemBengkelMotorDatabase.getPenjualanDao();
//        Penjualan penjualan = dao.getPenjualan(3);
//        Penjualan penjualan = new Penjualan();
        
//        penjualan.setIdKasir(10);
//        penjualan.setTglPenjualan("20181002");
//        penjualan.setTotalHarga(37500);
//        penjualan.setBayar(50000);
//        penjualan.setKembalian(penjualan.getBayar()-penjualan.getTotalHarga());
//        penjualan.setHargaBeliPerUnit(33999);
//        int subTotal = penjualan.getJumlah()*penjualan.getHargaBeliPerUnit();
//        penjualan.setSubTotalHargaBeli(penjualan.getJumlah()*penjualan.getHargaBeliPerUnit());
//        onderdil.setHargaJual(99090);
//        onderdil.setStok(12);
//        onderdil.setSatuan("paket");
//        
//        dao.deletePenjualan(3);

//        List<Penjualan> list = dao.selectAllPenjualan();
////        
//        for (Penjualan penjualan:list) {
//            System.out.println("idKasir     : "+penjualan.getIdPenjualan());
//            System.out.println("nama        : "+penjualan.getIdKasir());
//            System.out.println("alamat        : "+penjualan.getTglPenjualan());
//            System.out.println("notelp       : "+penjualan.getTotalHarga());
//            System.out.println("notelp       : "+penjualan.getBayar());
//            System.out.println("notelp       : "+penjualan.getKembalian()+"\n");
//        }
        
        
        
    }
    
}
