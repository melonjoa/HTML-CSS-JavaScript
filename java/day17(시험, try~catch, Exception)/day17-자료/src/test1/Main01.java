package test1;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Calc calc = new Calc("곽지현");
		
		System.out.println(calc.getName());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력해 주세요");
		
		int num1 = scan.nextInt();
		System.out.println("입력 숫자는 : " + num1);
		
		System.out.println("첫 번째 숫자를 입력해 주세요");
		int num2 = scan.nextInt();
		System.out.println("입력 숫자는 : " + num2);
		
		System.out.println( num1 + " + " + num2 + " = " + calc.plus(num1, num2));
		System.out.println( num1 + " - " + num2 + " = " + calc.minus(num1, num2));
		System.out.println( num1 + " * " + num2 + " = " + calc.times(num1, num2));
		System.out.println( num1 + " / " + num2 + " = " + calc.divide(num1, num2));
		
		scan.close();
		
	}

}










