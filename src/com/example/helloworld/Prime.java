package com.example.helloworld;

import java.util.Scanner;

public class Prime {
    static int prime(int num,int i)
    {
        if (i==1)
            return 1;
        if(num%i==0)
            return 0;
        return prime(num,i-1);

    }
    public static void main(String args[])
    {
        int num,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num=sc.nextInt();
        p=prime(num,num/2);
        if (p==1)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
    }
}
