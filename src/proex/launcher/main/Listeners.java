package proex.launcher.main;

import java.awt.Desktop;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;

public class Listeners {
	static MouseInputAdapter mia = new MouseInputAdapter()
	{
	    Point location;
	    Point pressed;

	    public void mousePressed(MouseEvent me)
	    {
	        pressed = me.getLocationOnScreen();
	        Window window = SwingUtilities.windowForComponent(me.getComponent());
	        location = window.getLocation();
	    }

	    public void mouseDragged(MouseEvent me)
	    {
	        Point dragged = me.getLocationOnScreen();
	        int x = (int)(location.x + dragged.getX() - pressed.getX());
	        int y = (int)(location.y + dragged.getY() - pressed.getY());
	        Window window = SwingUtilities.windowForComponent(me.getComponent());
	        window.setLocation(x, y);
	     }
	};
	
	static void reachLink(String link) {
		try {
			Desktop.getDesktop().browse(new URI(link));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
