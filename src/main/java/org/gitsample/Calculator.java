package org.gitsample;

public class Calculator {
	//Sample comment
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("num1:" + num1 + ",num2:" + num2 + ",sum:" + sum);
		return sum;
	}

	public static int subtract(int num1, int num2) {
		return (num1 - num2);
	}
	
	public static int multiply(int num1,int num2)
	{
		return (num1*num2);
	}

}
