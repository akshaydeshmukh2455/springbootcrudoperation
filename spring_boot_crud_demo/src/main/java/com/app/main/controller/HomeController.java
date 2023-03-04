package com.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.model.Country;
import com.app.main.service.IserviceInterface;

@RestController
public class HomeController
{
	@Autowired
	IserviceInterface iservice;
	
	@PostMapping("/save")
	public Country saveData(@RequestBody Country c)
	{
		Country country=iservice.saveData(c);
		return country;
	}
	
	@GetMapping("/getData")
	public List<Country> getData()
	{
		List<Country> list=iservice.getData();
		return list;
	}
	
	@DeleteMapping("/delete/{cid}")
	
	public void deleteData(@PathVariable ("cid") int cid)
	{
		
		 iservice.deleteData(cid);	
	}

	@PutMapping("/updateData /{cid}")
	public void updateData(@PathVariable ("cid") int cid)
	{
		 iservice.updateData(cid);
	}
	
}
