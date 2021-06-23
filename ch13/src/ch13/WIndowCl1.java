package ch13;
import java.awt.*;
import java.awt.event.*;
public class WIndowCl1 extends Frame implements ActionListener{
	TextArea ta; Button btn;  // 이벤트 처리할 컴퍼넌트는 전역 변수로 선언	
	public WIndowCl1() {
		btn = new Button("버튼을 클릭 하세요");	ta = new TextArea();
		add("North", btn);		add("Center", ta);
		setSize(300, 300);		setVisible(true);
		// ActionListener 버튼 클릭, List 또는 Choice에 선택,
		btn.addActionListener(this); // 버튼을 누리는지 체크
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { // x를 클릭 했을 때
				System.exit(0); // 프로그램 정상 종료
			}
		});
	}
	public static void main(String[] args) {
		new WIndowCl1();
	}
	public void actionPerformed(ActionEvent e) {
		// 텍스트네어리어 글자를 붙이고 줄 바꿈
		ta.append("버튼 눌렀네 \n");		
	}
}