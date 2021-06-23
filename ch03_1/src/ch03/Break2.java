package ch03;
public class Break2 {
	public static void main(String[] args) {
		a : for (int i = 1; i <=10; i++) { // a를 label
				for (int j = 1; j <=10 ;j++) {
					System.out.println("대박");
					//if ( j > 4) break; // 안쪽 for만 종료
				if ( j > 4) break a; // label a에 해당하는 for문장 종료
			}
			System.out.println("사건 : " + i);
		}
	}
}