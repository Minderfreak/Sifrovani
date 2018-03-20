import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Okno  extends JFrame{
	private JLabel labelAdresa;
	private JTextField fieldAdresa;
	private JLabel labelHeslo;
	private JTextField fieldHeslo;
	private JButton button;
	private JLabel vysledek;
	
	public Okno() {
		setTitle("ŠifrovaèkaTvojeMaèka");
		setSize(450,100);
		setLayout(new FlowLayout());
		labelAdresa = new JLabel("Zadej adresu: ");
		add(labelAdresa);
		fieldAdresa = new JTextField(10);
		add(fieldAdresa);
		labelHeslo = new JLabel("Zadej heslo: ");
		add(labelHeslo);
		fieldHeslo = new JTextField(10);
		add(fieldHeslo);
		button = new JButton("Odkrágluj");
		vysledek = new JLabel("Zašifrované: ");
		add(vysledek);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					vysledek.setText("Zašifrované: "+(Sifrovani.zasifrovat(fieldAdresa.getText(), fieldHeslo.getText())));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		add(button);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);;
		setVisible(true);
	}
}
