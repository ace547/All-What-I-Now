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
public class IfElsw {
    /*
    and &&
true and true and true=true
true and false=false
false and true=false
false and false=false
    
    or ||
true or true true
true or false=true
flase or true=true
false or false or true=true
    
    ? x : x
    */
    
    public static void main(String[] args){
        Scanner ax = new Scanner (System.in);
        int num=1;
        System.out.println("enter number:");
        num=ax.nextInt();
        if (num>0)
            System.out.println("positive");
        else
            System.out.println("negative");
    
    }
}
