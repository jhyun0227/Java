package ch08;
import pac.One;
public class OneEx extends One {
	public static void main(String[] args) {
//  �ٸ� ��Ű���� ������ �޼��嵵 ��� ���� ��쿡�� protected�� public���� ��� �����ϴ�.
//		default�� private�� ��� ����		
		OneEx a = new OneEx();		
		System.out.println(a.getOne());
		System.out.println(a.one);
	}
}