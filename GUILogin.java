
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghost
 */
public class GUILogin implements ActionListener{
    
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel userlabel, passlabel, success;
    private static JTextField userText;
    private static JPasswordField passText;
    private static JButton button;
    
    public static void main(String[] args){
      
    frame = new JFrame();
    frame.setSize(350,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    panel = new JPanel();
    frame.add(panel);
    
    panel.setLayout(null);
    
    userlabel = new JLabel("User");
    userlabel.setBounds(10, 20, 80, 25);
    panel.add(userlabel);
    
    passlabel = new JLabel("Pass");
    passlabel.setBounds(10, 50, 80, 25);
    panel.add(passlabel);
    
    userText = new JTextField();
    userText.setBounds(100,20,165,25);
    panel.add(userText);
    
    passText = new JPasswordField();
    passText.setBounds(100,50,165,25);
    panel.add(passText);
   
    button = new JButton("Sign in");
    button.setBounds(160,80,100,25);
    panel.add(button);
    button.addActionListener(new GUILogin());
    
    success = new JLabel("");
    success.setBounds(10,110,300,25);
    panel.add(success);
    
    
    frame.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String user = userText.getText();
        String pass = passText.getText();
        
        if(user.equals("user") && pass.equals("password")){
            success.setText("Login Successful");
        }
        else success.setText("Login Failed Try again!");
    }
}
