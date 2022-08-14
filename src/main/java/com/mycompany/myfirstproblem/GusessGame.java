/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstproblem;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ACE
 */
public class GusessGame {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner v = new Scanner (System.in);
        int min =0;  
        int max = 0; 
        int enter=0;
        int trying=0;
          
          
            System.out.println("heelo welcome on my gama!\n now chose the range number start with:");
            min=v.nextInt();
            System.out.println("end with:");
            max=v.nextInt();
            System.out.println("now we started \n the range is "+ (min) + "-" +max);
        int TheTarget = (int)(Math.random( )*(max-min+1)+min);
            System.out.println("choose the number:");
            enter=v.nextInt();
                  
            while (enter!=TheTarget){
                
                System.out.println("wrong!");
                if (enter>TheTarget){
                    System.out.println("the number is less");            
                }
                else
                    System.out.println("the number is bgreater:");                  
            
             enter=v.nextInt(); 
                ++trying;
            }
            System.out.println("you win!");
            System.out.println("you try "+trying+" times");
        
        }
}