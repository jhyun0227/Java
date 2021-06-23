package ch13;
import java.awt.*;
import java.awt.event.*;
public class ActionEv1 extends Frame implements ActionListener{
	Button btn;  // 이벤트 처리할 컴퍼넌트는 전역 변수로 선언
	TextArea ta;
	public ActionEv1() {
		btn = new Button("버튼을 클릭 하세요");
		ta = new TextArea();
		add("North", btn);
		add("Center", ta);
		setSize(300, 300);
		setVisible(true);
		// ActionListener 버튼 클릭, List 또는 Choice에 선택,
		btn.addActionListener(this); // 버튼을 누리는지 체크
	}
	public static void main(String[] args) {
		new ActionEv1();
	}
	public void actionPerformed(ActionEvent e) {
		ta.append("버튼 눌렀네 \n");		
	}
}