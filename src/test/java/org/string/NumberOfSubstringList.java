package org.string;

import org.testng.annotations.Test;

import java.util.*;

public class NumberOfSubstringList {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }
        List<Character> printed = new ArrayList<>();

        for (Character ch : list) {
            if (!printed.contains(ch)) {
                int freq = Collections.frequency(list, ch);
                System.out.print(ch + "=" + freq + ",");
                printed.add(ch);
            }
        }
    }
}
