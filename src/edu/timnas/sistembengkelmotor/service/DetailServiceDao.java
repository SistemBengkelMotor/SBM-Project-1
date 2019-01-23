/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.DetailService;
import edu.timnas.sistembengkelmotor.error.DetailServiceException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface DetailServiceDao {
    public void insertDetailService(DetailService detailService) throws DetailServiceException;
    public void updateDetailService(DetailService detailService) throws DetailServiceException;
    public void deleteDetailService(Integer idDetailService) throws DetailServiceException;
    public DetailService getDetailService(Integer idDetailService) throws DetailServiceException;
    public DetailService getService(Integer idService) throws DetailServiceException;
    public List<DetailService> selectAllDetailService() throws DetailServiceException;
}
