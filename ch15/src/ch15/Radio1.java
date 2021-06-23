package ch15;
import java.awt.*;
import javax.swing.*;
public class Radio1 extends JFrame{
	public Radio1() {
		setLayout(new FlowLayout());
		JLabel lab = new JLabel("<html><font size=5 color=red>당신은</font> 누구입니까 ?</html>");
		JRadioButton btn1 = new JRadioButton("2000년 이전 남자");
		JRadioButton btn2 = new JRadioButton("2000년 이전 여자");
		JRadioButton btn3 = new JRadioButton("2000년 이후 남자");
		JRadioButton btn4 = new JRadioButton("2000년 이전 여자");
		JRadioButton btn5 = new JRadioButton("외국인 남자");
		JRadioButton btn6 = new JRadioButton("외국인 여자");
		JRadioButton btn7 = new JRadioButton("우주인");
		ButtonGroup bg = new ButtonGroup();
		bg.add(btn1); bg.add(btn2); bg.add(btn3); bg.add(btn4); // 같은 그룹
		bg.add(btn5); bg.add(btn6); bg.add(btn7); 
		add(lab); add(btn1); add(btn2); add(btn3); add(btn4); add(btn5); add(btn6); add(btn7);
		setSize(200, 300); setVisible(true); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Radio1();
	}
}