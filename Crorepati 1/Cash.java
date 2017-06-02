/**
 * Cash.java
 */
 
import java.awt.*;
import javax.swing.*;

public class Cash extends JPanel{
	int current,yc=390,yc2=400;
	int casharray[]={0,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,
		                        5000000,10000000};
    public Cash() {
    	 setFont(new Font("Calisto MT",Font.ITALIC,30));
    	setPreferredSize(new Dimension(400,450));
    }
    
    public void paintComponent(Graphics g){
    	g.setColor(Color.black);
    	g.fillRect(000,0,this.getWidth(),this.getHeight());
    	
    	g.setColor(Color.WHITE);
    	g.fillRect(0,0,10,390);
    	
    		for (int i = 0; i<casharray.length; i++) {
    	     	if(current==casharray[i]){
    		    	g.setColor(Color.white);
    			    g.fillRect(000,yc2-=30,400,20);    		
    		}
    		}
    	for (int i = 1; i<casharray.length; i++) {
    			g.setColor(Color.blue);
    			g.drawString(Integer.toString(casharray[i]),150,yc-=30);	
	    	}
	    		g.drawString("0",150,390);
    }
    public static void main(String[] args) {
    	  Dimension di=Toolkit.getDefaultToolkit().getScreenSize();
    	  double widrh=di.getWidth();
    	  double height=di.getHeight();
    	  JFrame jf=new JFrame("k.b.c");
    	  Cash d=new Cash();
    	  jf.getContentPane().add(d);
    	  jf.setSize(300,450);
    	  jf.setLocation((int)widrh/2-200,(int)height/2-200);
    	  jf.setVisible(true);
    	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
