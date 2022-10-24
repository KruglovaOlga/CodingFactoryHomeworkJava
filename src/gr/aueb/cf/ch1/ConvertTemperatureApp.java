package gr.aueb.cf.ch1;
/*
 * Coding Factory 3
 * @author Olga Kruglova
 */

//program converts Fahrenheit temperature to Celsius

import java.util.*;
public class ConvertTemperatureApp {
    public static void main(String[] args) {
        int celsius, fahrenheit;
        System.out.println("Program to convert Fahrenheit to Celsius" );
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the Fahrenheit Temperature");
        fahrenheit= sc.nextInt();
        celsius = 5 * (fahrenheit-32) / 9 ;
        System.out.printf("Celsius = %d\n",celsius);
        }
    }

