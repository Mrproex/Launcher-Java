package proex.launcher.main;

import java.awt.Color;

import javax.swing.UIManager;

public class Program 
{
	public static void main(String[] args) 
	{
	    UIManager.put("newsPrgBar.background", Color.BLACK); //color of the background
	    UIManager.put("newsPrgBar.foreground", Color.RED);  //color of progress bar
	    UIManager.put("newsPrgBar.selectionBackground",Color.YELLOW);  //color of percentage counter on black background
	    UIManager.put("newsPrgBar.selectionForeground",Color.BLUE);  //color of percentage counter on red background
	    
		Components comp = new Components();	
	}
}
