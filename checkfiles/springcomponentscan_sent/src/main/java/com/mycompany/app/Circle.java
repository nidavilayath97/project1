package com.mycompany.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Circle implements Shape {

    private int radius;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    @Override
    public double area(){
        return 3.14*radius*radius;
    }
    
    @PostConstruct
    
    // runs the code mentioned below when the 
    //component obj is created in the bean factory
    public void init() {
    	System.out.println("inside init");
    	radius=4;
    }
    
    @PreDestroy
    public void onDestroy() {
    	System.out.println("inside ondestroy");
    }


}
