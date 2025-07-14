package org.string;

import java.util.HashMap;

public class hashmapUse {
    public static void main(String args[]){
        HashMap<String,String> map= new HashMap<>();
        map.put("Binoy","33");
        map.put("Arun","35");
        map.put("Ravi","40");

        for(String key: map.keySet()){
                System.out.println("Age of "+key+" is: "+map.get(key));
        }
    }
}
