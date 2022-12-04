package com.selenium_demo.selenium_demo;

public class MainFun {
    public static void main(String[] args){
        System.out.println("My System Starts...");
        MyInter myInter = new MyInterImpl();
        myInter.sayHello();

        MyInter i = ()->{
            System.out.println("This is first time i am using Lambda expression");
        };
        i.sayHello();
    }
    
} 
