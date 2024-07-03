package com.example.TeamIPLCRUDOperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TeamIPLCRUDOperation.entity.IplTeam;
import com.example.TeamIPLCRUDOperation.repository.IplRepository;

@Service
public class IplServiceImpl implements IplService {
	@Autowired
	IplRepository iplRepository;

	public IplServiceImpl(IplRepository iplRepository) {
		super();
		this.iplRepository = iplRepository;
	}

	@Override
	public IplTeam inserdata(IplTeam iplTeam) {
		return iplRepository.save(iplTeam);
	}

	@Override
	public List<IplTeam> getAllData() {
		return iplRepository.findAll();
	}

	@Override
	public String updateData(int id, IplTeam iplTeam) {
		IplTeam existTeam = iplRepository.findById(id).get();
		existTeam.setName(iplTeam.getName());
		existTeam.setTrophies(iplTeam.getTrophies());
		existTeam.setCaptainName(iplTeam.getCaptainName());
		iplRepository.save(existTeam);
		return "Data Updated Successfully";
	}

	@Override
	public IplTeam getOneTeam(int id) {
		IplTeam Data=iplRepository.findById(id).get();
		return Data;
	}

	@Override
	public void deleteTeam(int id) {
		IplTeam data=iplRepository.findById(id).get();
		iplRepository.delete(data);
		
	}

}
