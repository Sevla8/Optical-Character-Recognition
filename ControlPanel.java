import java.awt.Point;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JButton;

public class ControlPanel extends JPanel {
	public JButton button1;
	public JButton button2;

	public ControlPanel(Point location, Dimension size, Color background) {
		this.button1 = new JButton("Echo");
		this.button2 = new JButton("Clear");

		this.add(this.button1);
		this.add(this.button2);
		
		this.setBackground(background);
		this.setSize((int)size.getWidth(), (int)size.getHeight());
		this.setLocation((int)location.getX(), (int)location.getY());
	}
}
