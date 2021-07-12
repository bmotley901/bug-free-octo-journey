
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghost
 */
public class GUI implements ActionListener {
    
   int count = 0;
   private JLabel label;
   private JFrame frame;
   private JPanel panel;
   private JButton button;
   
    public GUI(){
        
        frame = new JFrame();
        
        button = new JButton("Click me");
        button.addActionListener(this);
        
        label = new JLabel("Number of Clicks: 0");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our First GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new GUI();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        count++;
        label.setText("Number of clicks: " + count);
    }
}
