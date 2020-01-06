package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CanvasMain {

    public static void main(String[] args) {
        //
        //ApplicationContext is the specification
        // implementation we are using is AnnotationConfigApplicationContext
        //
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //
        //registering configuration class in which configuratins are kept
        //
        Class configurationClass=JavaConfig.class;
        context.register(configurationClass);
        context.refresh();
        context.registerShutdownHook();
        // above method is necessary to enable pre/on Destroy
        
        //
        //fetching bean by type
        //
        Canvas canvas = context.getBean(Canvas.class);
        System.out.println(canvas.getClass());
        Shape shape1=context.getBean(Shape.class);
        System.out.println(shape1.getClass());
        Shape shape2=canvas.getShape();
        //Shape shape2=context.getBean(Shape.class);
        //...when scope(prototype) is mentioned for a class , 
        // a new obj is created evry time 
        System.out.println(shape1==shape2);
    }
}