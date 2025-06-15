package org.string;

import java.util.*;

public class NumberOfSubstringMap1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String: ");
        String s=sc.nextLine();
        int maxCount=0;
        char maxchar=' ';
        char[] Char=s.toCharArray();

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char c: Char){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:map.keySet()){
            System.out.println(c+"="+map.get(c));
            if(map.get(c)>maxCount) {
                maxCount=map.get(c);
                maxchar=c;
            }
        }
        System.out.println("The most repeated char is:" +maxchar+" is repeated "+maxCount+" times");
    }
}
