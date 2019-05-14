import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(MainPanel mainPanel, ControlPanel controlPanel, InformationPanel informationPanel) {
		this.setSize(1000, 1000);
		this.setLocation(0, 25);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Bonus");
		this.setLayout(null);

		mainPanel.setOpaque(true);
		controlPanel.setOpaque(true);
		informationPanel.setOpaque(true);

		this.add(controlPanel);
		this.add(mainPanel);
		this.add(informationPanel);
	}

	public void run() {
		this.setVisible(true);
	}
}
