package com.example.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.hrms.business.abstracts.JobAdvertService;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("hrms/api/jobAdverts")
public class JobAdvertController {
	
	JobAdvertService jobAdvertService;
	
	@Autowired
	public JobAdvertController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert){
		return this.jobAdvertService.add(jobAdvert);
	}

	@PostMapping("/update")
	public Result update(@RequestBody JobAdvert jobAdvert){
		return this.jobAdvertService.update(jobAdvert);
	}

	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.jobAdvertService.delete(id);
	}

//	@PostMapping("/addAdvert")
//	Result addAdvert(@RequestBody JobAdvert jobAdvert) {
//
//		return jobAdvertService.addAdvert(jobAdvert);
//
//	}

}
