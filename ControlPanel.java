import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;

public class ControlPanel extends JPanel {
	public JButton button;

	public ControlPanel(Coord location, Dimension size, Color background) {
		this.button = new JButton("Echo");

		this.add(this.button);
		
		this.setBackground(background);
		this.setSize((int)size.getWidth(), (int)size.getHeight());
		this.setLocation(location.x, location.y);
	}
}
