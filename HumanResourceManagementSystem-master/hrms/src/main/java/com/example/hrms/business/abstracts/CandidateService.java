package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Candidate;

public interface CandidateService {
	Result add(Candidate candidate);
	Result update(Candidate candidate);
	Result delete(int id);
	Result signUp(Candidate candidate);
	DataResult<List<Candidate>> getAll();
	

}
