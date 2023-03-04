package com.app.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.main.model.Country;
import com.app.main.repository.MyRepository;
import com.app.main.service.IserviceInterface;

@Service
public class IServiceImpl implements IserviceInterface
{
	@Autowired
	MyRepository repo;

	@Override
	public Country saveData(Country c) 
	{
		
		return repo.save(c);
	}

	@Override
	public List<Country> getData() 
	{
		
		return (List<Country>) repo.findAll();
	}

	@Override
	public void deleteData( int cid) {
		
		repo.deleteById(cid);
	}


	@Override
	public void updateData(int cid) 
	{
		repo.findByCid(cid);
		
	}
}
