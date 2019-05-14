import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

public class Main {
	public static void main(String[] args) {

		ControlPanel controlPanel = new ControlPanel(new Coord(0, 0), new Dimension(200, 50), Color.BLUE);
		InformationPanel informationPanel = new InformationPanel(new Coord(0, 250), new Dimension(200, 50), Color.RED);
		MainPanel mainPanel = new MainPanel(new Coord(0, 50), new Dimension(200, 200), Color.GREEN, controlPanel, informationPanel);

		MyFrame frame = new MyFrame(mainPanel, controlPanel, informationPanel);
		frame.run();
	}
}
