package org.cap.service;

import org.cap.dao.IEmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
  
	
	private  IEmployeeDao employeeDao;

	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}
    
	@Autowired
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
}
