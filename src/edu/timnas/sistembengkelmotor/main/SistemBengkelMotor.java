package edu.timnas.sistembengkelmotor.main;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.DetailPembelian;
import edu.timnas.sistembengkelmotor.entity.DetailPenjualan;
import edu.timnas.sistembengkelmotor.entity.DetailService;
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
import edu.timnas.sistembengkelmotor.entity.Service;
import edu.timnas.sistembengkelmotor.entity.Supplier;
import edu.timnas.sistembengkelmotor.entity.Type;
import edu.timnas.sistembengkelmotor.error.DetailPembelianException;
import edu.timnas.sistembengkelmotor.error.DetailPenjualanException;
import edu.timnas.sistembengkelmotor.error.DetailServiceException;
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
import edu.timnas.sistembengkelmotor.error.ServiceException;
import edu.timnas.sistembengkelmotor.error.SupplierException;
import edu.timnas.sistembengkelmotor.error.TypeException;
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
import edu.timnas.sistembengkelmotor.service.ServiceDao;
import edu.timnas.sistembengkelmotor.service.SupplierDao;
import edu.timnas.sistembengkelmotor.service.TypeDao;
import edu.timnas.sistembengkelmotor.view.KategoriOnderdilView;
import edu.timnas.sistembengkelmotor.view.MainViewKasir;
import edu.timnas.sistembengkelmotor.view.MainViewKategoriOnderdil;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class SistemBengkelMotor {
    public static void main(String[] args) throws SQLException, 
            KategoriOnderdilException, RakException, MekanikException, 
            MerkException, TypeException, MotorException, JasaException,
            OnderdilException,SupplierException,KasirException,
            PelangganException,PembelianException,DetailPembelianException,
            PenjualanException,DetailPenjualanException,DetailServiceException,
            ServiceException{
                
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
    
//        ServiceDao dao = SistemBengkelMotorDatabase.getServiceDao();
//        Service service = dao.getService(2);
//        Service service = new Service();
        
//        service.setIdMekanik(2);
//        service.setNopol("wakwaw");
//        service.setIdPelanggan(2);
//        service.setIdKasir(2);
//        service.setTglService("180919");
//        service.setTglSelesai("190101");
//        service.setTotalHarga(275000);
//        service.setBayar(250000);
//        service.setKembalian(service.getBayar()-service.getTotalHarga());
//        service.setKembalian(service.getBayar()-service.getTotalHarga());
//        service.setHargaBeliPerUnit(33999);
//        int subTotalHarga = service.getJumlah()*service.getHargaBeliPerUnit();
//        service.setSubTotalHargaBeli(service.getJumlah()*service.getHargaBeliPerUnit());
//        onderdil.setHargaJual(99090);
//        onderdil.setStok(12);
//        onderdil.setSatuan("paket");
//        
//        dao.deleteService(2);

//        List<Service> list = dao.selectAllService();
//////        
//        for (Service service:list) {
//            System.out.println("idKasir     : "+service.getIdService());
//            System.out.println("nama        : "+service.getIdMekanik());
//            System.out.println("nama        : "+service.getNopol());
//            System.out.println("notelp       : "+service.getIdPelanggan());
//            System.out.println("notelp       : "+service.getIdKasir());
//            System.out.println("alamat        : "+service.getTglService());
//            System.out.println("alamat        : "+service.getTglSelesai());
//            System.out.println("notelp       : "+service.getTotalHarga());
//            System.out.println("notelp       : "+service.getBayar());
//            System.out.println("notelp       : "+service.getKembalian()+"\n");
//        }

       /*
        KategoriOnderdilView ko = new KategoriOnderdilView();
        MainViewKategoriOnderdil mv = new MainViewKategoriOnderdil();
        
        mv.setVisible(true);
       */
       
        // bisa menggunakan Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
//                    MainViewKategoriOnderdil kat = new MainViewKategoriOnderdil();
                    MainViewKasir kas = new MainViewKasir();
                    kas.loadDatabase();
                    kas.setVisible(true);
                } catch (SQLException e) {
                } catch (KasirException ex) {
                    Logger.getLogger(SistemBengkelMotor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    
}
