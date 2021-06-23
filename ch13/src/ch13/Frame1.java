package ch13;

import java.awt.*;

public class Frame1 {
	public static void main(String[] args) {
		Frame f = new Frame("화면 보기"); // 화면 보기라는 Container를 생성
		f.setSize(200, 200); // 가로 200 세로 200의 크기
		f.setVisible(true);  // 보여줘
	}
}
