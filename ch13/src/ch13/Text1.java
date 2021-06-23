package ch13;
import java.awt.*;
public class Text1 extends Frame {
	public Text1() {
		// 한줄 입력창
		setLayout(new FlowLayout());
		TextField tf1 = new TextField("아이디"); // 초기에 아이디 글자가 보이고 40자 입력창
		TextField tf2 = new TextField(40);	   // 40자 입력 창
		tf2.setEchoChar('*');				   // 글자를 입력하면 *로 표시(암호)
		TextArea ta = new TextArea(5, 40); // 5줄 40자
		add(tf1); add(tf2); add(ta);
		setSize(300, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Text1();
	}
}
