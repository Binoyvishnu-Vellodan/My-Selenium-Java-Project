package org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String args[]){
        String s="Java selenium appium";
        String[] words=s.split(" ");
        List<String> l1=new ArrayList<>();

        System.out.println(words[1]);
        String reverse="";
        for(String word: words){
            for(int j=word.length()-1;j>=0;j--) {
                reverse += word.charAt(j);
            }
            reverse+=" ";
        }
        System.out.println(reverse);
    }

}
