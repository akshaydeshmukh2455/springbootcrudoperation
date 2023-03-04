package com.app.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.main.model.Country;

@Repository
public interface MyRepository extends CrudRepository<Country, Integer>
{

	void findByCid(int cid);

	
	
}
