package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.Cacaniquel;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numero1;
	private JTextField numero2;
	private JTextField numero3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		numero1 = new JTextField();
		numero1.setBounds(50, 57, 68, 130);
		contentPane.add(numero1);
		numero1.setColumns(10);
		
		numero2 = new JTextField();
		numero2.setColumns(10);
		numero2.setBounds(190, 57, 68, 130);
		contentPane.add(numero2);
		
		numero3 = new JTextField();
		numero3.setColumns(10);
		numero3.setBounds(329, 57, 68, 130);
		contentPane.add(numero3);
		
		JButton gira = new JButton("Girar");
		gira.setBounds(39, 11, 89, 23);
		contentPane.add(gira);
		
		Cacaniquel cacaniquel = new Cacaniquel (numero1, numero1, 
				numero1, gira);
		gira.addActionListener(cacaniquel);
	}

}
