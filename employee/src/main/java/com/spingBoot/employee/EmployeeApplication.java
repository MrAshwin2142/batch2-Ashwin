package com.spingBoot.employee;

import com.spingBoot.employee.dao.UserRepository;
import com.spingBoot.employee.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {


		ApplicationContext run = SpringApplication.run(EmployeeApplication.class, args);

		UserRepository userRepository = run.getBean(UserRepository.class);

		User user = new User();

		user.setName("Ashwin");

		user.setStatus("Programmer");

		User user1 = userRepository.save(user);

		System.out.println("hellooo...........................");

		System.out.println(user1);
	}

}
