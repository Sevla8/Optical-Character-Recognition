import javax.swing.JPanel;
import java.lang.Math;
import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;

public class MainPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
	public ControlPanel controlPanel;
	public InformationPanel informationPanel;
	public int[][] grid;
	public int large = 5;
	public int click;

	public MainPanel(Point location, Dimension size, Color background, ControlPanel controlPanel, InformationPanel informationPanel) {
		this.controlPanel = controlPanel;
		this.informationPanel = informationPanel;

		int n = (int)size.getWidth()/this.large;
		int m = (int)size.getHeight()/this.large;
		this.grid = new int[n][m];
		for (int i = 0; i < n; i += 1) {
			for (int j = 0; j < m; j += 1)
				this.grid[i][j] = 0;
		}

		this.setBackground(background);
		this.setSize((int)size.getWidth(), (int)size.getHeight());
		this.setLocation((int)location.getX(), (int)location.getY());

		this.controlPanel.button1.addActionListener(this);
		this.controlPanel.button2.addActionListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public String find() {
		return "test";
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int n = this.getWidth()/this.large;
		int m = this.getHeight()/this.large;

		if (this.grid != null) {
			g.setColor(Color.BLACK);
			for (int i = 0; i < n; i += 1) {
				for (int j = 0; j < m; j += 1) {
					if (this.grid[i][j] == 1)
						g.fillRect(i*this.large, j*this.large, this.large, this.large);
				}
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.controlPanel.button1)
			this.informationPanel.jLabel.setText(this.find());
		else if (e.getSource() == this.controlPanel.button2) {
			int n = this.getWidth()/this.large;
			int m = this.getHeight()/this.large;
			for (int i = 0; i < n; i += 1) {
				for (int j = 0; j < m; j += 1)
					this.grid[i][j] = 0;
			}
			this.informationPanel.jLabel.setText("");
		}
		this.repaint();
	}

	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1)
			this.click = 1;
		else if (e.getButton() == MouseEvent.BUTTON3)
			this.click = 3;
	}

	public void mouseDragged(MouseEvent e) {
		int n = this.getWidth()/this.large;
		int m = this.getHeight()/this.large;

		int x = e.getX()/this.large;
		int y = e.getY()/this.large;

		if (x < n && y < m && x >= 0 && y >= 0) {
			if (this.click == 1) {
				this.grid[x][y] = 1;
			}
			else if (this.click == 3) {
				this.grid[x][y] = 0;
			}
		}

		this.repaint();
	}

	public void mouseMoved(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}

