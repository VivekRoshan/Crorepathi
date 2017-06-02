/**
 * LogoPanel.java
 */

import java.awt.*;
import javax.swing.*;

public class LogoPanel extends JPanel{
	
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		int w=(int)d.getWidth(),   h=(int)d.getHeight()  ,i,j,k;
		
	public LogoPanel(){
	
        setFont(new Font("serif",Font.ITALIC,50));
		setPreferredSize(new Dimension(w-400,450));
	}
	
       public void paintComponent(Graphics g){
       	    int xpos=(w-1250)/2-215;
       	    
       	    g.setColor(Color.black);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
       	     
       	    Image im=new ImageIcon("Images/Logo.png").getImage();
    	    g.drawImage(im,xpos-50,-100,this);
    	   
    	 }
    }
