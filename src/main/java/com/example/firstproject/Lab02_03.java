package com.example.firstproject;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Lab02_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x >= 100 && y >= 100 && x <= 200 && y <= 200)
            System.out.println("("+x+","+y+"):inside the rectangle");
        else
            System.out.println("("+x+","+y+"):not in the rectangle");
		scanner.close(); 
	}
}