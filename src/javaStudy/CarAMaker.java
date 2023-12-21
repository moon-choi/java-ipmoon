package javaStudy;

public class CarAMaker { //붕어빵 틀만 있다고 붕어빵이 생기는 것이 아님. 

	public static void main(String[] args) {
		//클래스 Car를 이용해서 객체 만들기.
		//new 연산자는 Car 생성자 이용해서 메모리에 객체(=인스턴스)를 만듦.
		
		CarA c1 = new CarA(); 
		CarA c2 = new CarA(); 
		//무한대로 붕어빵 찍어낼 수 있음.
		//각각의 객체를 '참조'하는 c1, c2 변수가 생김.
		
		c1.name = "fire truck";
		c1.number = 1234;
		
		c2.name = "ambulance";
		c2.number = 5678;
		
		System.out.println(c1.name);		
		
	}

}
