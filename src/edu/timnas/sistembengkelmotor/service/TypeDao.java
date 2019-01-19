/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Type;
import edu.timnas.sistembengkelmotor.error.TypeException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface TypeDao {
    public void insertType(Type type) throws TypeException;
    public void updateType(Type type) throws TypeException;
    public void deleteType(Integer idType) throws TypeException;
    public Type getType(Integer idType) throws TypeException;
    public Type getType(int idMerk) throws TypeException;
    public List<Type> selectAllType() throws TypeException;
}
