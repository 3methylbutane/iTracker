//package com.example.demo.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.demo.EmployeeSkillsService.EmployeeSkillsService;
//import com.example.demo.dao.EmployeeSkillRepository;
//import com.example.demo.entity.EmployeeSkill;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class EmployeeSkillControllerTest {
//	
//	
//	@Autowired
//	private EmployeeSkillsService employeeSkillsService;
//	
//	@MockBean
//	private EmployeeSkillRepository repository;
//	
//	@Test
//	public void getAllTest() {
//		System.out.println("Running");
////		when(repository.findAll()).thenReturn(Stream.of(new EmployeeSkill()).collect(Collectors.toList()));
////		assertEquals(1, employeeSkillsService.getAll().size());
//	}
//}
