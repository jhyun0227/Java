package ch03;

public class Do1 {
	public static void main(String[] args) {
		int i = 10; // 일단 do문장은 하나 출력이 되고 그 다음 while문이 반복되는 것 
		do {
			System.out.println("안녕");
			i++;
		} while (i <= 9);
	}
}
