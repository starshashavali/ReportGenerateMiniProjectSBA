package com.org.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.org.entity.CitizenPlan;
import com.org.repo.CitizenPlanRepo;

@Component
public class DataLoader implements ApplicationRunner {
	@Autowired
	private CitizenPlanRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
//Cash plan 
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Willian");
		c1.setGender("Female");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(9));
		c1.setBenefitAmt(9000.0);

		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Ram");
		c2.setGender("Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Denied");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(11));
		c2.setDenialreason("Rental Income");
		
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Lakhshmi");
		c3.setGender("Female");
		c3.setPlanName("Cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(6));
		c3.setPlanEndDate(LocalDate.now().plusMonths(9));
		c3.setBenefitAmt(11000.0);
		c3.setTerminationDate(LocalDate.now());
		c3.setTerminationReason("Govt Employee");
		
		
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Gips");
		c4.setGender("Male");
		c4.setPlanName("Cash");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(9));
		c4.setBenefitAmt(2000.0);

		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Sunny");
		c5.setGender("FeMale");
		c5.setPlanName("Cash");
		c5.setPlanStatus("Denied");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(10));
		c5.setDenialreason("Rental Income");
		
		
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Jolie ");
		c6.setGender("Female");
		c6.setPlanName("Cash");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(9));
		c6.setPlanEndDate(LocalDate.now().plusMonths(3));
		c6.setBenefitAmt(3000.0);
		c6.setTerminationDate(LocalDate.now());
		c6.setTerminationReason("Govt Employee");
		
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Shakespeare");
		c7.setGender("Male");
		c7.setPlanName("Cash");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(12));
		c7.setBenefitAmt(15000.0);
		
		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7);
		repo.saveAll(list);

	}

}
