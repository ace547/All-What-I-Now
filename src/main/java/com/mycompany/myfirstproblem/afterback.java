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
public class afterback {
     public static void main(String[] args){
         Scanner vx = new Scanner (System.in);
         int num1=0,num2=0,choice=0;      
         System.out.println("heelo ace welcome back!");
         System.out.println("enter the First number:");
         num1= vx.nextInt();
         System.out.println("enter the Second number:");
         num2= vx.nextInt();
         System.out.println("ewhat you want now?\n[1]+\n[2]-\n[3]/\n[4]*");
        choice=vx.nextInt();
         
        if (choice==1)
                System.out.println("the result is= "+ (num1+num2));
        else if(choice==2) 
                System.out.println("the result is= "+ (num1-num2));
        else if(choice==3) 
                System.out.println("the result is= "+ (num1/num2));
        else if(choice==4) 
                System.out.println("the result is= "+ (num1*num2));
        else
             System.out.println("something is wrong!/ntry again");
                 
        
     }
     
}
