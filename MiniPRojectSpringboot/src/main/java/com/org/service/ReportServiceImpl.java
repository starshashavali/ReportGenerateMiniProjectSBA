package com.org.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entity.CitizenPlan;
import com.org.repo.CitizenPlanRepo;
import com.org.search.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private CitizenPlanRepo repo;

	@Override
	public List<String> getPlanName() {
// Retrieve all CitizenPlan and add their names to the list
		List<String> plans = repo.getPlanName();
		return plans;
	}

	@Override
	public List<String> getPlanStatus() {
		List<String> plans1 = repo.getPlanStatus();
		return plans1;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		CitizenPlan entity=new CitizenPlan();
		if(null!=request.getPlanName()&&!"".equals(request.getPlanName())) {
			entity.setPlanName(request.getPlanName());
		}if(null!=request.getPlanStatus()&&!"".equals(request.getPlanStatus())) {
			entity.setPlanStatus(request.getPlanStatus());
		}if(null!=request.getGender()&&!"".equals(request.getGender())) {
			entity.setGender(request.getGender());
		}if(null!=request.getStartDate()&&!"".equals(request.getStartDate())) {
			String startDate=request.getStartDate();
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//convert String localdate
			LocalDate localDate =LocalDate.parse(startDate, formatter);
			entity.setPlanStartDate(localDate);
		
		}
		if(null!=request.getEndDate()&&!"".equals(request.getEndDate())) {
			String endDate=request.getStartDate();
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			//convert String localdate
			LocalDate localDate =LocalDate.parse(endDate, formatter);
			entity.setPlanEndDate(localDate);
		
		}
		return repo.findAll();

	}

	@Override
	public void expertExcel() {

	}

	@Override
	public void expertPdf() {
		// TODO Auto-generated method stub

	}

}
