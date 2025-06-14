package org.string;

import java.util.*;

public class Mostrepeatedsubstring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String: ");
        String s=sc.nextLine();


        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxCount=Collections.max(map.values());

        for(Map.Entry<Character,Integer> value:map.entrySet()){
            if(value.getValue()==maxCount) {
                System.out.println("The most repeated char is:" +value.getKey()+" is repeated "+value.getValue()+" times");
            }
        }

    }
}
