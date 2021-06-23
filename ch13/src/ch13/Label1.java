package ch13;

import java.awt.*;

public class Label1 extends Frame {
	public Label1() {
		// Frame안에 있는 Componet들을 중앙 위부터 배치하라
		setLayout(new FlowLayout());
		Label lab1 = new Label("봄");
		Label lab2 = new Label("여름");
		Label lab3 = new Label("가을");
		Label lab4 = new Label("겨울");
		// label을 Frame에 넣어라
		add(lab1); add(lab2); add(lab3); add(lab4);
		setSize(300, 300);
		setVisible(true); // Frame을 보여줘라
	}
	
	public static void main(String[] args) {
		new Label1();
	}
}
