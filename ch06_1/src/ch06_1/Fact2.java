package ch06_1;

public class Fact2 {
	public static void main(String[] args) {
		int[] nums = {3, 4, 5, 6, 7};
		for(int num : nums) {
			System.out.println(num + "계승");
			System.out.println(fat(num));
		}
		
		System.out.println("================");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + "계승");
			System.out.println(fat2(nums[i]));
		}
		
	}
	
	static int fat(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			if (i == 1) {
				System.out.print(i + " = ");
			} else System.out.print(i + " * "); 
			result *= i;
		}
		return result;
	}
	
	static int fat2(int num) { // recursive(반복) 함수, 함수가 자기를 부르는 것
		if(num == 1) {
			System.out.print(num + " = ");
			return  1;
		} else {
			System.out.print(num + " * ");
			return num * fat2(--num);
		}
	}
	
}
