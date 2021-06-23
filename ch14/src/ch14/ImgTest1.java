package ch14;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ImgTest1 extends Frame {
	Image img;
	public ImgTest1() {
		img = Toolkit.getDefaultToolkit().getImage("lenna.JPG");
		setSize(300, 300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	public static void main(String[] args) {
		new ImgTest1();
	}
}