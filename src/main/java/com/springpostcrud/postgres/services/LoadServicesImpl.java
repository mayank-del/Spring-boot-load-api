package com.springpostcrud.postgres.services;
import com.springpostcrud.postgres.dao.LoadApiDao;
import com.springpostcrud.postgres.entities.LoadApi;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.springpostcrud.postgres.services.LoadServices;

@Service
public class LoadServicesImpl implements LoadServices{

    @Autowired
    private LoadApiDao loadApiDao;
    
    public List<LoadApi> getLoads() {
        // TODO Auto-generated method stub
        return  loadApiDao.findAll();
    }

    
    public LoadApi getLoad(long loadId) {
        // TODO Auto-generated method stub
        return loadApiDao.findById(loadId).orElse(null);
    }

    
    public List<LoadApi> getLoadBySid(String shipperId) {
        // TODO Auto-generated method stub
        return loadApiDao.findByShipperId(shipperId);
        
    }

    
    public LoadApi addLoad(LoadApi load) {
        // TODO Auto-generated method stub
        loadApiDao.save(load);
        return load;
    }

    
    public LoadApi updateLoad(LoadApi load) {
        // TODO Auto-generated method stub
        loadApiDao.save(load);
        return load;
    }

    
    public LoadApi deleteLoad(long loadId) {
        // TODO Auto-generated method stub
        LoadApi entity=loadApiDao.findById(loadId).orElse(null);
        loadApiDao.delete(entity);
        return entity;
    }
    
}
