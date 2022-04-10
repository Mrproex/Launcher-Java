package proex.launcher.main;

import java.awt.Color;
import java.awt.Event;
import java.awt.Image;
import javax.swing.*;

import proex.launcher.main.Extensions.JButtonWithBackground;
import proex.launcher.main.Extensions.JPanelWithBackground;

public class Components 
{
	public Components() {
		//frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setResizable(false);
		frame.setSize(800, 450);
		frame.setVisible(true);
	
		//Background panel
		bgPanel.setSize(frame.getWidth(), frame.getHeight());
		
		//Name panel
		namePanel.setLocation(10, 10);
		namePanel.setSize(100, 100);
		namePanel.setOpaque(false);
		
		//News Buttons
		news0Button.setSize(200, 200);
		news0Button.setLocation((frame.getWidth() / 2) - news0Button.getWidth(), (frame.getHeight() / 2) - news0Button.getHeight());
		//news0Button.setLocation(100, 100);
	
		frame.add(namePanel);
		frame.add(bgPanel);
		frame.add(news0Button);
	}
	
	public JFrame frame = new JFrame();
	public JPanelWithBackground bgPanel = new JPanelWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus002.jpeg");
	public JPanelWithBackground namePanel = new JPanelWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus003.png");
	public JButtonWithBackground news0Button = new JButtonWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus004.jpeg");
	
	public void Test() {
		
	}
}
