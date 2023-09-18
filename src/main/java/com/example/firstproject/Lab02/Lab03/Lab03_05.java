package com.example.firstproject.Lab02.Lab03;
import java.util.Scanner;

public class Lab03_05 {


public static int[][] makearray()
{
    Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[3][]; 
        arr[0] = new int[3]; 
        arr[1] = new int[1]; 
        arr[2] = new int[4]; 
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0;j < arr[i].length; j++) {
               int s = scanner.nextInt();
               arr[i][j] = s;
            }
         }
         return arr;
}
public static void main(String[] args){
    int arr1[] = {0,1,2};
    int arr2[][] = makearray();

    for(int a:arr1){
        for(int b: arr2[a]){
            System.out.print(b);
        }
        System.out.println("");
    }
    }
}

    

