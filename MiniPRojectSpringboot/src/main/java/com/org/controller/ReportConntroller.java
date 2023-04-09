package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.entity.CitizenPlan;
import com.org.search.SearchRequest;
import com.org.service.ReportService;

@Controller
//conntroller used to handle request and response
public class ReportConntroller {
	@Autowired
	private ReportService service;
	@PostMapping("/search")
	public String handleSearch(@ModelAttribute("search") SearchRequest request,Model model) {
		System.out.println(request);
		List<CitizenPlan> plans = service.search(request);
		//iterate element by using key in ui
		model.addAttribute("plans", plans);
		init(model);
		return "index";
	}
	@GetMapping("/")
	public String  indexPages(Model model) {
		//model used send data controller to UI
		//creatte binding obj to send data to UI as key value pair
		model.addAttribute("search", new SearchRequest());
		//load the empty page(form fields are empty)
		init(model);
		return "index";



		 
	}
	private void init(Model model) {
		//model.addAttribute("search", new SearchRequest());
		model.addAttribute("names", service.getPlanName());
		model.addAttribute("status", service.getPlanStatus());
	}
	
	

}
