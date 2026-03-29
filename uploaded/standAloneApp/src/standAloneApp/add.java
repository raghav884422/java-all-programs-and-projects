package standAloneApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel num11;
	private JLabel num2;
	private JTextField a;
	private JButton bt1;
	private JTextField b;
	private JTextArea result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add frame = new add();
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
	public add() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBackground(new Color(255, 0, 128));
		lblNewLabel.setBounds(107, -20, 238, 109);
		contentPane.add(lblNewLabel);
		
		num11 = new JLabel("NUM 1");
		num11.setFont(new Font("Tahoma", Font.BOLD, 17));
		num11.setBounds(16, 72, 108, 39);
		contentPane.add(num11);
		
		num2 = new JLabel("NUM 2");
		num2.setFont(new Font("Tahoma", Font.BOLD, 17));
		num2.setBounds(16, 107, 98, 45);
		contentPane.add(num2);
		
		a = new JTextField();
		a.setBounds(124, 85, 125, 26);
		contentPane.add(a);
		a.setColumns(10);
		
		bt1 = new JButton("ADD");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				code for addition
				String num1 =a.getText();
				String num22 = b.getText();
				int n1=Integer.parseInt(num1);
				int n2 = Integer.parseInt(num22);
				int res =n1+n2;
				result.setText("The addition of two number is : "+res);
				
		
			}
		});
		bt1.setBounds(295, 99, 108, 33);
		contentPane.add(bt1);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(124, 123, 125, 26);
		contentPane.add(b);
		
		result = new JTextArea();
		result.setFont(new Font("Monospaced", Font.PLAIN, 11));
		result.setBounds(42, 181, 266, 45);
		contentPane.add(result);

	}
}
