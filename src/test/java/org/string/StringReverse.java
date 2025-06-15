package org.string;

import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]){
        System.out.println("Enter the string: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        String rev="";

        for(int i=len-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
