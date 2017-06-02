/**
 *FinalScore.java
 */

import java.awt.*;
import javax.swing.*;
//String Sa=stt;
public class FinalScore extends JPanel{
   
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    int fscore, w=(int)d.getWidth(), h=(int)d.getHeight();
    public FinalScore(int fs) {
    	fscore=fs;
    }
    
    public void paintComponent(Graphics g){
    	
    	Graphics2D g2d=(Graphics2D)g;
    	int xpos=w/2-400,ypos=h/2-208;
    	g2d.setFont(new Font("Calisto MT",Font.ITALIC,30));
 

    	g2d.setColor(Color.black);
    	g2d.fillRect(0,0,this.getWidth(),this.getHeight());
    	
	//g3d.setColor(Color.black);
    	//g3d.fillRect(0,0,this.getWidth(),this.getHeight());

    	Image im=new ImageIcon("Images/score.jpg").getImage();
    	g2d.drawImage(im,xpos,ypos,this);
    	    
    	g2d.setColor(Color.black);
	
    	//g3d.setColor(Color.white);

    	g2d.drawString(" vivek roshan ",xpos+70,ypos+62);
    	g2d.drawString("   "+Integer.toString(fscore),xpos+507,ypos+132);

    }
    }
