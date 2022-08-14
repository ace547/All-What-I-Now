/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstproblem;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ACE
 */
public class JustPlay {
        public static void main(String[] args){
            Scanner v= new Scanner (System.in);
            int num=0;
            int numeven=0,numodd=0;
            
            for (int i = 0; i<= 10; i++) {
                System.out.println("enter 10 numbers");
                num=v.nextInt();
                if(num%2==0)
                    numeven++;
                else
                    numodd++;
                
                

            }
               System.out.println("sum of all even number"+ numeven );
                System.out.println("sum of all odd number"+ numodd );
        }
}
