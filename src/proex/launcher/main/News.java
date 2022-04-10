package proex.launcher.main;

public class News implements Runnable 
{
	int i = 0;
    public void run() 
    {
    	while (true) {
        	for (int i = 0; i != 3; i++) 
        	{
            	switch (i) 
            	{
    	    	case 0:
    	    		Components.news0Button.setVisible(true);
    	    		Components.news1Button.setVisible(false);
    	    		Components.news2Button.setVisible(false);
    	    		break;
    	    	case 1:
    	    		Components.news0Button.setVisible(false);
    	    		Components.news1Button.setVisible(true);
    	    		Components.news2Button.setVisible(false);
    	    		break;
    	    	case 2:
    	    		Components.news0Button.setVisible(false);
    	    		Components.news1Button.setVisible(false);
    	    		Components.news2Button.setVisible(true);
    	    		break;
            	}
        		for (int j = 0; j != 7; j++) {
            		for (int k = 0; k != 1000; k++) {
            			Components.newsPrgBar.setValue(Components.newsPrgBar.getValue() + 1);
            			try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
            		}
        		}
        		Components.newsPrgBar.setValue(0);
        	}
    	}
    }
}