package ch15;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Table1 extends JFrame {
	public Table1() {
		String[] title = {"¹øÈ£", "ÀÌ¸§", "³ªÀÌ"};
		String data[][] = { {"1","¼¼Á¤","24"},{"2","¿øºó","37"},{"3","±èÅÂÈñ","36"}};
		DefaultTableModel model = new DefaultTableModel(data, title);
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		add(sp); setSize(300, 200); setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Table1();
	}
}