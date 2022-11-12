package com.selenium_demo.selenium_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> list=new ArrayList<Integer>();
//        ArrayList<String> slist=new ArrayList<String>();
//        ArrayList<Boolean> slist=new ArrayList<Boolean>();
        
        list.add(0);       
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(0));
        
        list.add(1,1);
        System.out.println(list);
        
        list.set(0, 5);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
        
        int[] myNum = {10, 20, 30, 40};        
        for(int val:myNum) {
            System.out.println("Val="+val);
        }
     
            
        }
        
    }
