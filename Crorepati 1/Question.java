/**
 * Quiz.java
 */

import java.awt.*;
import javax.swing.*;

public class Question extends JPanel{
	
	    public String question="Wjkkfsknfe3rihe";
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		int w=(int)d.getWidth();  int h=(int)d.getHeight();
		
    public Question() {
    	
     	setFont(new Font("Calisto MT",Font.BOLD,30));
     	setPreferredSize(new Dimension(w,80));
     	
    }
    
    public void paintComponent(Graphics g){
    	int xpos=w-50;
    	
    	g.setColor(Color.black);
    	g.fillRect(0,0,this.getWidth(),this.getHeight());
    	
    	g.setColor(Color.white);
    	g.drawPolygon(new int[]{50,xpos,xpos+30,xpos,50,20},new int[]{20,20,50,80,80,50},6);
    		
    	g.setColor(Color.WHITE);
    	g.drawString(question,60,60);
    
    }
    public static void main(String[] args) {
    	 Dimension di=Toolkit.getDefaultToolkit().getScreenSize();
    	  double widrh=di.getWidth();
    	  double height=di.getHeight();
    	  JFrame jf=new JFrame("Dancing Ball");
    	  Question d=new Question();
    	  jf.getContentPane().add(d);
    	  d.setFont(new Font("Calisto MT",Font.BOLD,30));
    	  jf.setSize(1300,450);
    	  jf.setVisible(true);
    	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
