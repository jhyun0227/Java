package ch03;

public class While2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum += i; // sum = sum + i;
			System.out.println("합계 = " + sum); // while 문안에 넣으면 결과가 여러개가 나온다
			i++;
		}
		//System.out.println("합계 = " + sum); 메서드 블록에서는 합계만 나옴
	}
}
