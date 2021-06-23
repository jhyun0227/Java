package ch13;
import java.awt.*;
public class Button1 extends Frame {
	Label[] lab = new Label[50];
	Button[] btn = new Button[50];
	
	public Button1() {
		setLayout(new FlowLayout());
		for (int i = 0; i < 50; i++) {
			lab[i] = new Label(i + "레이블");
			btn[i] = new Button(i + "버튼");
			if (i%2 == 0) {
				btn[i].setBackground(Color.green); // Background는 배경색
			} else {
				btn[i].setForeground(Color.blue);  // Foreground는 글자색
			}
			if (i%3 == 0) {
				lab[i].setBackground(Color.pink);
			}
			add(lab[i]);
			add(btn[i]);
		}
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Button1();
	}
}
