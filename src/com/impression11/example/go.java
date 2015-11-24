package com.impression11.example;

import javax.crypto.Mac;

/**
 * Created by 70015131 on 24/11/2015.
 */
public class go {

    public static void main(String[] args){

        String hw = "hello world";
        int hwint = 123;

        Output2Term(hwint);
        Output2Term(hw);

        computer MacbookPro = new computer();

        MacbookPro.setMemory(512);
        MacbookPro.setCpuspeed(2900);

        System.out.println(MacbookPro.getCpuspeed());

    }


    public static void Output2Term(String inp){

        System.out.println("String Polymorphism123123123123: " + inp);

    }

    public static void Output2Term(int inp){

        System.out.println("int Polymorphism: " + inp);


    }

}
