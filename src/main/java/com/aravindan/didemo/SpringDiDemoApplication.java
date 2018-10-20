package com.aravindan.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.aravindan.didemo.controllers.ConstructorInjectedController;
import com.aravindan.didemo.controllers.MyController;
import com.aravindan.didemo.controllers.PropertyInjectedController;
import com.aravindan.didemo.controllers.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.aravindan.services", "com.aravindan.didemo"})
public class SpringDiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiDemoApplication.class, args);
		
		MyController controller = (MyController)ctx.getBean("myController");
		
		//controller.hello();
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
