package ch12;

public class AccountEx2 {
	public static void main(String[] args) {
		Account2 act = new Account2(10000); // 통장 객체
		AccountUser2[] au = new AccountUser2[5]; // 통장을 5명이 공유
		au[0] = new AccountUser2(act, "공유");
		au[1] = new AccountUser2(act, "세정");
		au[2] = new AccountUser2(act, "원빈");
		au[3] = new AccountUser2(act, "하니");
		au[4] = new AccountUser2(act, "강다");
	
		for (AccountUser2 a : au) {
			a.start();
		}
	}
}
