package org.cap.controller;

import org.cap.entities.Employee;
import org.cap.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	private IEmployeeService service;
	


    public IEmployeeService getService() {
		return service;
	}

    
    @Autowired
	public void setService(IEmployeeService service) {
		this.service = service;
	}
    
    @GetMapping("/employeeinput")
    public ModelAndView employeeInput() {
    	return new ModelAndView("employeeinput");
    }

	/*@GetMapping("/hello")
    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
    public ModelAndView sayHello() {
        return new ModelAndView("hellopage",
                "message", "Welcome to Deloitte");
    }*/
    
    @GetMapping("/employeedetails")
    public ModelAndView employee(@RequestParam("id") int id ,
    		                        @RequestParam("name") String name) {
    	Employee employee=new Employee(id, name);
    	
    	if(credentialsCorrect) {
    	
           ModelAndView mv= new ModelAndView("employeedetails", "employee", employee);
  	       return mv;
  	
      }else {
    	  return new ModelAndView("userinput");
      }
}
}
