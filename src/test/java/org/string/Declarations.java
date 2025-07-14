package org.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Declarations {
    public static void main(String args[]){
        char c=' ';
        Character c1=' ';
        String s="Binoy vishnu Vellodan";       //String declaration
        String[] s1= s.split(" ");        //Array Declaration
        String[] s2={"1","2","3","4"};          //Array Declaration
        List<String> s3=new ArrayList<>();
        String[] s4=new String[]{"1","2","3","4"};
        String[] s5={"Binoy","Ravi"};
        ArrayList<String> s6=new ArrayList<>(); //Arraylist Declaration

        System.out.println(s1[1]);
        System.out.println(s2[1]);
        System.out.println(s4[3]);
        System.out.println(s5[0]);


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();
        StringBuilder st=new StringBuilder();
        for(int i=0;i<str.length();i+=2){
            c=str.charAt(i);
            int n=Character.getNumericValue(str.charAt(i+1));
            for(int j=0;j<n;j++){
                st.append(c);
            }
        }
        System.out.println(st);
    }
}
