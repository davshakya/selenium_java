package com.selenium_demo.selenium_demo;

public class JavaPractice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String a="devendra";
        String b="shakya";
        String rev="";
        for(int i=0;i<a.length();i++) {
            rev=a.charAt(i)+rev;
        }
        System.out.println(rev);
        System.out.println(a.substring(1,8));
        System.out.println(a.compareTo(b));
        System.out.println(a.equals(b));
        
    }

}
