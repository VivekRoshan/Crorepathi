/**
 *OptionA.java
 *
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OptionB extends JPanel{
	
    String optionb="";
    
    Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	int w=(int)d.getWidth(),  h=(int)d.getHeight(),  wrong;
		
    boolean clicked=false,entered=false;
    
    public OptionB() {
    	
    	setFont(new Font("Calisto MT",Font.ITALIC,30));
    	addMouseListener(optionblistener);
    	
    }
    
    MouseListener optionblistener=new MouseListener(){
    	public void mouseClicked(MouseEvent me){
    		clicked=true;
    	}
    	
    	public void mousePressed(MouseEvent me){
    	}
    	
    	public void mouseExited(MouseEvent me){
    		entered=false;
    		repaint();
    	}
    	
    	public void mouseReleased(MouseEvent me){
    	}
    	
    	public void mouseEntered(MouseEvent me){
    		entered=true;
    		repaint();
    	}
    };
    
    public void paintComponent(Graphics g){
    	int xpos=w/2-40;
    	
    	g.setColor(Color.black);
    	g.fillRect(0,0,this.getWidth(),this.getHeight());
    	
    	g.setColor(Color.white);
    	g.drawPolygon(new int[]{50,xpos,xpos+30,xpos,50,20},new int[]{20,20,50,80,80,50},6);
    	
    	g.setColor(new Color(227, 221, 48));
        if(entered==true){
    		g.fillPolygon(new int[]{52,xpos-2,xpos+28,xpos-2,52,22},new int[]{22,22,50,78,78,50},6);
           	g.setColor(Color.black);
    	    g.drawString(optionb,60,60);
    	}
    	else{
    	     g.setColor(Color.WHITE);
    	     g.drawString(optionb,60,60);
    	}
         if(wrong==2){
    		g.setColor(Color.red);
    		g.fillPolygon(new int[]{52,xpos-2,xpos+28,xpos-2,52,22},new int[]{22,22,50,78,78,50},6);
           	g.setColor(Color.white);
    	    g.drawString(optionb,60,60);
    	}
    	else if(wrong==1){
    		g.setColor(Color.green);
    		g.fillPolygon(new int[]{52,xpos-2,xpos+28,xpos-2,52,22},new int[]{22,22,50,78,78,50},6);
           	g.setColor(Color.black);
    	    g.drawString(optionb,60,60);
    	}
    	
    }
    public static void main(String[] args) {
    	 Dimension di=Toolkit.getDefaultToolkit().getScreenSize();
    	  double widrh=di.getWidth();
    	  double height=di.getHeight();
    	  JFrame jf=new JFrame("Dancing Ball");
    	  OptionB d=new OptionB();
    	  jf.getContentPane().add(d);
    	  
    	  jf.setSize(1300,450);
    	  jf.setVisible(true);
    	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
