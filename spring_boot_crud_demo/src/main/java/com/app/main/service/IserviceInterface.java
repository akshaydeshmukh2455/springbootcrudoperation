package com.app.main.service;

import java.util.List;

import com.app.main.model.Country;

public interface IserviceInterface {

	Country saveData(Country c);

	List<Country> getData();

	void deleteData(int cid);

	void updateData(int cid);

}
