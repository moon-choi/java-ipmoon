package javaStudy;

public class DuckRunner {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.fly();
		
 //		Bird bird = new Bird; //추상 클래스는 부모로서의 역할은 가능하나, 추상 클래스 자체를 이용하여 객체 생성은 불가능함. 
	}

}
