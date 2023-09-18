package com.example.firstproject.Lab02.Lab03;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Lab03_02 {

	public static void main(String[] args) {

        int num [] = new int [5];
        double j = 0;
		Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < num.length; i++)
        {
            num[i] = scanner.nextInt();
            j += num[i];
        }
        j = j / num.length;
        System.out.println("Average:" + j);
		scanner.close();
	}
}