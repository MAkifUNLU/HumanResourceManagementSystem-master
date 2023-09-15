package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {
	
	Result addAdvert(JobAdvert jobAdvert);
	Result add(JobAdvert jobAdvert);
	Result update(JobAdvert jobAdvert);
	Result delete(int id);

}
