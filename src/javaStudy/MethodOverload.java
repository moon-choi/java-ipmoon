package javaStudy;

public class MethodOverload {

	//Method overloading: 매개변수 갯수, 타입 다른 경우 같은 이름으로 메소드 정의 가능.
	
	public int plus (int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	public String plus(String x, String y, String z) {
		return x + y;
	}
}
