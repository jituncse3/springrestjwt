package com.nse.resourcse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nse.dao.EmployeeRepository;
import com.nse.dao.EmployeeRepositoryImpl;
import com.nse.model.Employee;



@RestController
@RequestMapping(value = "/abcd")
public class NeapsController {
	
	EmployeeRepository emprepo = new EmployeeRepositoryImpl();
	
	@GetMapping("/ef/{id}")
	public String hello(@PathVariable("id") String s)
	{
		return "hello"+  s;
	}
	
	@RequestMapping(value="/addEmployee",consumes="application/JSON",method=RequestMethod.POST)
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		emprepo.add(employee);
		
		System.out.println(employee.getId());
		
		return new ResponseEntity<Employee>(HttpStatus.OK);
	}

}
