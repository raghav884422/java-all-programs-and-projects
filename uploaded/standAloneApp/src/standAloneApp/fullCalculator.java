package standAloneApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class fullCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private final JLabel lblNewLabel_2 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fullCalculator frame = new fullCalculator();
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
	public fullCalculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Desktop\\HTML\\images\\panda.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 771);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD, 36));
		lblNewLabel.setBounds(144, 10, 420, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(30, 117, 172, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Number 2:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1_1.setBounds(30, 172, 172, 13);
		contentPane.add(lblNewLabel_1_1);
		
		a = new JTextField();
		a.setBounds(163, 117, 216, 26);
		contentPane.add(a);
		a.setColumns(10);
		
		JTextArea result = new JTextArea();
		result.setFont(new Font("Monospaced", Font.ITALIC, 20));
		result.setBounds(30, 284, 534, 79);
		contentPane.add(result);
		
		JButton btAdd = new JButton("ADD");
		btAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				int sum = n1+n2;
				result.setText("the sum of two number is "+sum);
			}
		});
		btAdd.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btAdd.setBounds(470, 65, 94, 33);
		contentPane.add(btAdd);
		
		JButton btsub = new JButton("SUB");
		btsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				int sub = n1-n2;
				result.setText("The substracion of two number is: "+sub);
			}
		});
		btsub.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btsub.setBounds(470, 116, 94, 33);
		contentPane.add(btsub);
		
		JButton btMul = new JButton("MUL");
		btMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				int mul = n1*n2;
				result.setText("The substracion of two number is: "+mul);
				
			}
		});
		btMul.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btMul.setBounds(470, 171, 94, 33);
		contentPane.add(btMul);
		
		JButton btDiv = new JButton("DIV");
		btDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				if(n2>0) {
				int div = n1/n2;
				result.setText("The substracion of two number is: "+div);
				}else {
					System.out.println("invailid input");
				}
				}
		});
		btDiv.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btDiv.setBounds(470, 214, 94, 33);
		contentPane.add(btDiv);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(163, 172, 216, 26);
		contentPane.add(b);
		lblNewLabel_2.setBounds(74, 63, 45, 26);
		contentPane.add(lblNewLabel_2);
		
		JButton btMod = new JButton("MOD");
		btMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				if(n2>0) {
				int div = n1%n2;
				result.setText("The substracion of two number is: "+div);
				}else {
					System.out.println("invailid input");
				}
				
				
			}
		});
		btMod.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btMod.setBounds(622, 65, 94, 33);
		contentPane.add(btMod);
		
		JButton btnAreaOfRactangle = new JButton("Area of ractangle");
		btnAreaOfRactangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
				String num2 = b.getText();
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				int mul = n1*n2;
				result.setText("The area of square is: "+mul);
			}
		});
		btnAreaOfRactangle.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnAreaOfRactangle.setBounds(586, 122, 216, 41);
		contentPane.add(btnAreaOfRactangle);
		
		JButton btnAreaOfSquare = new JButton("perimeter of ractangle");
		btnAreaOfSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = a.getText();
			String num2 = b.getText();
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int mul = 2*(n1+n2);
			result.setText("The substracion of two number is: "+mul);
			}
		});
		btnAreaOfSquare.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnAreaOfSquare.setBounds(573, 190, 243, 41);
		contentPane.add(btnAreaOfSquare);

	}
}
