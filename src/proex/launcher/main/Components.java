package proex.launcher.main;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

import proex.launcher.main.Extensions.JPanelWithBackground;

public class Components 
{
	public Components() {
		//frame
		frame.setResizable(false);
		frame.setSize(800, 450);
		frame.setVisible(true);
	
		//Background panel
		bgPanel.setSize(850, 450);
		bgPanel.setVisible(true);	
	}
	
	public JFrame frame = new JFrame();
	public JPanelWithBackground bgPanel = new JPanelWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus259.jpeg");
}
