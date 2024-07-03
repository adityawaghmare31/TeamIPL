package com.example.TeamIPLCRUDOperation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="teamiplcrudoperation")
public class IplTeam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int trophies;
	private String captainName;
	public IplTeam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IplTeam(int id, String name, int trophies, String captainName) {
		super();
		this.id = id;
		this.name = name;
		this.trophies = trophies;
		this.captainName = captainName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTrophies() {
		return trophies;
	}
	public void setTrophies(int trophies) {
		this.trophies = trophies;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	@Override
	public String toString() {
		return "IplTeam [id=" + id + ", name=" + name + ", trophies=" + trophies + ", captainName=" + captainName + "]";
	}
	
	
	

}
