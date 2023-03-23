package Quiz_Application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Java_Quiz extends JFrame implements ActionListener {
	
	//create 2d array for question
	String questions[][]=new String[10][5];     //10 is row for 10 question. 5 is for qsns and options
	String answers[][]= new String[10][5];   //10 for 10 answers
	String useranswers[][]=new String[10][1];
	
	
	
	JLabel qno,qsn; //globally declare JLabels
	JRadioButton opt1, opt2, opt3, opt4;   //globally declare JRadioButton
	JButton next,submit;
	ButtonGroup groupoptions;
	
	public static int timer=10;  //timer set
	public static int ans_given=0; //check if the user gives answer or not
	public static int count=0;     //count variable define which initial value is 0
	public static int score=0;     //score variable define which initial value is 0
	
	String name;
	Java_Quiz(){
		this.name=name;
		
		setBounds(80,0,1400,800);
		setLayout(null);
		
		//image add
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/java.png"));
		JLabel image= new JLabel(i1);
		image.setBounds(0,0,1400,392);        //set position of picture
		add(image); 
		
		//question number label
		qno=new JLabel();
		qno.setBounds(100,450,50,30);
		qno.setFont(new Font("Goudy Old Style", Font.PLAIN,25));
		add(qno);
		
		//question label
		qsn=new JLabel();
		qsn.setBounds(150,450,1200,30);
		qsn.setFont(new Font("Goudy Old Style", Font.PLAIN,25));
		add(qsn);
		
		//question and options list
		//1st question
		questions[0][0]= "Who invented Java Programming?" ;
	    questions[0][1]= "Guido van Rossum" ;
	    questions[0][2]= "James Gosling" ;
	    questions[0][3]= "Dennis Ritchie" ;
	    questions[0][4]= "Bjarne Stroustrup" ;
	  //2nd question
	    questions[1][0]= "Which component is used to compile, debug and execute the java programs?" ;
	    questions[1][1]= "JRE" ;
	    questions[1][2]= "JIT" ;
	    questions[1][3]= "JDK" ;
	    questions[1][4]= "JVM"
	    		+ "" ;
	  //3rd question
	  	questions[2][0]= "Which one of the following is not a Java feature?" ;
	    questions[2][1]= "Object-oriented" ;
	  	questions[2][2]= "Use of pointers" ;
	    questions[2][3]= "Portable" ;
	    questions[2][4]= "Dynamic and Extensible" ;
	  //4th question
	  	questions[3][0]= "Which of these cannot be used for a variable name in Java?" ;
	  	questions[3][1]= "identifier & keyword" ;
	  	questions[3][2]= "identifier" ;
	  	questions[3][3]= "keyword" ;
	  	questions[3][4]= "none of the mentioned" ;
	  //5th question
	  	questions[4][0]= "What is the extension of java code files?" ;
	  	questions[4][1]= ".js" ;
	  	questions[4][2]= ".txt" ;
  	    questions[4][3]= ".class" ;
  	    questions[4][4]= ".java" ;
  	//6th question
  		questions[5][0]= "Which environment variable is used to set the java path?" ;
  	    questions[5][1]= "MAVEN_Path" ;
  	    questions[5][2]= "JavaPATH" ;
  	    questions[5][3]= "JAVA" ;
  	    questions[5][4]= "JAVA_HOME" ;
  	//7th question
  		questions[6][0]= "Which of the following is not an OOPS concept in Java?" ;
  	    questions[6][1]= "Polymorphism";
  	    questions[6][2]= "Inheritance" ;
  	    questions[6][3]= "Compilation" ;
  	    questions[6][4]= "Encapsulation" ;
  	//8th question
  		questions[7][0]= "Which of the following is a type of polymorphism in Java Programming?" ;
  	    questions[7][1]= "Multiple polymorphism" ;
  	    questions[7][2]= "Compile time polymorphism" ;
  	    questions[7][3]= "Multilevel polymorphism" ;
  	    questions[7][4]= "Execution time polymorphism" ;
  	//9th question
  		questions[8][0]= "What is the extension of compiled java classes?" ;
  	    questions[8][1]= ".txt" ;
  	    questions[8][2]= ".js" ;
  	    questions[8][3]= ".class" ;
  	    questions[8][4]= ".java" ;
  	//10th question
  		questions[9][0]= "Which exception is thrown when java is out of memory?" ;
  	    questions[9][1]= "MemoryError" ;
  	    questions[9][2]= "OutOfMemoryError" ;
  	    questions[9][3]= "MemoryOutOfBoundsException" ;
  	    questions[9][4]= "MemoryFullException" ;
  	    
  	  //Answers list
  	    answers[0][1]="James Gosling";
  	    answers[1][1]="JDK";
     	answers[2][1]="Use of pointers";
     	answers[3][1]="keyword";
     	answers[4][1]=".java";
     	answers[5][1]="JAVA_HOME";
     	answers[6][1]="Compilation";
     	answers[7][1]="Compile time polymorphism";
     	answers[8][1]=".class";
     	answers[9][1]="OutOfMemoryError";
     	
     	//option 1 button
     	opt1= new JRadioButton();
     	opt1.setBounds(170,520,700,30);
     	opt1.setBackground(Color.WHITE);
     	opt1.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
     	add(opt1);
     	
     	//option 2 button
     	opt2= new JRadioButton();
     	opt2.setBounds(170,560,700,30);
     	opt2.setBackground(Color.WHITE);
     	opt2.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
     	add(opt2);
     	
     	//option 3 button
     	opt3= new JRadioButton();
     	opt3.setBounds(170,600,700,30);
     	opt3.setBackground(Color.WHITE);
     	opt3.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
     	add(opt3);
     	
     	//option 4 button
     	opt4= new JRadioButton();
     	opt4.setBounds(170,640,700,30);
     	opt4.setBackground(Color.WHITE);
     	opt4.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
     	add(opt4);
     	
     	//create button group, when click 1 options other options will be de-select
     	groupoptions= new ButtonGroup();
     	groupoptions.add(opt1);
     	groupoptions.add(opt2);
     	groupoptions.add(opt3);
     	groupoptions.add(opt4);
     	
     	//create next button
        next=new JButton ("Next");
     	next.setBounds(1100,500,200,40);
     	next.setBackground(Color.BLUE);
     	next.setFont(new Font("Goudy Old Style", Font.PLAIN, 30));
     	next.setForeground(Color.WHITE);
     	next.addActionListener(this);
     	add(next);
     	
     	//create submit button
     	submit=new JButton ("Submit");
     	submit.setBounds(1100,600,200,40);
     	submit.setBackground(Color.BLUE);
     	submit.setFont(new Font("Goudy Old Style", Font.PLAIN, 30));
     	submit.setForeground(Color.WHITE);
     	submit.setEnabled(false);  //to disable the button
     	submit.addActionListener(this);
     	add(submit);
     	
     	start(count); 
		
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
	}
	
	
	



	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==next) {
			repaint();
			ans_given=1;
			
			if(groupoptions.getSelection()==null) {
				useranswers[count][0]="";
				
			}else {
				useranswers[count][0]=groupoptions.getSelection().getActionCommand();
			}
			
			if(count==8) {  
				next.setEnabled(false);  //when reach 10th question automatically next button will be disable
				submit.setEnabled(true);  //submit button will be enabled
			}
			
			count++;
			start(count);
			
		}else if(ae.getSource()==submit){
			ans_given=1;
			if(groupoptions.getSelection()==null) {
				useranswers[count][0]="";
				
			}else {
				useranswers[count][0]=groupoptions.getSelection().getActionCommand();
			}
			
			for(int i=0;i<useranswers.length;i++) {
				if(useranswers[i][0].equals(answers[i][1])) {
					score +=10;
				}else {
					score +=0;
				}
			}
			setVisible(false);
			new Score(name,score); //score object
		}
			
		
		
		
	}
	
	
	
	//timer set
	public void paint(Graphics g) {
		super.paint(g);
		String time="Time left = "+ timer +"  seconds"; 
		g.setFont(new Font("Goudy Old Style", Font.BOLD,25));
		g.setColor(Color.RED);
		
		if(timer>0) {
			g.drawString(time, 1100, 500);
		}else {
			g.drawString("Times up!!", 1150, 500); //when times gone 0 then it will show times up
		}
		
		timer--; 
		try {
			Thread.sleep(1000);  //1sec=1000 msec
			repaint();     //repaint method call
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(ans_given==1) {
			ans_given=0;
			timer=10;
		}else
			if (timer<0) {
				timer=10;
				
				
				if(count==8) {
					next.setEnabled(false);
					submit.setEnabled(true);
				}
				if(count==9) {
					if(groupoptions.getSelection()==null) {
						useranswers[count][0]="";
						
					}else {
						useranswers[count][0]=groupoptions.getSelection().getActionCommand();
					}
					
					for(int i=0;i<useranswers.length;i++) {
						if(useranswers[i][0].equals(answers[i][1])) {
							score +=10;
						}else {
							score +=0;
						}
					}
					setVisible(false);
					new Score(name,score);
					
				} //automatically submit
				else {
					
				
				if(groupoptions.getSelection()==null) {
					useranswers[count][0]="";
					
				}else {
					useranswers[count][0]=groupoptions.getSelection().getActionCommand();
				}
				count++; //0 //1 //2
				start(count);   //call start function to display qsn and options
			}
			}
	
	
	}
	
	
	public void start(int count) {
		qno.setText(""+(count+1)+". "); //dynamically set  qno
		qsn.setText(questions[count][0]); //show the array 0 position
		
		opt1.setText(questions[count][1]);  //show the options
		opt1.setActionCommand(questions[count][1]);
		
		opt2.setText(questions[count][2]);
		opt2.setActionCommand(questions[count][2]);
		
		opt3.setText(questions[count][3]);
		opt3.setActionCommand(questions[count][3]);
		
		opt4.setText(questions[count][4]);
		opt4.setActionCommand(questions[count][4]);
		
		groupoptions.clearSelection();
	}
		

	public static void main(String[] args) {

		new Java_Quiz();

	}

}
