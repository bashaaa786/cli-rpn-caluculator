package com.calculator;

import java.util.Stack;

/**
 * This class is used to perform all the four (+ - / *) operations by taking the recent two operand values.
 * 
 * @author Basha
 */
public class RPNCalculator {

	//Used to store the numbers and not operators 
    Stack<Double> operandsStack = new Stack<Double>();
    
    /**
     * This method takes the input token and tries to convert it to Double, if is an Double value then it will push to Stack.
     * if its not a double value then its an operator then it will perform the operation and the result will push back to stack again.
     * @param strTkn
     * @return
     * @throws Exception
     */
    public Double evaluateToken(String strTkn) throws Exception{
        Double realNumber = parseTokenValue(strTkn);
        if (realNumber == null) {
        	realNumber = performOperation(strTkn);
        }
        operandsStack.push(realNumber);
        return realNumber;
    }
    /**
     * Helper method to parse the token to get the Double value.
     * @param strTkn
     * @return
     */
    private Double parseTokenValue(String strTkn) {
        try {
            return Double.parseDouble(strTkn);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    /**
     * Helper method to perform the operation based on the input operator.
     * @param operator
     * @return
     * @throws Exception
     */
    private Double performOperation(String operator) throws Exception {
    	Double operand1 = operandsStack.pop();
    	Double operand2 = operandsStack.pop();
    	Double result = null;
    	if (operator.equals("+")) {
    		result = operand1 + operand2;
        } else if (operator.equals("*")) {
        	result = operand1 * operand2;
        } else if (operator.equals("/")) {
        	result = operand2 / operand1;
        } else if (operator.equals("-")) {
        	result = operand2 - operand1;
        } else {
            throw new Exception ("Invalid input:" + operator+ ". Please try with valid input." );
        }
    	return result;
    }

}
