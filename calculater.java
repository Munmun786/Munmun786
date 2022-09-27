package com.calculater;

import java.util.Scanner;

public class calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char operator;
double number1 ,number2 , result;
Scanner scan = new Scanner(System.in);
System.out.println("choose one operators:+,-,*, or /" );
operator =scan.next().charAt(0);
System.out.println("Enter first number");
number1=scan.nextDouble();
System.out.println("Enter second number");
number2=scan.nextDouble();
switch (operator){
case'+':
	result=number1+number2;
	System.out.println(number1 + "+" + number2 + "="+ result);
			break;
case '-':
	result=number1-number2;
	System.out.println(number1 + "-" + number2 + "="+ result );
	break;
case '*':

	result=number1*number2;
	System.out.println(number1 + "*" + number2 + "="+ result );
	break;
case '/':
	result=number1/number2;
	System.out.println(number1 + "/" + number2 + "="+ result );
	break;
	default:
		System.out.println("invalid operator!");
		break;
}
scan.close();
	}

}
