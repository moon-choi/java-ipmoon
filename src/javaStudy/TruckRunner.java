package javaStudy;

public class TruckRunner {

	public static void main(String[] args) {
		Truck truck = new Truck();
		
		truck.drive();
		
		/*
		- truck이 인스턴스화 될 때 (메모리에 올라갈 때) 부모인 car 객체도 메모리에 올라감.
		- 부모가 먼저 생성됌 => 그래야 자식도 생성됌.
		- 생성자가 하는 일: 객체를 초기화하는 일
		- 생성자가 호출됄 때 자동으로 부모의 생성자도 호출돼면서 부모객체를 초기화함.
	 	- super는 부모 객체를 나타내는 키워드.
	 	- super() 라고하면 부모 생성자가 호출됌.
		*/	

//		Car car = new Car();
	}

}
