import javax.swing.*;
import java.awt.*;

public class JavaGuiTest {
	
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JButton b2;
	private JLabel lab;
	
	public JavaGuiTest() {
		gui();
	}
	
	public void gui() {
		f = new JFrame("Creativity tuts");
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel(new GridBagLayout());
		p.setBackground(Color.YELLOW);
		
		b1 = new JButton("Test");
		b2 = new JButton("Test2");
		lab = new JLabel("This is test label");
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.insets = new Insets(10, 10, 10, 10);
		c.gridx = 0;
		c.gridy = 1;
		p.add(b1, c);
		
		c.gridx = 0;
		c.gridy = 2;
		p.add(b2, c);
		
		p.add(lab);
		
		f.add(p);
	}
	
	public static void main(String[] args) {
		new JavaGuiTest();
	}
}
