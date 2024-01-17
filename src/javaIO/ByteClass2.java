package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteClass2 { //파일로부터 512바이트씩 읽어들여서 1바이트씩 써내는 프로그램 

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		FileInputStream fis = null; //파일로부터 읽어들이는 객체 선언
		FileOutputStream fos = null; //파일을 쓸 수 있는 객체 선언 
		
		try {
			fis = new FileInputStream("src/javaIO/ByteClass2.java");
			fos = new FileOutputStream("byte2.txt"); //아무 경로 안주면 프로젝트 밑에 생성됌.
			
			int readCount = -1;
			byte[] arr = new byte[512]; //512바이트 사이즈의 배열.
			
			//읽어들일 것이 있으면 항상 양수.   //.read(arr)이 512바이트 한번에 읽음. 
			while( ( readCount = fis.read(arr) ) != -1 ) {
				//1바이트 읽어서 readData에 담음. false 일 때까지 계속 반복 
				fos.write(arr,0,readCount); ///buffer의 0번째부터 시작해서 
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
//				fos.flush();
				fos.close(); //io의 모든 객체들은 인스턴스한 뒤 반드시 닫아주어야함.
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fis.close(); //io의 모든 객체들은 인스턴스한 뒤 반드시 닫아주어야함.
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}

}
