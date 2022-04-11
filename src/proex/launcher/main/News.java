package proex.launcher.main;

public class News implements Runnable 
{
    public void run() 
    {
    	while (true) {
        	for (int i = 0; i != 3; i++) 
        	{
            	switch (i) 
            	{
    	    	case 0:
    	    		String n0t = Components.news.split("\n")[0].split("§")[0];
    	    		
    	    		Components.news0Button.setVisible(true);
    	    		Components.news1Button.setVisible(false);
    	    		Components.news2Button.setVisible(false);
    	    		Components.newsLabel.setText(n0t);
    	    		break;
    	    	case 1:
    	    		String n1t = Components.news.split("\n")[1].split("§")[0];
    	    		
    	    		Components.news0Button.setVisible(false);
    	    		Components.news1Button.setVisible(true);
    	    		Components.news2Button.setVisible(false);
    	    		Components.newsLabel.setText(n1t);
    	    		break;
    	    	case 2:
    	    		String n2t = Components.news.split("\n")[2].split("§")[0];
    	    		
    	    		Components.news0Button.setVisible(false);
    	    		Components.news1Button.setVisible(false);
    	    		Components.news2Button.setVisible(true);
    	    		Components.newsLabel.setText(n2t);
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