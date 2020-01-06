package com.mycompany.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.app.*;


@Controller
public class HelloController {
	
	private Service service;
	


    public Service getService() {
		return service;
	}

    
    @Autowired
	public void setService(Service service) {
		this.service = service;
	}
    
    @GetMapping("/userinput")
    public ModelAndView userinput() {
    	return new ModelAndView("userinput");
    }

	/*@GetMapping("/hello")
    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
    public ModelAndView sayHello() {
        return new ModelAndView("hellopage",
                "message", "Welcome to Deloitte");
    }*/
    
    @GetMapping("/userdetails")
    public ModelAndView user(@RequestParam("username") String username ,
    		                        @RequestParam("id") int id) {
    	AppUser user=new AppUser(username,id);
    	
    	if(credentialsCorrect) {
    	
           ModelAndView mv= new ModelAndView("userdetails", "user", user);
  	       return mv;
  	
      }else {
    	  return new ModelAndView("userinput");
      }
}
}
