/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Motor;
import edu.timnas.sistembengkelmotor.error.MotorException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface MotorDao {
    public void insertMotor(Motor motor) throws MotorException;
    public void updateMotor(Motor motor) throws MotorException;
    public void deleteMotor(String nopol) throws MotorException;
    public Motor getMotor(String nopol) throws MotorException;
    public Motor getType(int idType) throws MotorException;
    public List<Motor> selectAllMotor() throws MotorException;
    public List<Motor> selectAllCombMotor() throws MotorException;
}
