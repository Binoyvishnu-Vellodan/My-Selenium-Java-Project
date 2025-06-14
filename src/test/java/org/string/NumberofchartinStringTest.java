package org.string;

import org.testng.annotations.Test;

import java.util.*;

public class NumberofchartinStringTest {
    @Test
    public void NumberofCharinStringTest(){
        String s="aabbccd";
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> value:map.entrySet()){
            System.out.print(value.getKey()+"="+value.getValue());

        }
    }

//    @Test
//    public void NumberCharInStringUsingListOnly() {
//        String s = "aabbccd";
//        List<Character> list = new ArrayList<>();
//        for (char c : s.toCharArray()) {
//            list.add(c);
//        }
//        List<Character> printed = new ArrayList<>();
//
//        for (Character ch : list) {
//            if (!printed.contains(ch)) {
//                int freq = Collections.frequency(list, ch);
//                System.out.print(ch + "=" + freq + ",");
//                printed.add(ch);
//            }
//        }
//    }
}
