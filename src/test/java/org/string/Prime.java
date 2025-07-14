package org.string;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        System.out.println("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextByte();

        boolean isprime=true;
        for(int i=2;i<=Number/2;i++){
            if(Number % i == 0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("The number "+Number+" is a prime number");
        }
        else{
            System.out.println("The number "+Number+" is not a prime number");
        }
    }
}
