package com.example.TeamIPLCRUDOperation.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.TeamIPLCRUDOperation.entity.IplTeam;

public interface IplService {

	IplTeam inserdata(IplTeam iplTeam);

	List<IplTeam> getAllData();

	String updateData(int id, IplTeam iplTeam);

	IplTeam getOneTeam(int id);

	void deleteTeam(int id);

}
