package com.example.demo.EmployeeSlotAvailabilityService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.EmployeeSlotAvailabilityRepository;
import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeSlotAvailability;
import com.example.demo.utility.Response;

@Service
public class EmployeeSlotAvailabilityServiceImpl implements EmployeeSlotAvailabilityService{
	
	@Autowired
	private EmployeeRepository erepo;

	@Autowired
	private EmployeeSlotAvailabilityRepository esarepo;

	@Override
	public Response deleteSlot(String employeeId, int slotId) {
		Response response= new Response();
		Optional<Employee> optional= erepo.findById(employeeId);
		int flag=0;
		if(optional.isPresent()) {
			Employee employee=optional.get();
			List<EmployeeSlotAvailability> slots=employee.getSlotsAvailable();
			//List<EmployeeSlotAvailability> temp=new LinkedList<>(); 
			EmployeeSlotAvailability temp = null;
			for(EmployeeSlotAvailability esa:slots) 
			{
				if(esa.getId()==slotId)
				{
					flag=1;
					//slots.remove(esa);
					//temp.add(esa);
					temp=esa;
					//esarepo.delete(esa);
				}
			}
			slots.remove(temp);
			esarepo.delete(temp);
			erepo.save(employee);
		}
		if(flag==1)
		{
			response.setSuccess(true);
			response.setMessage("Slot deleted successfully");
		}
		else
		{
			response.setSuccess(false);
			response.setMessage("Invalid details in request");
		}
		return response;
	}

}
