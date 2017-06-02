/**
 *Run_Project.java
 *
 */

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;



public class Run_Project {
        int casharray[]={10000,20000,40000,80000,160000,320000,640000,1250000,2500000,
		                        5000000,10000000},
		             questionno[]=new int[11],score,pos;
		   
	    String answer,useranswer="  ";
	 
	      Cash d=new Cash();
    	  Question q=new Question();
    	  OptionA opa=new OptionA();
    	  OptionB opb=new OptionB();
    	  OptionC opc=new OptionC();
    	  OptionD opd=new OptionD();
    	                       
    	  JFrame jf;
    	  String stt=" ";
    public Run_Project(String stt) {
    	try{
    	    buildGUI();
        	buildarray();
    	    perform();
    	}catch(Exception e){}
    }
    
    public  boolean questioncheck(int num){
    	for (int i = 0; i<questionno.length; i++) {
    		if(num==questionno[i])
    			return true;
    	    }
    			return false;
    }
    
    public void buildGUI() throws Exception{
 
    	  jf=new JFrame("Kaun Banega Crorepati");
    	  
    	  Toolkit t=Toolkit.getDefaultToolkit();
    	  Dimension dim=t.getScreenSize();
    	  int width=(int)dim.getWidth();  int height=(int)dim.getHeight();
    	  
    	  
    	  JLayeredPane jlp1=new JLayeredPane(),
    	  	                      jlp2=new JLayeredPane(),
    	  	                      jlp3=new JLayeredPane();
    	  	                      
       	  Box panelbox=new Box(BoxLayout.Y_AXIS);
       	  
       	  jlp1.setLayout(new BoxLayout(jlp1,BoxLayout.X_AXIS));
       	  jlp2.setLayout(new BorderLayout());
       	  jlp3.setLayout(new GridLayout(2,2));
       	  
    	  jlp1.add(BorderLayout.EAST,new LogoPanel());
    	  jlp1.add(BorderLayout.WEST,d);
    	  
    	  jlp3.add(opa);jlp3.add(opb);
    	  jlp3.add(opc);jlp3.add(opd);
    	  jlp3.setPreferredSize(new Dimension(1250,160));
    	  
    	  panelbox.add(jlp1);panelbox.createVerticalStrut(200);
    	  panelbox.add(q);
    	  panelbox.add(jlp3);
    	  
    	  jf.getContentPane().add(panelbox);
    	     	  
    	  jf.setSize(width,height);
    	  jf.setVisible(true);
    	  jf.setAlwaysOnTop(true);
    	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  
    }
    
    public void buildarray(){
    	 int count=-1;
		 
		 	while (count!=(questionno.length-1)){
		 		 int qno=(int)((Math.random()*16)+1);
		 		 if(questioncheck(qno)==false){
		 		 	  count+=1;
     		 	      questionno[count]=qno;
		 		 }
		 	}
    }
    
    public void correct_answer(){
    	if(opa.optiona.equals(answer)){
    		opa.wrong=1;
    		opa.repaint();
    	}
    	else if(opb.optionb.equals(answer)){
    		opb.wrong=1;
    		opb.repaint();
    	}
    	else if(opc.optionc.equals(answer)){
    		opc.wrong=1;
    		opc.repaint();
    	}
    	else if(opd.optiond.equals(answer)){
    		opd.wrong=1;
    		opd.repaint();
    	}
    }
    
    public void perform()throws Exception{
    	
		 for (int i = 0; i<questionno.length; i++){
		 	
		 	int lineno=0;
		 	String fname="Questions/Question"+questionno[i]+".txt",str;
		 	
		 	FileReader fr=new FileReader(fname);
		 	BufferedReader br=new BufferedReader(fr);
		 	
		 	   while ((str=br.readLine())!=null) {
		 	   	     lineno++;
		 	   	     switch (lineno) {
	                                    case 1: q.question=str;
	                                                 q.repaint();
	                                    	          break;
	                                    case 2: opa.optiona=str;
	                                                 opa.repaint();
	                                    	          break;
                                        case 3: opb.optionb=str;
	                                                 opb.repaint();
	                                    	          break;
                                        case 4: opc.optionc=str;
	                                                 opc.repaint();
	                                    	          break;
                                        case 5: opd.optiond=str;
	                                                 opd.repaint();
	                                    	          break;	
                                        case 6: answer=str;
	                                                 break;	                                    	          	                                    	          	                                    	          	                                    	          
	                                   default :
                          }
			    }
			    
			         while ((opa.clicked==false)
			         	  &&(opb.clicked==false) && (opc.clicked==false ) && (opd.clicked==false)) {
					 }
					 
					 if(opa.clicked==true)
					 	if(opa.optiona.equals(answer)) {
					 		opa.wrong=1;
					 		opa.repaint(); 
					 	}
					 	else {
					 		 opa.wrong=2;
					 		 opa.repaint();
					 		 correct_answer();
					 		 break; 
					 	}
					 else if(opb.clicked==true)
					 	if(opb.optionb.equals(answer)) {
					 		opb.wrong=1;
					 		opb.repaint(); 
					 	}
					 	else {
					 		opb.wrong=2;
					 		opb.repaint();   
					 		correct_answer();
					 		break;
					 	}
		 			else if(opc.clicked==true)
					 	if(opc.optionc.equals(answer)) {
					 		opc.wrong=1;
					 		opc.repaint(); 
					 	}
					 	else {
					 		opc.wrong=2;
					 		opc.repaint();   
					 		correct_answer();
					 		break;
					 	}
					 else if(opd.clicked==true)
					 	if(opd.optiond.equals(answer)) {
					 		opd.wrong=1;
					 		opd.repaint(); 
					 	}
					 	else {
					 		opd.wrong=2;	
					 	    opd.repaint();   
					 	    correct_answer();
					 		break;
					 	}


					 	score=casharray[pos++];
					 	d.current=score;
					 	d.yc=390;
					 	d.repaint();
					 	
					 Thread.sleep(1000);
					 						 		
					 opa.clicked=false;opc.clicked=false;
					 opb.clicked=false;opd.clicked=false;
					 
					 opa.wrong=0;opb.wrong=0;
					 opc.wrong=0;opd.wrong=0;
	    	 }
	    	 
	    	 if(score!=10000000 && score>80000){
	    	        	score=casharray[pos-2];
					 	d.current=score;
					 	d.yc=390;d.yc2+=60;
					 	d.repaint();
	    	 }
	    	 Thread.sleep(2000);
	    	 jf.setContentPane(new FinalScore(score));
	    	 SwingUtilities.updateComponentTreeUI(jf);
	    	 Thread.sleep(5000);
	    	 jf.hide();
	    	 new Intro().main(new String[]{"jhshsh"});
        }
        
        public static void main (String[] args) throws Exception{
		Scanner input=new Scanner(System.in);
		//String st;
		System.out.println("Welcome to the Crorepathi ..... ");
		System.out.println("Enter Your Name ");
		//System.out.println("Enter a String");
		//Scanner input = new Scanner(System.in);
		String stt = input.next();
		//System.out.println(stt);
        	new Run_Project(stt);
	    }
}