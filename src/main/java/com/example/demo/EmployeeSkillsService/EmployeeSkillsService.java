package com.example.demo.EmployeeSkillsService;

import java.util.List;

import com.example.demo.entity.EmployeeSkill;
//import com.example.demo.utility.RequestBodyEmployeeSkills;
import com.example.demo.utility.Response;

public interface EmployeeSkillsService {

	public List<EmployeeSkill> getAll();
	public Response deleteSkill(int id);

}
