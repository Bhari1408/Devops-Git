package com.calculator;

public class CalculatorApp {

	public static void main(String[] args) {
	CalculatorApp cal = new CalculatorApp();
		cal.sum(4, 7);
		System.out.println("End results are");
		System.out.println(cal.sum(4, 7));
		System.out.println(cal.substraction(7, 2));
		System.out.println(cal.multiplication(3, 8));
		System.out.println(cal.division(12, 4));
	}
    public int sum(int a, int b) {
     int result;
    result=a+b;
    return result;
	}
    public int substraction(int a, int b) {
    	int result; 
    	result= a-b;
    	return result;
    }
    public int multiplication(int a, int b) {
    int result;
    result=a*b;
    return result;
    }
    public int division(int a, int b) {
    	int result;
    	result=a/b;
    	return result;
    }
}
