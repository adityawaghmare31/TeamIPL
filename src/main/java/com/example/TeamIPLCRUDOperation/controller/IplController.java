package com.example.TeamIPLCRUDOperation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TeamIPLCRUDOperation.entity.IplTeam;
import com.example.TeamIPLCRUDOperation.service.IplService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class IplController {

	IplService iplService;

	public IplController(IplService iplService) {
		super();
		this.iplService = iplService;
	}
	
	@PostMapping("insert")
	public ResponseEntity<IplTeam> inserdata(@RequestBody IplTeam iplTeam){
		IplTeam data= iplService.inserdata(iplTeam);
		return new ResponseEntity<IplTeam>(data,HttpStatus.CREATED);
	}
	
	@GetMapping("AllTeam")
	public ResponseEntity<List<IplTeam>> GetAllData(){
		List<IplTeam> list=iplService.getAllData();
		return ResponseEntity.ok(list);
		
	}
	
	@PutMapping("update/{id}")
	public String updateData(@PathVariable int id, @RequestBody IplTeam iplTeam) {
		String ok=iplService.updateData(id,iplTeam);
		return ok;
	}
	
	
	@GetMapping("Get/{id}")
	public ResponseEntity<IplTeam> getOneTeam(@PathVariable int id) {
		IplTeam data=iplService.getOneTeam(id);
		return ResponseEntity.ok(data);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteTeam(@PathVariable int id){
		iplService.deleteTeam(id);
		Map<String,Boolean>respone=new HashMap<String,Boolean>();
		respone.put("Deleted", Boolean.TRUE);
		return ResponseEntity.ok(respone);
	}
}
