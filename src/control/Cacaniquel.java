package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Cacaniquel implements ActionListener {

	private JTextField numero1;
	private JTextField numero2;
	private JTextField numero3;
	private JButton gira;
	
	public Cacaniquel (JTextField numero1, JTextField numero2, 
			JTextField numero3, JButton gira) {
		
		this.gira = gira;
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		
	}
	
	private void giraNiquel(){
		
		Thread t1 = new ThreadCacaniquel(numero1, gira);
		Thread t2 = new ThreadCacaniquel(numero2, gira);
		Thread t3 = new ThreadCacaniquel(numero3, gira);
		t1.start();
		t2.start();
		t3.start();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		giraNiquel();
	}
}
