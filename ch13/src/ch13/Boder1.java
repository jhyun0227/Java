package ch13;
import java.awt.*;
public class Boder1 extends Frame {
	public Boder1() {
		setLayout(new BorderLayout()); // Frame의 default이므로 생략 가능
		// 동, 서, 남, 북, 중앙
		add("North", new Button("북쪽"));
		add("South", new Button("남쪽"));
		add("East", new Button("동쪽"));
		add("West", new Button("서쪽"));
		add("Center", new Button("중앙"));
		
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Boder1();
	}
}