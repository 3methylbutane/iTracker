package com.example.demo.EmployeeSlotAvailabilityService;


import com.example.demo.utility.Response;

public interface EmployeeSlotAvailabilityService {
	
	public Response deleteSlot(String employeeId, int slotId);
}
