package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeSkillsService.EmployeeSkillsService;
import com.example.demo.entity.EmployeeSkill;
import com.example.demo.utility.Response;

@RestController
@RequestMapping("/api/v1/employee/skill/")
public class EmployeeSkillController {
	@Autowired
	EmployeeSkillsService employeeSkillsService;
	
	@GetMapping()
	public List<EmployeeSkill> getAll()
	{
		return employeeSkillsService.getAll();
	}
	
	@DeleteMapping("e_id/{id}")
	public Response delete(@PathVariable(name = "id") int id) {
		return employeeSkillsService.deleteSkill(id);
	}
}