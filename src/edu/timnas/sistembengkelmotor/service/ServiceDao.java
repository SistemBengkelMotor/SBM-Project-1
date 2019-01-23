/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Service;
import edu.timnas.sistembengkelmotor.error.ServiceException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface ServiceDao {
    public void insertService(Service service) throws ServiceException;
    public void updateService(Service service) throws ServiceException;
    public void deleteService(Integer idService) throws ServiceException;
    public Service getService(Integer idService) throws ServiceException;
    public Service getServiceNopol(Integer nopol) throws ServiceException;
    public List<Service> selectAllService() throws ServiceException;
}
