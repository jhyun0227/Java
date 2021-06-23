package ch03;

public class WhileTest2 {
	public static void main(String[] arg) {
		int sum = 0;
		int i = Integer.parseInt(arg[0]);
		
		while (i <= 0) {
			sum += i;
			System.out.println("i가 " + i + "일때 sum은 " + sum + "이다.");
			i++;
		}
	}
}
