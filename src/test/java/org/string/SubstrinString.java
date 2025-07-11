package org.string;
import java.util.*;

public class SubstrinString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder();

        for(int i=0;i<s.length();){
            char c=s.charAt(i);
            i++;

            StringBuilder num=new StringBuilder();
            while (i<s.length()&&Character.isDigit(s.charAt(i))){
                num.append(s.charAt(i));
                i++;
            }
            int n=Integer.parseInt(num.toString());
            for(int j=0;j<n;j++){
                str.append(c);
            }
        }
        System.out.println(str);
    }
}
