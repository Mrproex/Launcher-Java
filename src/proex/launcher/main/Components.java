package proex.launcher.main;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Event;
import java.awt.Image;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

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
		namePanel.setSize(200, 200);
		namePanel.setOpaque(false);
		
		//News Buttons
		news0Button.setSize(350, 200);
		news0Button.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		news0Button.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) - (news0Button.getHeight() / 2) - 50);
		news0Button.addActionListener(e ->
		{
			try {
				Desktop.getDesktop().browse(new URI("https://google.fr/"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		news1Button.setSize(350, 200);
		news1Button.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		news1Button.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) - (news0Button.getHeight() / 2) - 50);
		news1Button.addActionListener(e ->
		{
			try {
				Desktop.getDesktop().browse(new URI("https://google.fr/"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		news2Button.setSize(350, 200);
		news2Button.setBorder(BorderFactory.createLineBorder(Color.black, 3));
		news2Button.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) - (news0Button.getHeight() / 2) - 50);
		news2Button.addActionListener(e ->
		{
			try {
				Desktop.getDesktop().browse(new URI("https://google.fr/"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		newsPrgBar.setSize(350, 5);
		newsPrgBar.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) + ((news0Button.getHeight() / 2) - 55));
		newsPrgBar.setMaximum(7000);
		newsPrgBar.setValue(0); //TEST
		
		frame.add(newsPrgBar);
		frame.add(news2Button);
		frame.add(news1Button);
		frame.add(news0Button);
		frame.add(namePanel);
		frame.add(bgPanel);
		
		News n = new News();
		new Thread(n).start();
	}
	
	public static JFrame frame = new JFrame();
	public static JPanelWithBackground bgPanel = new JPanelWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus002.jpeg", 800, 450);
	public static JPanelWithBackground namePanel = new JPanelWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus003.png", 200, 200);
	public static JButtonWithBackground news0Button = new JButtonWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus004.jpeg", 350, 200);
	public static JButtonWithBackground news1Button = new JButtonWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus005.jpeg", 350, 200);
	public static JButtonWithBackground news2Button = new JButtonWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus006.jpeg", 350, 200);
	public static JProgressBar newsPrgBar = new JProgressBar();
}
