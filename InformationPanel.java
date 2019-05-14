import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

public class InformationPanel extends JPanel {
	public JLabel jLabel;

	public InformationPanel(Coord location, Dimension size, Color background) {
		this.jLabel = new JLabel();

		this.add(this.jLabel);

		this.setBackground(background);
		this.setSize((int)size.getWidth(), (int)size.getHeight());
		this.setLocation(location.x, location.y);
	}
}
