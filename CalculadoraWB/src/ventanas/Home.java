package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class Home extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setBackground(new Color(255, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNum1 = new JButton("1");
		btnNum1.setForeground(new Color(0, 0, 0));
		btnNum1.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum1.setBounds(50, 150, 71, 61);
		btnNum1.setBackground(new Color(128, 128, 128));
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setBackground(new Color(128, 128, 128));
		btnNum2.setForeground(new Color(0, 0, 0));
		btnNum2.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum2.setBounds(121, 150, 71, 61);
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setBackground(new Color(128, 128, 128));
		btnNum3.setForeground(new Color(0, 0, 0));
		btnNum3.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum3.setBounds(192, 150, 71, 61);
		contentPane.add(btnNum3);
		
		JButton btnNum4 = new JButton("4");
		btnNum4.setBackground(new Color(128, 128, 128));
		btnNum4.setForeground(new Color(0, 0, 0));
		btnNum4.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum4.setBounds(50, 222, 71, 61);
		contentPane.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setBackground(new Color(128, 128, 128));
		btnNum5.setForeground(new Color(0, 0, 0));
		btnNum5.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum5.setBounds(121, 222, 71, 61);
		contentPane.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setBackground(new Color(128, 128, 128));
		btnNum6.setForeground(new Color(0, 0, 0));
		btnNum6.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum6.setBounds(192, 222, 71, 61);
		contentPane.add(btnNum6);
		
		JButton btnNum7 = new JButton("7");
		btnNum7.setBackground(new Color(128, 128, 128));
		btnNum7.setForeground(new Color(0, 0, 0));
		btnNum7.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum7.setBounds(50, 294, 71, 61);
		contentPane.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setBackground(new Color(128, 128, 128));
		btnNum8.setForeground(new Color(0, 0, 0));
		btnNum8.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum8.setBounds(121, 294, 71, 61);
		contentPane.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setBackground(new Color(128, 128, 128));
		btnNum9.setForeground(new Color(0, 0, 0));
		btnNum9.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum9.setBounds(192, 294, 71, 61);
		contentPane.add(btnNum9);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setBackground(new Color(128, 128, 128));
		btnNum0.setForeground(new Color(0, 0, 0));
		btnNum0.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNum0.setBounds(121, 366, 71, 61);
		contentPane.add(btnNum0);
		
		JButton btnPunto = new JButton(".");
		btnPunto.setBackground(new Color(128, 128, 128));
		btnPunto.setForeground(new Color(0, 0, 0));
		btnPunto.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnPunto.setBounds(50, 366, 71, 61);
		contentPane.add(btnPunto);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		textField.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		textField.setBounds(20, 47, 401, 61);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSuma = new JButton("+");
		btnSuma.setBackground(new Color(128, 128, 128));
		btnSuma.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnSuma.setBounds(319, 152, 81, 55);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.setBackground(new Color(128, 128, 128));
		btnResta.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnResta.setBounds(319, 222, 81, 55);
		contentPane.add(btnResta);
		
		JButton btnDivision = new JButton("/");
		btnDivision.setBackground(new Color(128, 128, 128));
		btnDivision.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnDivision.setBounds(319, 294, 81, 55);
		contentPane.add(btnDivision);
		
		JButton btnMultiplicacion = new JButton("X");
		btnMultiplicacion.setBackground(new Color(128, 128, 128));
		btnMultiplicacion.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnMultiplicacion.setBounds(319, 366, 81, 55);
		contentPane.add(btnMultiplicacion);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(128, 128, 128));
		btnIgual.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnIgual.setBounds(192, 366, 71, 61);
		contentPane.add(btnIgual);
	}
	
	
	public int Suma() {
		
		
		
		return 0;
	}
	
	
	
	
	
	
}
