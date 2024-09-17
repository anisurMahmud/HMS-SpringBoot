package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan("com.hms.repository")	//found the culprit
public class SpringHmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringHmsApplication.class, args);
		System.out.println("\"Hello Spring\"");

//		try{
//			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//			System.out.println("JDBC Driver loaded successfully");
//		} catch (Exception e) {
//            System.out.println("problem"+e.toString());
//        }

    }

}
