package ch11;

class GeneT<T> {
	T[] v;
	
	public void set(T[] n) {
		v = n;
	}
	public void print() {
		for (T s : v) {
			System.out.println(s);
		}
	}
}

public class GeneEx1 {
	public static void main(String[] args) {
		GeneT<String> gt = new GeneT<>();
		String[] ss = {"대박", "사건", "뭥미"};
		gt.set(ss);
		gt.print();
		
		GeneT<Integer> gt2 = new GeneT<>();
		Integer[] ii = {12, 66, 77, 23};
		gt2.set(ii);
		gt2.print();
	}
}