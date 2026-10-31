import java.awt.*; 
import javax.swing.*; 
public class ButtonDemo { 
    ButtonDemo() { 
        JFrame f=new JFrame("Event Example"); 
        f.setLayout(new FlowLayout()); f.setSize(330,140); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        JLabel label=new JLabel("Press a button."); 
        JButton a=new JButton("Alpha"), b=new JButton("Beta"), g=new JButton("Gamma"); 
        a.addActionListener(e->label.setText("Alpha pressed")); 
        b.addActionListener(e->label.setText("Beta pressed")); 
        g.addActionListener(e->label.setText("Gamma pressed")); 
        f.add(a); f.add(b); f.add(g); f.add(label); 
        f.setLocationRelativeTo(null); f.setVisible(true); 
    } 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(ButtonDemo::new); 
    } 
} 