package org.string;

import java.util.*;

public class NumberOfSubstringMap2 {

    public static void main(String args[]){
        int count =0;
        char MostRepeated=' ';
        Scanner sc= new Scanner(System.in);
        System.out.println("Ether the String: ");
        String s=sc.nextLine();
        sc.close();

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
        List<Character> result=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==count){
                result.add(entry.getKey());
            }
        }
        System.out.println("The most repeated char(s): " + result + " with count: " + count);
    }
}
