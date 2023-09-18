package com.example.firstproject.Lab02.Lab03;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Lab03_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        while(true)
        {
            String sen_ten = scanner.nextLine();
            System.out.println(sen_ten);
            if(sen_ten.equals("q")){
                break;
            }
        }
		scanner.close();
	}
}