package edu.timnas.sistembengkelmotor.main;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import edu.timnas.sistembengkelmotor.error.KategoriOnderdilException;
import edu.timnas.sistembengkelmotor.service.KategoriOnderdilDao;
import java.sql.SQLException;

public class SistemBengkelMotor {
    public static void main(String[] args) throws SQLException, KategoriOnderdilException{
                
//        SistemBengkelMotorDatabase.getConnection();
        
        KategoriOnderdilDao dao = SistemBengkelMotorDatabase.kategoriOnderdilDao();
        KategoriOnderdil katon =  new KategoriOnderdil();
        
        katon.setNamaKaton("Busi Motor");
        
        dao.insertKategoriOnderdil(katon);
        
    }
    
}
