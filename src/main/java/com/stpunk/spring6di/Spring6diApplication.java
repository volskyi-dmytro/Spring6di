package com.stpunk.spring6di;

import com.stpunk.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6diApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Spring6diApplication.class, args);

		MyController controller = context.getBean(MyController.class);

		System.out.println("In the main method");

		System.out.println(controller.sayHello());
	}


}
