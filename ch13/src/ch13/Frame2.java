package ch13;

import java.awt.*;

public class Frame2 extends Frame {
	public Frame2(String title) {
		super(title);
		setSize(200, 200);
		setBackground(Color.red);
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		new Frame2("´ë¹Ú");
	}
}
