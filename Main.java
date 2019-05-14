import java.awt.Color;
import java.awt.Point;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {

		ControlPanel controlPanel = new ControlPanel(new Point(0, 0), new Dimension(200, 50), Color.BLUE);
		InformationPanel informationPanel = new InformationPanel(new Point(0, 250), new Dimension(200, 50), Color.RED);
		MainPanel mainPanel = new MainPanel(new Point(0, 50), new Dimension(200, 200), Color.GREEN, controlPanel, informationPanel);

		MyFrame frame = new MyFrame(mainPanel, controlPanel, informationPanel);
		frame.run();
	}
}
