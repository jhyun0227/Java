package ch11;

import java.util.ArrayList;

public class Gene1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1); list.add(2); list.add("대박");
		list.add(3); list.add(4); list.add("사건");
		
		System.out.println(list);
		
		// Generic : 저장할 데이터의 형태를 고정시킴
		//        <제네릭스>
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1); list2.add(2); //list2.add("대박");
		list2.add(3); list2.add(4); //list2.add("사건");
		
		System.out.println(list2);
	}
}
