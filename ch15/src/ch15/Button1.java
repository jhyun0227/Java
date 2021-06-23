package ch15;

import javax.swing.*;

public class Button1 extends JFrame {
	public Button1() {
		ImageIcon i1 = new ImageIcon("logo.gif");
		ImageIcon i2 = new ImageIcon("java.jpg");
		JButton btn1 = new JButton("로고", i1);
		JButton btn2 = new JButton("자바", i2);
		btn1.setToolTipText("대박 ㅋㅋㅋㅋ");
		btn2.setToolTipText("금요일이다.");
		add("North", btn1); add("South", btn2);
		setSize(300, 300); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new Button1();
	}
}
