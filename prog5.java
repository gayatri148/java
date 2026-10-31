import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
  
public class SwDemo { 
    JLabel label; 
    SwDemo() { 
        JFrame f = new JFrame("An Event Example"); 
        f.setLayout(new FlowLayout()); 
        f.setSize(260, 120); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        JButton alpha = new JButton("Alpha"); 
        JButton beta = new JButton("Beta"); 
        label = new JLabel("Press a button."); 
  
        alpha.addActionListener(e -> label.setText("Alpha was pressed.")); 
        beta.addActionListener(e -> label.setText("Beta was pressed.")); 
  
        f.add(alpha); 
        f.add(beta); 
        f.add(label); 
        f.setVisible(true); 
    } 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(SwDemo::new); 
    } 
} 