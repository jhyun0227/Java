package ch04_2;

public class Score2 {
	public static void main(String[] args) {
		String subject = "매출현황";
		String[] name = {"제품명", "1월", "2월", "3월", "4월", "합계", "평균"};
		String[] item = {"냉장고", "테레비", "청소기"};
		int[][] sell = {{250, 170, 300, 780}, {170, 120, 150, 220}, {450, 230, 400, 250}};
		int len = 54, sum = 0;
		int[] tot = new int[4];
		
		System.out.println(subject);
		System.out.println();
		
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		
		for (int i = 0; i < item.length; i++) {
			System.out.print(item[i] + "\t");
			for (int j = 0; j < sell[i].length; j++) {
				System.out.print(sell[i][j] + "\t");
				sum += sell[i][j];
				tot[j] += sell[i][j];

			}
			System.out.print(sum + "\t" + sum/(sell[i].length) + "\n");
			sum = 0;
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print("-");
		}
		
		System.out.println();
		System.out.print("총계\t");
		
		for (int j = 0; j < tot.length; j++) {
			System.out.print(tot[j] + "\t");
			sum += tot[j];
		}
		System.out.print(sum + "\t" + sum/tot.length + "(" + sum/tot.length/item.length+")");
	}
}