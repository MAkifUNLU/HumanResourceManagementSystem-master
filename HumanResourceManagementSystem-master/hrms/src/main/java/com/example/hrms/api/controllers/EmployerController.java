package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("hrms/api/employers")
public class EmployerController {
	
	EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}

	@PostMapping("/update")
	public Result update(@RequestBody Employer employer){
		return this.employerService.update(employer);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.employerService.delete(id);
	}
	@PostMapping("/signup")
	Result signUp(@RequestBody Employer employer) {
		
		return employerService.signUp(employer);
	}
	
	@GetMapping("/getall")
	DataResult<List<Employer>> getAll(){
		return employerService.getAll();
	}

}
