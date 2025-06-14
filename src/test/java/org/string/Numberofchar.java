package org.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Numberofchar {

    public static void main(String args[]){
        String s="Geethika";
        int count =0;
        Character MostRepeated=null;
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Ether the String: ");
//        String s=sc.nextLine();
//        sc.close();

        LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character, Integer> value:map.entrySet()){
            System.out.println(value.getKey()+":"+value.getValue());
            if (value.getValue()>count){
                count=value.getValue();
                MostRepeated=value.getKey();
            }
        }
        System.out.println("Most repeated Character is: "+MostRepeated);
    }
}
