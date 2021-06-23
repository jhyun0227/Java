package ch14;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Audio1 extends Frame {
	AudioClip audio;
	Button play, stop, loop;

	public void Audio1() {
		setLayout(new FlowLayout());
		play = new Button("play");
		stop = new Button("stop");
		loop = new Button("loop");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	public static void main(String[] args) {
		
	}
}
