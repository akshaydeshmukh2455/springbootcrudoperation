package com.app.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country 
{
	@Id
	private int cid;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<States> state;
	public List<States> getState() {
		return state;
	}
	public void setState(List<States> state) {
		this.state = state;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
