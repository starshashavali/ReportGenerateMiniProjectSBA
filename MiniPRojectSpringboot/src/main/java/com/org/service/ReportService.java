package com.org.service;

import java.util.List;

import com.org.entity.CitizenPlan;
import com.org.search.SearchRequest;

public interface ReportService {
	//declare abstract methods

	public List<String> getPlanName();

	public List<String> getPlanStatus();

	public List<CitizenPlan> search(SearchRequest request);

	public void expertExcel();
	
	public void expertPdf();
	
	
	
	
}
