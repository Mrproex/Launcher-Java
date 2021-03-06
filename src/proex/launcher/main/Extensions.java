package proex.launcher.main;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Extensions {
	public static class JPanelWithBackground extends JPanel {

		  private static final long serialVersionUID = 1L;
		private Image backgroundImage;

		  public JPanelWithBackground(String url, int width, int height) {
		    try {		    	
				backgroundImage = ImageIO.read(new URL(url)).getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }

		  public void paintComponent(Graphics g) {
		    super.paintComponent(g);

		    // Draw the background image.
		    g.drawImage(backgroundImage, 0, 0, this);
		  }
		}
	
	public static class JButtonWithBackground extends JButton {

		  private static final long serialVersionUID = 1L;
		private Image backgroundImage;

		  public JButtonWithBackground(String url, int width, int height) {
		    try {
				backgroundImage = ImageIO.read(new URL(url)).getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }

		  public void paintComponent(Graphics g) {
		    super.paintComponent(g);

		    // Draw the background image.
		    g.drawImage(backgroundImage, 0, 0, this);
		  }
		}
}
