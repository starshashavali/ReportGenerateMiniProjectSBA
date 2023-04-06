package com.org.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.CitizenPlan;

public interface CitizenPlanRepo  extends JpaRepository<CitizenPlan,Integer>{

}
