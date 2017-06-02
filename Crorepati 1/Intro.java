/**
 *ScorePanel.java
 *
 */

import java.awt.*;
import javax.swing.*;

public class Intro {
    int x1,y2=1500,x3=1500,a=0;
    static JFrame jf;
    
    static Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    static int w=(int)dim.getWidth();    static int h=(int)dim.getHeight();
    IntroInner d=new IntroInner();   int c;
    	
    
    public void build() throws Exception{

    	  jf=new JFrame("Kaun Banega Crorepati");
    	  jf.getContentPane().add(d);
    	  jf.setSize(w,h);
    	  jf.setVisible(true);
    	  jf.setAlwaysOnTop(true);
    	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  
    	for (x1= 0; x1<=400;x1++ ){
    		a=1;
    		d.repaint();
    		Thread.sleep(5);
    	}
        
	    for (y2=h; y2>=700; y2--){
	    	a=1;
	    	d.repaint();
	    	Thread.sleep(5);
	    }
	 
	     for (x3=w; x3>=700; x3--){
	    	a=1;
	    	d.repaint();
	    	Thread.sleep(5);
	     }
    }
    public class IntroInner extends JPanel{
    	
        public void paintComponent(Graphics g1){
        	Graphics2D g=(Graphics2D) g1;
        	int xpos=(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()/2-215;
        	
        	setFont(new Font("Calisto MT",Font.ITALIC,70));
        	
    	    g.setColor(Color.black);
    	    g.fillRect(0,0,this.getWidth(),this.getHeight());
    	     
       	    //g.rotate(a);
    	    Image im=new ImageIcon("Images/KBC.jpg").getImage();
    	    g.drawImage(im,xpos-100,20,this);
    	    
    	    g.setColor(Color.white);
	   
	   g.drawString("Thanks For Playing",x1,600);
    	
    	   g.drawString("Kaun",x1-35,700);

    	   g.drawString("Banega",525,y2);
    	
    	   g.drawString("Crorepati",x3+28,700);
        }
    }
    public static void main(String[] args) throws Exception{
    	 new Intro().build();
    	 
    }
}
