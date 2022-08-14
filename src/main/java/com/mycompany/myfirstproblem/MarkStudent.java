/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstproblem;

import java.util.Scanner;

/**
 *
 * @author ACE
 */
public class MarkStudent {
    public static void main(String[] args){
        Scanner v = new Scanner (System.in);
        System.out.println("enter your Mark:\n");
        int Mark=v.nextInt();
        //String r= (Mark>=90&&Mark<=101):
        
        if (Mark>=90 && Mark<=100)
            System.out.println("A");
        else if (Mark>=80 && Mark<=90)
            System.out.println("B");
        else if (Mark>=70 && Mark<=80)
            System.out.println("C");
        else if (Mark>=60 && Mark<=70)
            System.out.println("D");
        else if (Mark<=59)
            System.out.println("FAIL");
        else 
            System.out.println("something is wrong!");
        /*
        System.out.println("enter your Mark:\n");
        int Mark=v.nextInt();
        
        String gride= (Mark>=90 && Mark<=100)?"A":(Mark>=80 && Mark<=90)?"B":(Mark>=70 && Mark<=80)?"C":(Mark>=60 && Mark<=70)?"D":(Mark<=59)?"FAIL":"something is wrong" ;
            System.out.println(gride);
        */
                
    }
}
