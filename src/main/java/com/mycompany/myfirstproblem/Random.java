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
public class Random {
    public static void main(String[] args){
       java.util.Random rand = new java.util.Random();
        Scanner v = new Scanner (System.in);
        int min = 0;  
        int max = 0; 
        
            System.out.println("enter min number");
            min=v.nextInt();
            
            System.out.println("enter max number");
             max=v.nextInt();
             
           int b = (int)(Math.random( )*(max-min+1)+min);  
           
            System.out.println(b);

        }
}
