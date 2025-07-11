package org.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;

public class NTimesStrings {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        StringBuilder output = new StringBuilder();

        for(int i=0;i<s.length();i+=2) {
            char c = s.charAt(i);
            int count = Character.getNumericValue(s.charAt(i+1));
            for(int j=0;j<count;j++){
                output.append(c);
            }
        }
        System.out.println(output.toString());
}
}
