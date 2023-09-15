package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.hrms.business.abstracts.PositionService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Position;

@RestController
@RequestMapping("hrms/api/positions")
public class PositionController {
	
	PositionService positionService;
	
	
	@Autowired
	public PositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}


    @GetMapping("/getall")
	DataResult<List<Position>> getAll(){
		
		return positionService.getAll();
	
	}
    
    @PostMapping("/add")
    Result add(@RequestBody Position position) {
    	
    	return positionService.add(position);
    }

	@PostMapping("/update")
	public Result update(@RequestBody Position position){
		return this.positionService.update(position);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.positionService.delete(id);
	}
}
