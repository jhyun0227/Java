package ch02;

public class OperTest1 {
	public static void main(String[] arg){
		 String str="���, ����, ����, ������ ����";
		 int x,y;
		 x = 10; y = 5;
		 System.out.println(str);
		 System.out.println("x + y = "+(x + y));
		 System.out.println("x - y = "+(x - y));
		 System.out.println("x * y = "+(x * y));
		 System.out.println("x / y = "+(x / y));
		 System.out.println("x % y = "+(x % y));
		 System.out.println("x++ = "+(x++)); // x�� 11������ ����� �������̹Ƿ� 10
		 System.out.println("y++ = "+(y++)); // y�� 6������ ����� �������̹Ƿ� 5
		 x = 10; y = 10; // ������ ���߱� ������ �ٽ� �ʱ�ȭ
		 System.out.println("++x = "+(++x));
		 System.out.println("++y = "+(++y)); 
	}
}