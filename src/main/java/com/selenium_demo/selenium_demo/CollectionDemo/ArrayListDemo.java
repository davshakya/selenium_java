package com.selenium_demo.selenium_demo.CollectionDemo;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[]arg){
        ArrayList<String> lst= new ArrayList<>();
        lst.add("Dev");
        lst.add("Manan");
        lst.add("Manav");
        lst.add("Ranjana");
        lst.add("Vandna");
        lst.add("Min2");
        System.out.println(lst);
        System.out.println(lst.size());

        //        for (String s : lst) {
//            System.out.println(s);
//        }

        for(int i=0; i <= (lst.size()-1); i++){
            System.out.println(lst.get(i));

        }
        }
        }