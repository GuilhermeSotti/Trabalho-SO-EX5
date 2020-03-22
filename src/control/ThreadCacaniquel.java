package control;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ThreadCacaniquel extends Thread {

	private JTextField numero;
	private JButton gira;
	
	public ThreadCacaniquel (JTextField numero, JButton gira) {
		
		this.gira = gira;
		this.numero = numero;
		
	}
	
	private void giraNiquel(){
		
		gira.setEnabled(false);
		for (int i = 0; i<= (int)Math.random()*150; i++) {
			
			numero = ((int) Math.random()*7);
			
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		gira.setEnabled(true);
	}		
}
