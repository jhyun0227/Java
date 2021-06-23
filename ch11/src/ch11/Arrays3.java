package ch11;

import java.util.Arrays;

public class Arrays3 {
	public static void main(String[] args) {
		// binarySearch´Â sort¿Í ÇÔ²² ½á¾ß ÀÛµ¿µÊ
		Integer[] scores = {99, 97, 98};
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("Ã£Àº ÀÎµ¦½º : " + index);
		
		String[] names = {"È«±æµ¿", "¹Ú¹®¼ö", "±èÃ¶¼ö"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		index = Arrays.binarySearch(names, "È«±æµ¿");
		System.out.println("Ã£Àº ÀÎµ¦½º : " + index);
		
		// °´Ã¼¸¦ Á¤·ÄÇÏ°í Ã£±â
		Member1 m1 = new Member1("È«±æµ¿");
		Member1 m2 = new Member1("¹Ú¹®¼ö");
		Member1 m3 = new Member1("±èÃ¶¼ö");
		Member1[] members = {m1, m2, m3};
		
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		index = Arrays.binarySearch(members, m2);
		System.out.println("Ã£Àº ÀÎµ¦½º : " + index);
	}
}
