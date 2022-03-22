package com.example.demo.EmployeeSkillsService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.EmployeeSkillRepository;
import com.example.demo.entity.EmployeeSkill;
import com.example.demo.utility.Response;

@Service
public class EmployeeSkillsServiceImpl implements EmployeeSkillsService{

	
	@Autowired
	private EmployeeSkillRepository esrepo;

	@Override
	public List<EmployeeSkill> getAll() {
		// TODO Auto-generated method stub
		return esrepo.findAll();
	}
	@Override
	public Response deleteSkill(int id) {
		// TODO Auto-generated method stub
		Response res = new Response();
		try {
			Optional<EmployeeSkill> es = esrepo.findById(id);
			if (!es.isPresent()) throw new Exception("Invalid Id");

			esrepo.deleteById(id);
			res.setMessage("Delete Successful.");
			res.setSuccess(true);
		}
		catch(Exception ex){
			res.setSuccess(false);
			res.setMessage(ex.getMessage());
		}

		return res;
		}
}
