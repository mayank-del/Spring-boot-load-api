package com.springpostcrud.postgres.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springpostcrud.postgres.entities.LoadApi;

public interface LoadApiDao extends JpaRepository<LoadApi,Long>{

	List<LoadApi> findByShipperId(String shipperId);
    
}
