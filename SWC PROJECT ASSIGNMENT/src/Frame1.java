import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JTextPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.DropMode;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	
	double masCitizen = 0.0;
	double priceAdult = 0.0;
	double priceChildren = 0.0;
	double priceElder = 0.0;
	double totalPrice = 0.0;
	double price = 0.0;
	double discount = 0.0;
	String days = "";
	JComboBox comboBoxDate = new JComboBox();
	DecimalFormat d = new DecimalFormat("#.##");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setForeground(UIManager.getColor("CheckBox.focus"));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Downloads\\harimau aum.jpg"));
		setTitle("ALPHA ZOO");
		setBackground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel TicketPanel = new JPanel();
		TicketPanel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(85, 107, 47), null, null, null));
		TicketPanel.setBackground(new Color(128, 128, 0));
		TicketPanel.setBounds(27, 33, 278, 451);
		contentPane.add(TicketPanel);
		TicketPanel.setLayout(null);
		
		JPanel displayTicket = new JPanel();
		displayTicket.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(85, 107, 47), null, null, null));
		displayTicket.setBackground(new Color(128, 128, 0));
		displayTicket.setBounds(335, 33, 422, 451);
		contentPane.add(displayTicket);
		displayTicket.setLayout(null);
		
		JLabel lblmasCitizen1 = new JLabel("CITIZENSHIP :");
		lblmasCitizen1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblmasCitizen1.setBounds(33, 217, 96, 14);
		displayTicket.add(lblmasCitizen1);
		
		JLabel lblElder_1 = new JLabel("ELDER :");
		lblElder_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblElder_1.setBounds(33, 176, 96, 14);
		displayTicket.add(lblElder_1);
		
		JLabel lblChildren_1 = new JLabel("CHILDREN :\r\n");
		lblChildren_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChildren_1.setBounds(33, 138, 96, 14);
		displayTicket.add(lblChildren_1);
		
		JLabel lblcatAdult = new JLabel("ADULT :");
		lblcatAdult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblcatAdult.setBounds(33, 96, 96, 14);
		displayTicket.add(lblcatAdult);
		
		
		
		JLabel lblTotal = new JLabel("TOTAL AMOUNT");
		lblTotal.setVerticalAlignment(SwingConstants.TOP);
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblTotal.setBackground(new Color(85, 107, 47));
		lblTotal.setBounds(33, 289, 151, 24);
		displayTicket.add(lblTotal);
		
		
		
		JPanel totalpanel = new JPanel();
		totalpanel.setBounds(33, 324, 152, 88);
		displayTicket.add(totalpanel);
		totalpanel.setLayout(null);
		
		JLabel lblAmount = new JLabel("");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setFont(new Font("DS-Digital", Font.BOLD, 31));
		lblAmount.setBounds(57, 14, 85, 61);
		totalpanel.add(lblAmount);
		
		JLabel lblRM = new JLabel("RM");
		lblRM.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblRM.setHorizontalAlignment(SwingConstants.CENTER);
		lblRM.setBounds(10, 11, 46, 66);
		totalpanel.add(lblRM);
		
		JPanel categoryPanel = new JPanel();
		categoryPanel.setLayout(null);
		categoryPanel.setBounds(160, 61, 251, 217);
		displayTicket.add(categoryPanel);
		
		JLabel lbldispChild = new JLabel("");
		lbldispChild.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbldispChild.setHorizontalAlignment(SwingConstants.CENTER);
		lbldispChild.setBounds(28, 73, 102, 14);
		categoryPanel.add(lbldispChild);
		
		JLabel lbldispAdult = new JLabel("");
		lbldispAdult.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbldispAdult.setHorizontalAlignment(SwingConstants.CENTER);
		lbldispAdult.setBounds(28, 30, 102, 14);
		categoryPanel.add(lbldispAdult);
		
		JLabel lbldispElder = new JLabel("");
		lbldispElder.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbldispElder.setHorizontalAlignment(SwingConstants.CENTER);
		lbldispElder.setBounds(28, 116, 102, 14);
		categoryPanel.add(lbldispElder);
		
		JLabel lblmasCitizen2 = new JLabel("");
		lblmasCitizen2.setHorizontalAlignment(SwingConstants.CENTER);
		lblmasCitizen2.setBounds(28, 149, 202, 24);
		categoryPanel.add(lblmasCitizen2);
		lblmasCitizen2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblDate1_1 = new JLabel("");
		lblDate1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDate1_1.setBounds(28, 182, 202, 24);
		categoryPanel.add(lblDate1_1);
		
		JLabel lblPriceAdult = new JLabel("");
		lblPriceAdult.setFont(new Font("DS-Digital", Font.PLAIN, 20));
		lblPriceAdult.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceAdult.setBounds(137, 30, 93, 14);
		categoryPanel.add(lblPriceAdult);
		
		JLabel lblPriceChild = new JLabel("");
		lblPriceChild.setFont(new Font("DS-Digital", Font.PLAIN, 20));
		lblPriceChild.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceChild.setBounds(137, 73, 93, 14);
		categoryPanel.add(lblPriceChild);
		
		JLabel lblPriceElder = new JLabel("");
		lblPriceElder.setFont(new Font("DS-Digital", Font.PLAIN, 20));
		lblPriceElder.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriceElder.setBounds(137, 116, 93, 14);
		categoryPanel.add(lblPriceElder);
		
		JLabel lblTotal1 = new JLabel("TOTAL");
		lblTotal1.setBounds(139, 2, 80, 14);
		categoryPanel.add(lblTotal1);
		lblTotal1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTotal1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblQuantity = new JLabel("QUANTITY");
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblQuantity.setBounds(37, 2, 80, 14);
		categoryPanel.add(lblQuantity);
		
		JLabel lblDate1 = new JLabel("DATE OF CHOICE ");
		lblDate1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate1.setBounds(33, 253, 117, 14);
		displayTicket.add(lblDate1);
		
		JLabel lblOrderSummary = new JLabel("━ORDER SUMMARY━━━━━━━━━━━━━━━━━━━━━\r\n");
		lblOrderSummary.setVerticalAlignment(SwingConstants.TOP);
		lblOrderSummary.setHorizontalAlignment(SwingConstants.LEFT);
		lblOrderSummary.setForeground(Color.WHITE);
		lblOrderSummary.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblOrderSummary.setBackground(new Color(85, 107, 47));
		lblOrderSummary.setBounds(10, 11, 412, 24);
		displayTicket.add(lblOrderSummary);
		
		JLabel lblAdult = new JLabel("ADULT ----------");
		lblAdult.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAdult.setBounds(33, 205, 154, 14);
		TicketPanel.add(lblAdult);
		
		JLabel lblChildren = new JLabel("CHILDREN-------");
		lblChildren.setFont(new Font("Dialog", Font.BOLD, 14));
		lblChildren.setBounds(33, 250, 154, 14);
		TicketPanel.add(lblChildren);
		
		JLabel lblElder = new JLabel("ELDER ------------");
		lblElder.setFont(new Font("Dialog", Font.BOLD, 14));
		lblElder.setBounds(33, 292, 154, 14);
		TicketPanel.add(lblElder);
		
		JLabel lblTitle = new JLabel("TICKET ORDER");
		lblTitle.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitle.setForeground(UIManager.getColor("Button.highlight"));
		lblTitle.setBackground(new Color(85, 107, 47));
		lblTitle.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblTitle.setBounds(13, 11, 151, 24);
		TicketPanel.add(lblTitle);
		
		SpinnerModel plusAdult = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerAdult = new JSpinner(plusAdult);
		spinnerAdult.setBounds(197, 203, 53, 22);
		TicketPanel.add(spinnerAdult);
		
		SpinnerModel plusChildren = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerChild = new JSpinner(plusChildren);
		spinnerChild.setBounds(197, 248, 53, 22);
		TicketPanel.add(spinnerChild);
		
		SpinnerModel plusElder = new SpinnerNumberModel(0, 0, 100, 1);
		JSpinner spinnerElder = new JSpinner(plusElder);
		spinnerElder.setBounds(197, 290, 53, 22);
		TicketPanel.add(spinnerElder);
		
		JRadioButton rdbtnYes = new JRadioButton("YES");
		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnYes.isSelected()) {
					priceAdult = 50.00;
					priceChildren = 25.00;
					priceElder = 15.00;
					
					lblPriceAdult.setText(String.format("%d",priceAdult));
					lblPriceChild.setText(String.format("%d",priceChildren));
					lblPriceElder.setText(String.format("%d",priceElder));
					
				}
				
			}
		});
		rdbtnYes.setBackground(new Color(85, 107, 47));
		rdbtnYes.setForeground(new Color(240, 248, 255));
		rdbtnYes.setBounds(41, 97, 81, 34);
		TicketPanel.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("NO");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNo.isSelected()) {
					priceAdult = 60.00;
					priceChildren = 30.00;
					priceElder = 20.00;
					
					
			}
				
			}
		});
		rdbtnNo.setBackground(new Color(85, 107, 47));
		rdbtnNo.setForeground(new Color(240, 248, 255));
		rdbtnNo.setBounds(161, 97, 89, 34);
		TicketPanel.add(rdbtnNo);
		
		JLabel lblNationality = new JLabel("ARE YOU A \r\nMALAYSIAN?");
		lblNationality.setHorizontalAlignment(SwingConstants.CENTER);
		lblNationality.setToolTipText("");
		lblNationality.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNationality.setBounds(41, 23, 188, 75);
		TicketPanel.add(lblNationality);
		
		JButton btnProceed = new JButton("PROCEED TO PAYMENT");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double total = Double.parseDouble(lblAmount.getText());
				Payment r = new Payment(total);
				r.show();
				dispose();
				
				
				
			}
		});
		btnProceed.setBackground(Color.BLUE);
		btnProceed.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		btnProceed.setBounds(217, 369, 173, 43);
		displayTicket.add(btnProceed);
		
		JButton btnCalc = new JButton("CALCULATE");
		btnCalc.setBounds(12, 381, 110, 44);
		TicketPanel.add(btnCalc);
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int totalAdult = (int) spinnerAdult.getValue();
				int totalChildren = (int) spinnerChild.getValue();
				int totalElder = (int) spinnerElder.getValue();
				
				lbldispAdult.setText(String.format("%d",totalAdult ));
				lbldispChild.setText(String.format("%d",totalChildren ));
				lbldispElder.setText(String.format("%d",totalElder ));
				
				double Adult = totalAdult*priceAdult;
				String z = Double.toString(Adult);
				double Children = totalChildren*priceChildren;
				String y = Double.toString(Children);
				double Elder= totalElder*priceElder;
				String x = Double.toString(Elder);
				
				if(rdbtnYes.isSelected()) 
				{
					lblmasCitizen2.setText("MALAYSIAN");
				} 
				else  
				{
					lblmasCitizen2.setText("NON-MALAYSIAN");
				} 
				
				if (((String) comboBoxDate.getSelectedItem()).equals("Monday - Thursday")) 
				{
					days = "Monday - Thursday";
					lblDate1_1.setText(days);
					
				} else if (((String) comboBoxDate.getSelectedItem()).equals("Friday - Sunday"))
				{
					days = "Friday - Sunday";
					lblDate1_1.setText(days);
				}
				
				totalPrice = (totalAdult*priceAdult) + (totalChildren*priceChildren) + (totalElder*priceElder);
				lblPriceAdult.setText("RM"+ z);
				lblPriceChild.setText("RM"+ y);
				lblPriceElder.setText("RM"+ x);
				lblAmount.setText("" + d.format(totalPrice));
			
			}
		});
		btnCalc.setForeground(Color.BLACK);
		btnCalc.setBackground(new Color(102, 255, 0));
		btnCalc.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		
		comboBoxDate = new JComboBox();
		String[] a = {"PICK THE DATE","Monday - Thursday","Friday - Sunday"};
		comboBoxDate = new JComboBox(a);
		comboBoxDate.setBounds(165, 335, 103, 22);
		TicketPanel.add(comboBoxDate);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				rdbtnYes.setSelected(false);
			    rdbtnNo.setSelected(false);
				spinnerAdult.setValue(0);
				spinnerChild.setValue(0);
				spinnerElder.setValue(0);
				comboBoxDate.setSelectedIndex(0);
				lbldispAdult.setText("");
				lbldispChild.setText("");
				lbldispElder.setText("");
				lblmasCitizen2.setText("");
				lblDate1_1.setText("");
				lblAmount.setText("");
				lblPriceAdult.setText("");
				lblPriceChild.setText("");
				lblPriceElder.setText("");
			}
		});
		btnClear.setForeground(Color.BLACK);
		btnClear.setBackground(new Color(255, 0, 0));
		btnClear.setFont(new Font("Bahnschrift", Font.BOLD, 12));
		btnClear.setBounds(153, 381, 97, 44);
		TicketPanel.add(btnClear);
		
		JLabel lblCategory = new JLabel("CATEGORY\r\n");
		lblCategory.setVerticalAlignment(SwingConstants.TOP);
		lblCategory.setHorizontalAlignment(SwingConstants.LEFT);
		lblCategory.setForeground(Color.WHITE);
		lblCategory.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblCategory.setBackground(new Color(85, 107, 47));
		lblCategory.setBounds(13, 159, 151, 24);
		TicketPanel.add(lblCategory);
		
		JLabel lblDate = new JLabel("PICK YOUR DATE");
		lblDate.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDate.setBounds(33, 337, 126, 14);
		TicketPanel.add(lblDate);
		
	}

	
}