package javaStudy;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in); //System.in은 키보드 입력값.

		do {
			
			value = scan.nextInt(); //정수값을 입력받아서 변수에 넣어줌.
			
			System.out.println("input value: " + value);
			
		} while(value != 10); //이 조건을 만족하면 반복문 끝냄.
		
		System.out.println("end loop");
	}

}
