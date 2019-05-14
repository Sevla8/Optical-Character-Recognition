import java.awt.Point;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Dimension;

public class InformationPanel extends JPanel {
	public JLabel jLabel;

	public InformationPanel(Point location, Dimension size, Color background) {
		this.jLabel = new JLabel();

		this.add(this.jLabel);

		this.setBackground(background);
		this.setSize((int)size.getWidth(), (int)size.getHeight());
		this.setLocation((int)location.getX(), (int)location.getY());
	}
}
