package com.example.firstproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import java.util.Scanner;

@SpringBootApplication
public class Lab02_02 {

	public static void main(String[] args) {

		byte b1 = 60; 
		byte b2 = 70; 
		char c1 = 'A';
		char c2 = 1;
		
		int bsum = b1 + b2;
		
		int csum = (int)c1 + (int)c2;

		System.out.println(bsum);
		System.out.println(csum);
		System.out.println((char)csum);
	}
}
