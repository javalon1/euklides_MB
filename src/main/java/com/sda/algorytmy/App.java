package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("podaj A");
        Scanner scanner =new Scanner(System.in);
        int A = scanner.nextInt();

        System.out.println("podaj B");
        Scanner scanner1 =new Scanner(System.in);
        int B = scanner1.nextInt();

        while (A!=B)
        {
           if(A>B){
               A=A-B;
           }else {
               B=B-A;
           }
            System.out.println("NWD: "+ A);
        }


    }


}

