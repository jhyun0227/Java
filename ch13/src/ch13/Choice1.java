package ch13;
import java.awt.*;
public class Choice1 extends Frame {
	public Choice1() {
		setLayout(new FlowLayout());
		Label lab = new Label("국가를 선택하세요");
		lab.setBackground(new Color(183, 240, 177));
		Choice choice = new Choice();
		choice.add("미국"); choice.add("영국"); choice.add("중국");
		choice.add("한국"); choice.add("종국"); choice.add("떡국");
		add(lab); add(choice);
		setSize(200, 200);
		setVisible(true);
	}
 	public static void main(String[] args) {
		new Choice1();
	}
}