package com.example.firstproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Lab02_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		

		int age = scanner.nextInt();
		String first_name = scanner.next();
		String last_name = scanner.next();
		
		System.out.println(age +" "+ first_name +" "+ last_name);

		scanner.close(); 
	}
}
