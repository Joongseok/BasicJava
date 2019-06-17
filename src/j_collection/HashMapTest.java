package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		//1. map객체를 만들어주세요
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		
		//2. 아래와 같이 값을 추가해주세요
		//   박서경 80
		//   정요한 95
		//   박영춘 79
		//   유다연 10
		//   유민하 200
		map.put("박서경", 80);
		map.put("정요한", 95);
		map.put("박영춘", 79);
		map.put("유다연", 10);
		map.put("유민하", 200);
		
		System.out.println(map);
		System.out.println(map.get("박서경"));
		
		Set<String> keySet = map.keySet();//키값얻어오기
		
//		while(!keySet.isEmpty()){
//			System.out.println(keySet);
//		}
		
		map.remove("박서경");
		
		System.out.println(map);
		
		map.put("유다연", 100);
		System.out.println(map);
		
		//JDK1.8 replace
		//키만 동일
		//map.replace(key,newValue);
		//map.replace("유다연",100);
		//키와 값이 모두 동일한 경우
		//map.replace(key,oldValue,newValue);
		//map.replace("유다연",10,100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
