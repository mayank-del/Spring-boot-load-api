package com.springpostcrud.postgres.services;
import java.util.List;
import com.springpostcrud.postgres.entities.LoadApi;

public interface LoadServices {
    public List<LoadApi> getLoads();
    public LoadApi getLoad(long loadId);
    public LoadApi addLoad(LoadApi load);
    public LoadApi updateLoad(LoadApi load);
    public LoadApi deleteLoad(long loadId);
    public List<LoadApi> getLoadBySid(String shipperId);

}
