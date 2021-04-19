package com.tts;
import java.util.Scanner;
import java.lang.Math.*;

public class MagicCalculator extends Calculator {
    public static void main(String[] args) {



    Calculator calc = new Calculator();

    Scanner myScan = new Scanner(System.in);
    System.out.println("Please enter a number");
    int var = myScan.nextInt();

        int square = calc.square(var);
        System.out.println("square root of " + square);

        double cos = Math.cos(Math.toRadians(var));
        System.out.println("cosine of " + cos);

        double tan = Math.tan(Math.toRadians(var));
        System.out.println("tangent of " + tan);

}
}
