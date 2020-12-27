import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Frame1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 623, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(24, 28, 271, 57);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(294, 28, 284, 57);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
//ADD		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,ans;
				 try {
					 num1=Integer.parseInt(textFieldNum1.getText());
					 num2=Integer.parseInt(textFieldNum2.getText());
					 
					 ans=num1+num2;
					 textFieldAns.setText(Integer.toString(ans));
				 	 }catch(Exception e) {
					 JOptionPane.showMessageDialog(null, "Please Enter Valid number");
				 }
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton.setBounds(24, 129, 122, 52);
		frame.getContentPane().add(btnNewButton);
//MINUS		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				 try {
					 num1=Integer.parseInt(textFieldNum1.getText());
					 num2=Integer.parseInt(textFieldNum2.getText());
					 
					 ans=num1-num2;
					 textFieldAns.setText(Integer.toString(ans));
				 	 }catch(Exception e1) {
					 JOptionPane.showMessageDialog(null, "Please Enter Valid number");
				 }
			}
		});
//MULTIPLY
		btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				 try {
					 num1=Integer.parseInt(textFieldNum1.getText());
					 num2=Integer.parseInt(textFieldNum2.getText());
					 
					 ans=num1*num2;
					 textFieldAns.setText(Integer.toString(ans));
				 	 }catch(Exception e1) {
					 JOptionPane.showMessageDialog(null, "Please Enter Valid number");
				 }
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_1.setBounds(164, 129, 122, 52);
		frame.getContentPane().add(btnNewButton_1);
//DIVIDE
		btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				 try {
					 num1=Integer.parseInt(textFieldNum1.getText());
					 num2=Integer.parseInt(textFieldNum2.getText());
					 
					 ans=num1/num2;
					 textFieldAns.setText(Integer.toString(ans));
				 	 }catch(Exception e1) {
					 JOptionPane.showMessageDialog(null, "Please Enter Valid number");
				 }
	
			}
		});
		textFieldAns = new JTextField();
		textFieldAns.setBounds(336, 218, 209, 49);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(63, 221, 210, 42);
		frame.getContentPane().add(lblNewLabel);
		
		
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_2.setBounds(302, 129, 108, 52);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnNewButton_3.setBounds(427, 132, 118, 49);
		frame.getContentPane().add(btnNewButton_3);
	}
}
