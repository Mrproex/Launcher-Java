package proex.launcher.main;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.UIManager;

public class Program 
{
	public static void main(String[] args) 
	{	    
		String os = System.getProperty("os.name");
		
		if (os.contains("Mac")) {
	        UIManager.put("ProgressBar.repaintInterval", 100);
	        UIManager.put("ProgressBar.border", BorderFactory.createLineBorder(Color.white, 1));
	        
	        UIManager.put("ProgressBar.selectionBackground", Color.red);
			UIManager.put("ProgressBar.selectionForeground", Color.red);
			UIManager.put("ProgressBar.foreground", Color.red);
			UIManager.put("ProgressBar.background", Color.red);
		}
		
		var cp = new Components();	
		
		System.out.println(cp.mainPrgBar.getForeground());
	}
}
