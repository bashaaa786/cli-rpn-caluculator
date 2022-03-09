package com.calculator;

import java.util.Scanner;

/**
 * This is the main class to run the RPN calculator.
 * We need to provide 2 numbers and one operator to get the calculated results.
 * Used Scanner to get the entered input.
 * 
 * @author Basha
 */
public class CalculatorMain {

	public static void main(String[] args) {
		RPNCalculator rpnCal = new RPNCalculator();
		System.out.println("Welcome to Calculator Application.");
		System.out.println("Please enter two numbers first and then one operator(+ (OR) - (OR) * (OR) /) to get the result.");
        try {
        	Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String strTkn = scanner.next();
                if ("q".equals(strTkn)) {
                	System.out.println("Bye .. Thanks for using Calculator Application.");
                    break;
                }
                Double result = rpnCal.evaluateToken(strTkn);
                System.out.println(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
