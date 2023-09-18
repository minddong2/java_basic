package com.example.firstproject.Lab02.Lab02;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Lab02_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        double c_x = scanner.nextDouble();
        double c_y = scanner.nextDouble(); 
        double r = scanner.nextDouble(); 
		double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double result = (c_x - x)*(c_x - x) + (c_y - y)*(c_y -y) - r;
        if (result <= 0)
            System.out.println("("+(int)x+","+(int)y+"):inside the circle");
        else
            System.out.println("("+(int)x+","+(int)y+"):not in the circle");
		scanner.close();
	}
}