package com.selenium_demo.selenium_demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapdemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India", 15);
        map.put("China", 53);        
        map.put("japan", 58);
        System.out.println(map);
        map.put("China", 87);
        map.put("America", 87);
        System.out.println(map);
        if(map.containsKey("China")) {
            System.out.println("Key is available");
        }else {
            System.out.println("Key not available");
        }
        
        System.out.println(map.get("China"));
        
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
            
        }

    }


