package ghodrati.springframework.sfgdi;

import ghodrati.springframework.sfgdi.controllers.MyController;
import ghodrati.springframework.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args)  {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController= (MyController) context.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);



	}

}
