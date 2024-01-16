package javaStudy;

public class CarB {
	//필드는 객체의 속성.
	String name;
	int number;
	
	//Car.java에서 생성자를 하나라도 추가하면 기본생성자는 자동으로 만들어지지 않음.
	
	//기본 생성자 만들기 (Overloading)
	public CarB() {
//		this.name = "no name";
//		this.number = 0;
		this("no name", 0); //위와 같은 문법. 코드 중복 방지하는 문법. 
		//this()는 아래에 있는 자신의 생성자를 호출하는 것.
	}
	
	//생성자 추가하기  
	public CarB(String name) {//this 는 '내' 필드 네임.
		this(name, 0);
		/* 
		이렇게 하면 Car라는 생성자가 만들어지면서 name이 초기화됌.
		CarB(String name) 생성자를 새로 추가하는 순간, Car 객체를 만들 때 더이상 기본생성자 CarB()를 이용해서 만들 수 없어짐. 
		기본생성자 CarB()는 할당된 값 없이 빈 name, number 필드만 갖고 있음.		
		그래서 스트링 값을 매개변수로 넣어줘야함. 
		*/
	}
	
	public CarB(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
}

/* this 용례 
1. 객체가 자기 자신을 참조할 때/가리킬 때.
2. 클래스 안에서 자기 자신이 갖고 있는 메소드를 쓰고 싶을 때.
3. 나의 생성자를 호출할 때. 
*/