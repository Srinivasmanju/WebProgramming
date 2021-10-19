package com.JPAFirstClass.jpademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}
@Bean
public CommandLineRunner run(EmployeeRepository repository){
		return (args -> {
			insertEmployeeData(repository);
			//deleteEmployeeData(repository);
			System.out.println(repository.findAll());
		});
}
	private void insertEmployeeData(EmployeeRepository repository){
		repository.save(new Employee("Srini","manju"));
	repository.save(new Employee("Ravi","ram"));
	repository.save(new Employee("rahul","raj"));
	repository.save(new Employee("sujan","r"));
	repository.save(new Employee("darshan","max"));
}
	/*private void deleteEmployeeData(EmployeeRepository repository){
		repository.delete("Srini","manju"));

	} */

}

