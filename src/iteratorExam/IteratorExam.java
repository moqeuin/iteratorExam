package iteratorExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class IteratorExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		// iterator()는 컬렉션의 요소들을 탐색하는 기능을 가지고 있다.
		// 컬렉션 인터페이스 메서드, List도 상속받았기 때문에 사용할 수 있다.
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {		
			System.out.print(it.next() + " "); //aaa bbb ccc ddd	
		}
		// it는 이미 전체를 순회했기 때문에 다시 출력하고자 한다면 다시 선언해야하거나 다른 이터레이터를 선언해야한다.
		System.out.println(it.hasNext()); // false, 다음요소가 없기 때문
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("BANANA", "바나나");
		map.put("MELON", "멜론");
		map.put("APPLE", "사과");
		// entrySet은 map의 키와 값이 연결된 객체(set<Map.Entry<String,String>>==인스턴스)를 반환
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		Map<String, String> map2 = new HashMap<String, String>();
		map.put("kiwi","키위");
		map.put("orange","오렌지");
		map.put("watermelon","수박");
		
		// for-each문으로 출력
		Set<Map.Entry<String, String>> it3 = map.entrySet();
		for (Entry<String, String> element : it3) {
			System.out.println(element);
		}
		
	}

}
