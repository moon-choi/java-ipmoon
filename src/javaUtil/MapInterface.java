package javaUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); //map은 key, value가 쌍으로 저장돼어야 함.
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		map.put("001", "kang");
		
		System.out.println(map.size()); //key값은 중복 불가이므로 3.
		System.out.println(map.get("001")); //같은키로 값이 들어오면 나중에 들어온 값으로 바꿈.
		//.get(키 값)으로  꺼내기.
		
		Set<String> keys = map.keySet(); //모든 키값 꺼내는 메소드. key만 꺼내서 Set자료구조에 넣어줌. 
		Iterator<String> iter = keys.iterator(); //키를 이터레이터 형식으로 꺼냄.
		while(iter.hasNext()) { //데이터 있으면 true, 없으면 false. 
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}