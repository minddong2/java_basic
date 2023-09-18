package com.example.firstproject.Lab02.Lab03;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

@SpringBootApplication
public class Lab03_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int intArray[][] = new int[2][3];
        int i;
        int arr1[] = {0,1};
        for(i=0;i<2; i++)
        {
            int j = 0;
            while(j <3)
            {
                try{
                    int n = scanner.nextInt();
                    intArray[i][j] = n;
                    j++;
                }
                catch(InputMismatchException e){
                System.out.println("정수가아님");
                scanner.next();
                continue;
                }
            }
        
	    }
        for (int a : arr1){
            for(int b: intArray[a]){
                System.out.print(b);
            }
            System.out.println("");
        }
		
        scanner.close();

    }
}