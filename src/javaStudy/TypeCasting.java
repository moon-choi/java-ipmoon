package javaStudy;

public class TypeCasting {

	public static void main(String[] args) {
		int x = 50000;
		long y = x; //묵시적 형변환
					//형변환이 일어남. (작은것을 큰것에 담음)
		
		long x2 = 5;
//		int y2 = x2; //형변환 안일어남. (큰것을 작은것에 담아서)
		int y2 = (int) x2; //강제 형변환 							//형변환 시켜줌. 
	}

}
