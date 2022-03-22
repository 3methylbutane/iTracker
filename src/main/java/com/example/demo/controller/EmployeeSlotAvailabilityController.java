package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeSlotAvailabilityService.EmployeeSlotAvailabilityService;

import com.example.demo.utility.Response;


@RestController
@RequestMapping("/api/v1/slot/")
public class EmployeeSlotAvailabilityController {
	
	@Autowired
	private EmployeeSlotAvailabilityService service;


	@DeleteMapping
	public Response deleteSlot(@RequestParam(name = "e_id") String e_id,@RequestParam(name="s_id") int s_id)
	{
		return service.deleteSlot(e_id,s_id);
	}
	
}
