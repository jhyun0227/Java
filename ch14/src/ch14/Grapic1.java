package ch14;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Grapic1 extends Frame {
	public Grapic1() {
		setSize(200, 200);		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);			}		});
	}
	public void paint(Graphics g) {
		g.drawLine(20, 30,150, 170);
		g.setColor(Color.GREEN);
		g.drawRect(20, 30, 100, 100); // g.fillRect(20, 30, 100, 100);
		g.setColor(Color.BLUE);
		g.fillOval(50, 30, 100, 150); // g.drawOval(50, 30, 100, 150);
	}
	public static void main(String[] args) {
		new Grapic1();
	}
}