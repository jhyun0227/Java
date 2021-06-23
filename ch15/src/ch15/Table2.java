package ch15;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
public class Table2 extends JFrame implements ActionListener {
	JPanel panel;	JTextField txId, txEmail;	JLabel laId, LaEmail;
	String[] title = {"Id", "Email"};	DefaultTableModel dtm = new DefaultTableModel(title, 0);
	JTable table = new JTable(dtm);		JScrollPane pane = new JScrollPane(table);
	public Table2() {
		panel = new JPanel(); panel.setBackground(Color.yellow);
		laId  = new JLabel("ID", JLabel.RIGHT);
		LaEmail = new JLabel("¿Ã∏ﬁ¿œ", JLabel.RIGHT);
		txId = new JTextField();   txEmail = new JTextField();
		panel.setLayout(new GridLayout(2,2));
		panel.add(laId);    panel.add(txId);
		panel.add(LaEmail); panel.add(txEmail);
		add("North", panel); add("Center", pane);
		setSize(300, 300);  setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		txId.addActionListener(this); txEmail.addActionListener(this);
	}
	public static void main(String[] args) {	new Table2();	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==txId) txEmail.requestFocus();
		else {
			String[] temp = {txId.getText(), txEmail.getText()};
			dtm.addRow(temp); 			txId.setText("");
			txEmail.setText("");		txId.requestFocus();
		}
	}
}