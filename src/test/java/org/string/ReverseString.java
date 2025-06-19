package org.string;

public class ReverseString {
    public static void main(String args[]){
        String s="Binoy";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        String reversed=new StringBuilder(s).reverse().toString();
        System.out.println("String reversed using String builder:  "+reversed);
        System.out.println("String reversed using loop:  "+rev);
    }
}
