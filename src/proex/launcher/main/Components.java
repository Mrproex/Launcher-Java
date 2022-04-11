package proex.launcher.main;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.text.StyledEditorKit.FontFamilyAction;

import proex.launcher.main.Extensions.JButtonWithBackground;
import proex.launcher.main.Extensions.JPanelWithBackground;

public class Components 
{
	public static String news = null;
	public static String links = null;
	
	public Components() {
		try {
			Utilities.HttpDownloadUtility.downloadFile("http://127.0.0.1/Dofus/Launcher/news.txt", "./");
			Utilities.HttpDownloadUtility.downloadFile("http://127.0.0.1/Dofus/Launcher/links.txt", "./");			
			news = Files.readString(Paths.get("./news.txt"));
			links = Files.readString(Paths.get("./links.txt"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setResizable(false);
		frame.setSize(800, 450);
	    frame.setUndecorated(true);
		frame.setVisible(true);
	
		//Background panel
		bgPanel.setSize(frame.getWidth(), frame.getHeight());
		bgPanel.addMouseListener(Listeners.mia);
		bgPanel.addMouseMotionListener(Listeners.mia);
		
		//Name panel
		namePanel.setLocation(0, 0);
		namePanel.setSize(200, 100);
		namePanel.setOpaque(false);
		
		//News Buttons
		String n0l = news.split("\n")[0].split("§")[1];
		news0Button.setSize(350, 200);
		news0Button.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		news0Button.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) - (news0Button.getHeight() / 2) - 10);
		news0Button.addActionListener(e -> Listeners.reachLink(n0l));

		String n1l = news.split("\n")[1].split("§")[1];
		news1Button.setSize(350, 200);
		news1Button.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		news1Button.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) - (news0Button.getHeight() / 2) - 10);
		news1Button.addActionListener(e -> Listeners.reachLink(n1l));

		String n2l = news.split("\n")[2].split("§")[1];
		news2Button.setSize(350, 200);
		news2Button.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		news2Button.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) - (news0Button.getHeight() / 2) - 10);
		news2Button.addActionListener(e -> Listeners.reachLink(n2l));
		
		newsPrgBar.setSize(350, 8);
		newsPrgBar.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) + ((news0Button.getHeight() / 2) - 13));
		newsPrgBar.setMaximum(7000);
		newsPrgBar.setValue(0);
		
		newsLabel.setSize(350, 15);
		newsLabel.setLocation((frame.getWidth() / 2) - news0Button.getWidth() / 2, (frame.getHeight() / 2) + ((news0Button.getHeight() / 2) - 5));
		newsLabel.setForeground(Color.white);
		newsLabel.setFont(new Font("Arial", Font.BOLD, 12));
		
		websiteButton.setSize(75, 30);
		websiteButton.setLocation((frame.getWidth() / 2) - (news0Button.getWidth() / 2) - websiteButton.getWidth() - 5, (frame.getHeight() / 2) - (news0Button.getHeight() / 2) - 10);
		websiteButton.setForeground(Color.white);
		websiteButton.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		websiteButton.setText("WEBSITE");
		websiteButton.setFont(new Font("Arial", Font.BOLD, 12));
		websiteButton.addActionListener(e -> Listeners.reachLink("https://google.fr/"));
		
		discordButton.setSize(75, 30);
		discordButton.setLocation((frame.getWidth() / 2) - (news0Button.getWidth() / 2) - websiteButton.getWidth() - 5, (((frame.getHeight() / 2) - (news0Button.getHeight() / 2)) - 10) + websiteButton.getHeight() + 5);
		discordButton.setForeground(Color.white);
		discordButton.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		discordButton.setText("DISCORD");
		discordButton.setFont(new Font("Arial", Font.BOLD, 12));
		discordButton.addActionListener(e -> Listeners.reachLink("https://discord.gg/"));
		
		mainPrgBar.setSize(frame.getWidth(), 25);
		mainPrgBar.setLocation(0, frame.getHeight() - 25);
		mainPrgBar.setMaximum(1000);
		mainPrgBar.setValue(350);
		
		frame.add(mainPrgBar);
		frame.add(discordButton);
		frame.add(websiteButton);
		frame.add(newsLabel);
		frame.add(newsPrgBar);
		frame.add(news2Button);
		frame.add(news1Button);
		frame.add(news0Button);
		frame.add(namePanel);
		frame.add(bgPanel);
		
		SwingUtilities.updateComponentTreeUI(frame);
		
		News n = new News();
		new Thread(n).start();
	}
	
	public static JFrame frame = new JFrame();
	public static JPanelWithBackground bgPanel = new JPanelWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus002.jpeg", 800, 450);
	public static JPanelWithBackground namePanel = new JPanelWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus003.png", 200, 100);
	public static JButtonWithBackground news0Button = new JButtonWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus004.jpeg", 350, 200);
	public static JButtonWithBackground news1Button = new JButtonWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus005.jpeg", 350, 200);
	public static JButtonWithBackground news2Button = new JButtonWithBackground("http://127.0.0.1/Dofus/Launcher/Ressources/dofus006.jpeg", 350, 200);
	public static JProgressBar newsPrgBar = new JProgressBar();
	public static JLabel newsLabel = new JLabel();
	public static JButton websiteButton = new JButton();
	public static JButton discordButton = new JButton();
	public static JProgressBar mainPrgBar = new JProgressBar();
}
