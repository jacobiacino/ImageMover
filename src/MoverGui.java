import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MoverGui {
	
	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	
	public MoverGui() {
		gui();
	}
	
	public void gui() {
		f = new JFrame("Image Mover");
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel(new BorderLayout());
		p.setBackground(Color.LIGHT_GRAY);
		
		b1 = new JButton("YES");
		
		b2 = new JButton("NO");
		
		b3 = new JButton("MAYBE");
		
		ImageIcon image = new ImageIcon("test.JPG");
		JLabel myPic = new JLabel("", image, JLabel.CENTER);
		
		GridBagConstraints c = new GridBagConstraints();
		
		c.insets = new Insets(10, 10, 10, 10);
		c.gridx = 1;
		c.gridy = 0;
		p.add(b1, c);
		
		c.gridx = 2;
		p.add(b2, c);
		
		c.gridx = 3;
		p.add(b3, c);
		
		p.add(myPic, BorderLayout.CENTER);
		
		f.add(p);
	}

	public static void main(String[] args) {
		new MoverGui();

	}

}
