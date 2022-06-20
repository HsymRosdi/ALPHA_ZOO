import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JLabel lblPassword;
	private JLabel lblZoo;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\OneDrive\\Pictures\\SWC\\how-to-draw-a-panda-1.jpg"));
		setTitle("ALPHA ZOO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsername.setBounds(119, 105, 72, 14);
		contentPane.add(lblUsername);
		
		textUsername = new JTextField();
		textUsername.setBounds(201, 102, 227, 20);
		contentPane.add(textUsername);
		textUsername.setColumns(10);
		
		lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(119, 143, 72, 14);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Username = textUsername.getText().toString();
				String password = passwordField.getText().toString();
				
				if(Username.equals("admin") && password.equals("123") ) {
					Frame1 a = new Frame1();
					a.show();
					dispose();
			}
				else {
					JOptionPane.showMessageDialog(passwordField, "Your username or password is incorrect!!");
				}
			}
		});
		btnLogin.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnLogin.setBounds(158, 188, 100, 36);
		contentPane.add(btnLogin);
		
		JButton btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(299, 188, 129, 36);
		contentPane.add(btnNewButton_1);
		
		lblZoo = new JLabel("");
		lblZoo.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\ALPHA ZOO.png"));
		lblZoo.setHorizontalAlignment(SwingConstants.CENTER);
		lblZoo.setBounds(183, 11, 245, 80);
		contentPane.add(lblZoo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 140, 227, 20);
		contentPane.add(passwordField);
	}
}