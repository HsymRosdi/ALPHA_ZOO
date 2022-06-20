import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;

public class Payment extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtPhoneNumber;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	DecimalFormat d = new DecimalFormat("#.##");

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment(double total) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\OneDrive\\Pictures\\linonearafd.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
	    JPanel MethodPanel = new JPanel();
	    MethodPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(85, 107, 47), null, null, null));
	    MethodPanel.setBackground(new Color(128, 128, 0));
	    MethodPanel.setBounds(27, 33, 278, 452);
	    contentPane.add(MethodPanel);
	    MethodPanel.setLayout(null);
	    
	    JLabel lblPaymentMethod = new JLabel("PAYMENT METHOD");
	    lblPaymentMethod.setVerticalAlignment(SwingConstants.TOP);
	    lblPaymentMethod.setHorizontalAlignment(SwingConstants.LEFT);
	    lblPaymentMethod.setForeground(Color.WHITE);
	    lblPaymentMethod.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
	    lblPaymentMethod.setBackground(new Color(85, 107, 47));
	    lblPaymentMethod.setBounds(10, 165, 245, 24);
	    MethodPanel.add(lblPaymentMethod);
	    
	    JLabel lblSelectYourPayment = new JLabel("SELECT YOUR PAYMENT METHOD");
	    lblSelectYourPayment.setVerticalAlignment(SwingConstants.TOP);
	    lblSelectYourPayment.setHorizontalAlignment(SwingConstants.LEFT);
	    lblSelectYourPayment.setForeground(Color.WHITE);
	    lblSelectYourPayment.setFont(new Font("Dialog", Font.ITALIC, 12));
	    lblSelectYourPayment.setBackground(new Color(85, 107, 47));
	    lblSelectYourPayment.setBounds(10, 191, 245, 24);
	    MethodPanel.add(lblSelectYourPayment);
	    
	    JComboBox comboBoxDate = new JComboBox();
		String[] a = {"PICK YOUR PAYMENT METHOD","CREDIT CARD","CASH", "e-WALLET"};
		
		JLabel lblCustDetails = new JLabel("CUSTOMER DETAILS");
		lblCustDetails.setVerticalAlignment(SwingConstants.TOP);
		lblCustDetails.setHorizontalAlignment(SwingConstants.LEFT);
		lblCustDetails.setForeground(Color.WHITE);
		lblCustDetails.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblCustDetails.setBackground(new Color(85, 107, 47));
		lblCustDetails.setBounds(10, 11, 245, 24);
		MethodPanel.add(lblCustDetails);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(20, 89, 93, 20);
		MethodPanel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblInput = new JLabel("ENTER YOUR DETAILS FOR RECEIPT REFERENCES");
		lblInput.setVerticalAlignment(SwingConstants.TOP);
		lblInput.setHorizontalAlignment(SwingConstants.LEFT);
		lblInput.setForeground(Color.WHITE);
		lblInput.setFont(new Font("Dialog", Font.ITALIC, 10));
		lblInput.setBackground(new Color(85, 107, 47));
		lblInput.setBounds(10, 43, 268, 24);
		MethodPanel.add(lblInput);
		
		txtLastName = new JTextField();
		txtLastName.setColumns(10);
		txtLastName.setBounds(142, 89, 93, 20);
		MethodPanel.add(txtLastName);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(20, 144, 125, 20);
		MethodPanel.add(txtPhoneNumber);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(20, 396, 215, 45);
		MethodPanel.add(lblNewLabel);
		
		
		JRadioButton rdbtnCredit = new JRadioButton("CREDIT/DEBIT CARD");
		buttonGroup.add(rdbtnCredit);
		rdbtnCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnCredit.isSelected()) 
				{
					lblNewLabel.setText("CREDIT/DEBIT CARD");
					lblNewLabel.setVisible(false);
				} 
				
			}
		});
		rdbtnCredit.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnCredit.setBounds(20, 220, 215, 40);
		MethodPanel.add(rdbtnCredit);
		
		JRadioButton rdbtnCash = new JRadioButton("E-WALLET");
		rdbtnCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if(rdbtnCash.isSelected()) 
				{
					lblNewLabel.setText("E-WALLET");
					lblNewLabel.setVisible(false);
				} 
			}
		});
		buttonGroup.add(rdbtnCash);
		rdbtnCash.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnCash.setBounds(20, 275, 215, 40);
		MethodPanel.add(rdbtnCash);
		
		JLabel lblFirstName = new JLabel("FIRST NAME");
		lblFirstName.setVerticalAlignment(SwingConstants.TOP);
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblFirstName.setBackground(new Color(85, 107, 47));
		lblFirstName.setBounds(20, 63, 89, 24);
		MethodPanel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("LAST NAME");
		lblLastName.setVerticalAlignment(SwingConstants.TOP);
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblLastName.setBackground(new Color(85, 107, 47));
		lblLastName.setBounds(142, 65, 89, 24);
		MethodPanel.add(lblLastName);
		
		JLabel lblPhoneNumber = new JLabel("PHONE NUMBER");
		lblPhoneNumber.setVerticalAlignment(SwingConstants.TOP);
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Dialog", Font.ITALIC, 12));
		lblPhoneNumber.setBackground(new Color(85, 107, 47));
		lblPhoneNumber.setBounds(20, 120, 125, 24);
		MethodPanel.add(lblPhoneNumber);
		
		JTextArea txtReceipt = new JTextArea();
		txtReceipt.setBackground(new Color(255, 255, 255));
		txtReceipt.setBounds(333, 33, 278, 452);
		contentPane.add(txtReceipt);
		
		JButton btnGenerate = new JButton("GENERATE RECEIPT");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtReceipt.setText("╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾ALPHA ZOO╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾\n");
				txtReceipt.setText(txtReceipt.getText() + "╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾\n\n\n");
				txtReceipt.setText(txtReceipt.getText() + "╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾YOUR RECEIPT╾╾╾╾╾╾╾╾╾╾╾╾╾╾╾\n");
				txtReceipt.setText(txtReceipt.getText() + "NAME : " + txtFirstName.getText() + " " + txtLastName.getText()+ "\n");
				txtReceipt.setText(txtReceipt.getText() + "PHONE NUMBER :" + txtPhoneNumber.getText() + "\n\n");
				txtReceipt.setText(txtReceipt.getText() + "PAYMENT METHOD :" + lblNewLabel.getText() + "\n\n");
				txtReceipt.setText(txtReceipt.getText() + "TOTAL AMOUNT : " + "RM" + d.format(total) + "\n\n");
				txtReceipt.setText(txtReceipt.getText() + "====================================================\n");
				txtReceipt.setText(txtReceipt.getText() + "=====THANKYOU FOR VISITING OUR ZOO!=====\n");
				txtReceipt.setText(txtReceipt.getText() + "==========PLEASE COME AGAIN!==========\n");
				
			}
		});
		btnGenerate.setFont(new Font("Bahnschrift", Font.BOLD, 16));
		btnGenerate.setBounds(20, 394, 215, 47);
		MethodPanel.add(btnGenerate);
		
		JLabel lblTotal = new JLabel("RM" + d.format(total));
		lblTotal.setForeground(new Color(0, 255, 0));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("DS-Digital", Font.PLAIN, 30));
		lblTotal.setBounds(20, 338, 215, 47);
		MethodPanel.add(lblTotal);

		
}

}