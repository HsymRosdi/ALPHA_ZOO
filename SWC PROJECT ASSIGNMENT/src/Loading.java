import javax.swing.*;
import java.awt.*;
 
public class Loading {
    static JFrame frame;//Creating object of JFrame
    Loading()//Creating constructor of the class
    {
        createGUI();
    }
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);//setting layout to null
        frame.setUndecorated(true);//Turning off Title bar
        frame.setSize(600,400);//Setting size
        frame.setLocationRelativeTo(null);//Setting location to the center of screen
        frame.getContentPane().setBackground(new Color(107, 142, 35));//setting background color
        
        JLabel lblZoo = new JLabel("");
        lblZoo.setIcon(new ImageIcon("C:\\Users\\User\\OneDrive\\Pictures\\ALPHA ZOO.png"));
        lblZoo.setHorizontalAlignment(SwingConstants.CENTER);
        lblZoo.setBounds(136, 50, 328, 138);
        frame.getContentPane().add(lblZoo);
        
        JLabel lblWelcome = new JLabel("W E L C O M E  ! ! !");
        lblWelcome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
        lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
        lblWelcome.setBounds(124, 161, 352, 78);
        frame.getContentPane().add(lblWelcome);
        frame.setVisible(true);//setting visibility
        
 
    }
    public static void main(String[] args){
            new Loading();//Creating object of SplashScreenDemo class
            try {
            	Thread.sleep(5000);
            	Login a = new Login();
            	a.show();
				frame.dispose();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            
            
    }
}
