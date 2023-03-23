package Quiz_Application;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Sql_Quiz extends JFrame implements ActionListener{
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
		public static int count=0;      //count variable define which initial value is 0
		public static int score=0;     //score variable define which initial value is 0
		
		
		String name;
	    Sql_Quiz(){
	    this.name=name;
	    	
		setBounds(80,0,1400,800);
		setLayout(null);
		
		
		//image add
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/sql.jpeg"));
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
		questions[0][0]= "The ______ clause allows us to select only those rows in the result relation of the ____ clause that satisfy a specified predicate." ;
	    questions[0][1]= "Where, from" ;
	    questions[0][2]= "From, select" ;
	    questions[0][3]= "Select, from" ;
	    questions[0][4]= "From, where" ;
	  //2nd question
	    questions[1][0]= "The ________ clause is used to list the attributes desired in the result of a query." ;
	    questions[1][1]= "Where" ;
	    questions[1][2]= "Select" ;
	    questions[1][3]= "From" ;
	    questions[1][4]= "Distinct" ;
	  //3rd question
	  	questions[2][0]= "When was the first version of Microsoft SQL Server released?" ;
	    questions[2][1]= "1991" ;
	  	questions[2][2]= "1990" ;
	    questions[2][3]= "1988" ;
	    questions[2][4]= "1984" ;
	  //4th question
	  	questions[3][0]= "Which of the following is a free database software running free SQL Server technology?" ;
	  	questions[3][1]= "SQL Server Web" ;
	  	questions[3][2]= "SQL Server Enterprise" ;
	  	questions[3][3]= "SQL Server Workgroup" ;
	  	questions[3][4]= "SQL Server Express" ;
	  //5th question
	  	questions[4][0]= "Which of the following companies originally worked together to create and market the first version of SQL Server?" ;
	  	questions[4][1]= "Sybase" ;
	  	questions[4][2]= "Ashton-Tate" ;
  	    questions[4][3]= "Microsoft" ;
  	    questions[4][4]= "All of the Mentioned" ;
  	//6th question
  		questions[5][0]= "What is the Codename for SQL Server 2012?" ;
  	    questions[5][1]= "Katmai" ;
  	    questions[5][2]= "Denali" ;
  	    questions[5][3]= "Hekaton" ;
  	    questions[5][4]= "Kilimanjaro" ;
  	//7th question
  		questions[6][0]= "Which was the first version of SQL Server to introduce in-memory capability?" ;
  	    questions[6][1]= "SQL Server 2008" ;
  	    questions[6][2]= "SQL Server 2015" ;
  	    questions[6][3]= "SQL Server 2014" ;
  	    questions[6][4]= "SQL Server 2006" ;
  	//8th question
  		questions[7][0]= "Which of the following data type is not present in SQL Server?" ;
  	    questions[7][1]= "boolean" ;
  	    questions[7][2]= "geography" ;
  	    questions[7][3]= "hierarchyid" ;
  	    questions[7][4]= "bit" ;
  	//9th question
  		questions[8][0]= "SQL Server has mainly how many types of views?" ;
  	    questions[8][1]= "three" ;
  	    questions[8][2]= "one" ;
  	    questions[8][3]= "two" ;
  	    questions[8][4]= "five" ;
  	//10th question
  		questions[9][0]= "Which of the following is not a class of constraint in SQL Server?" ;
  	    questions[9][1]= "UNIQUE" ;
  	    questions[9][2]= "NOT NULL" ;
  	    questions[9][3]= "CHECK" ;
  	    questions[9][4]= "NULL" ;
  	    
  	//Answers list
  	    answers[0][1]="Where, from";
  	    answers[1][1]="Select";
     	answers[2][1]="1988";
     	answers[3][1]="SQL Server Express";
     	answers[4][1]="All of the Mentioned";
     	answers[5][1]="Denali";
     	answers[6][1]="SQL Server 2014";
     	answers[7][1]="boolean";
     	answers[8][1]="two";
     	answers[9][1]="NULL";
     	
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
     	submit.addActionListener(this);
     	submit.setEnabled(false);  //to disable the button
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
			next.setEnabled(false);
			submit.setEnabled(true);
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
		new Score(name,score);
		
	}
	
	
	}


	
	//timer set
		public void paint(Graphics g) {
			super.paint(g);
			String time="Time left = "+ timer +"  seconds"; 
			g.setFont(new Font("Goudy Old Style", Font.BOLD,25));
			g.setColor(Color.RED);
			
			if(timer>0) {
				g.drawString(time, 1100, 400);
			}else {
				g.drawString("Times up!!", 1100, 400); //when times gone 0 then it will show times up
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
						new Score(name,score); //score object
						
						
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
		new Sql_Quiz();

	}

}
