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
public class LettersMaker {
        public static void main(String[] args){
       Scanner v = new Scanner (System.in);
       int number=0;
       int count=0;
       int numberin=0;
       String var= "abcdefghigklmnpqrstunzwy";
       String var2= "ywznutspqnmkgihgfedcba";
       
       
       System.out.println("hello in my program \n please enter number:");
       numberin=v.nextInt();
       
      while(count<numberin){
          if(number<22){
        System.out.print(var.charAt(number));
        System.out.println(var2.charAt(number));
        ++number;
        ++count;}
          else {
          number=0;
         
}
      } 
         
        
        }
}
