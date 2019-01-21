package edu.timnas.sistembengkelmotor.main;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.Jasa;
import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import edu.timnas.sistembengkelmotor.entity.Mekanik;
import edu.timnas.sistembengkelmotor.entity.Merk;
import edu.timnas.sistembengkelmotor.entity.Motor;
import edu.timnas.sistembengkelmotor.entity.Onderdil;
import edu.timnas.sistembengkelmotor.entity.Rak;
import edu.timnas.sistembengkelmotor.entity.Type;
import edu.timnas.sistembengkelmotor.error.JasaException;
import edu.timnas.sistembengkelmotor.error.KategoriOnderdilException;
import edu.timnas.sistembengkelmotor.error.MekanikException;
import edu.timnas.sistembengkelmotor.error.MerkException;
import edu.timnas.sistembengkelmotor.error.MotorException;
import edu.timnas.sistembengkelmotor.error.OnderdilException;
import edu.timnas.sistembengkelmotor.error.RakException;
import edu.timnas.sistembengkelmotor.error.TypeException;
import edu.timnas.sistembengkelmotor.service.JasaDao;
import edu.timnas.sistembengkelmotor.service.KategoriOnderdilDao;
import edu.timnas.sistembengkelmotor.service.MekanikDao;
import edu.timnas.sistembengkelmotor.service.MerkDao;
import edu.timnas.sistembengkelmotor.service.MotorDao;
import edu.timnas.sistembengkelmotor.service.OnderdilDao;
import edu.timnas.sistembengkelmotor.service.RakDao;
import edu.timnas.sistembengkelmotor.service.TypeDao;
import java.sql.SQLException;
import java.util.List;

public class SistemBengkelMotor {
    public static void main(String[] args) throws SQLException, 
            KategoriOnderdilException, RakException, MekanikException, 
            MerkException, TypeException, MotorException, JasaException,
            OnderdilException{
                
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
    
        OnderdilDao dao = SistemBengkelMotorDatabase.getOnderdilDao();
//        Onderdil onderdil = dao.getOnderdil(4);
//        Onderdil onderdil = new Onderdil();
        
//        onderdil.setIdKaton(0);
//        onderdil.setIdRak(0);
//        onderdil.setNamaOnderdil("Oke Bro");
//        onderdil.setHargaJual(99090);
//        onderdil.setStok(12);
//        onderdil.setSatuan("paket");
//        
//        dao.deleteOnderdil(4);
        
//        List<Onderdil> list = dao.selectAllCombOnderdil();
////        
//        for (Onderdil onderdil:list) {
//            System.out.println("idOnderdil   : "+onderdil.getIdOnderdil());
//            System.out.println("Katon        : "+onderdil.getNamaKaton());
//            System.out.println("Rak          : "+onderdil.getLokasi());
//            System.out.println("Nama Onderdil: "+onderdil.getNamaOnderdil());
//            System.out.println("Harga Jual   : "+onderdil.getHargaJual());
//            System.out.println("Stok         : "+onderdil.getStok());
//            System.out.println("Satuan       : "+onderdil.getSatuan()+"\n");
//        }
        
        
        
    }
    
}
