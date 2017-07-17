package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {



        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter your first number:");

        double input1 = reader.nextDouble();
        System.out.println("Please enter your second number: ");

        double input2 = reader.nextDouble();


        double operand1 = input1;
        double operand2 = input2;
        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double multiplication = operand1 * operand2;
        double division = operand1 / operand2;
        double remainder = operand1 % operand2;

        showResults(sum, difference, multiplication, division, remainder);

    }


    public static void showResults( double sum,double difference, double multiplication, double division, double remainder){
        System.out.println("Your results are " + sum );
        System.out.println("Your results are " + difference );
        System.out.println("Your results are " + multiplication );
        System.out.println("Your results are " + division );
        System.out.println("Your results are " + remainder );
    }

}

