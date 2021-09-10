package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        int age;
        boolean comp;
        Scanner input = new Scanner(System.in);
        System.out.println( "What is your age?" );
        age = input.nextInt();
        while(age < 0){
            System.out.println("Enter a valid age:");
            age = input.nextInt();
        }
        comp = ((age >= 16 ) ? true : false);
        if(comp){
            System.out.println("You are old enough to legally drive.");
        }
        else{
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
