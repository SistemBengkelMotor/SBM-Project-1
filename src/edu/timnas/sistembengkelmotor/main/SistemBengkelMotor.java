package edu.timnas.sistembengkelmotor.main;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import java.sql.SQLException;

public class SistemBengkelMotor {
    public static void main(String[] args) throws SQLException{
                
        SistemBengkelMotorDatabase.getConnection();
        
    }
    
}
