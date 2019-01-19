package edu.timnas.sistembengkelmotor.main;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import edu.timnas.sistembengkelmotor.entity.Mekanik;
import edu.timnas.sistembengkelmotor.entity.Merk;
import edu.timnas.sistembengkelmotor.entity.Rak;
import edu.timnas.sistembengkelmotor.error.KategoriOnderdilException;
import edu.timnas.sistembengkelmotor.error.MekanikException;
import edu.timnas.sistembengkelmotor.error.MerkException;
import edu.timnas.sistembengkelmotor.error.RakException;
import edu.timnas.sistembengkelmotor.service.KategoriOnderdilDao;
import edu.timnas.sistembengkelmotor.service.MekanikDao;
import edu.timnas.sistembengkelmotor.service.MerkDao;
import edu.timnas.sistembengkelmotor.service.RakDao;
import java.sql.SQLException;
import java.util.List;

public class SistemBengkelMotor {
    public static void main(String[] args) throws SQLException, 
            KategoriOnderdilException, RakException, MekanikException, 
            MerkException{
                
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
    
        MerkDao dao = SistemBengkelMotorDatabase.getMerkDao();
        
        List<Merk> list = dao.selectAllMerk();
        
        for (Merk merk:list) {
            System.out.println("ID : "+merk.getIdMerk());
            System.out.println("Nama : "+merk.getNamaMerk());
        }
        
    }
    
}
