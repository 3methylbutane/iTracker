package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmployeeSkill;


public interface EmployeeSkillRepository extends JpaRepository<EmployeeSkill,Integer>{
	
	public List<EmployeeSkill> findBySkillId(int skillId);
	public List<EmployeeSkill> findByEmployeeId(String employeeId);
}
