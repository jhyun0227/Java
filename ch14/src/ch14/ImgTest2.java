package ch14;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
public class ImgTest2 extends Frame {
	Image img;
	public ImgTest2() {
		String str="https://menu.mt.co.kr/moneyweek/thumb/2021/04/08/06/2021040810068090504_1.jpg";
		try{URL url = new URL(str);
			img = Toolkit.getDefaultToolkit().getImage(url);
		} catch (MalformedURLException e) {	}
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(300, 300); setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0, 20, this);
	}
	public static void main(String[] args) {
		new ImgTest2();
	}
}