package Quiz_Application;
import java.awt.*;  //import awt

import java.awt.event. *;  //import awt event for click event

import javax.swing.*;     //import swing

public class Login extends JFrame implements  ActionListener { //implement interface actionlistener to click button and open a new frame
	
	JButton rules, back;  //globally declare cuttons
	JTextField ename,mail;   //globaly declare because I want to pass the name on the textfield
	
	
	
	Login(){                               //constructor of Login object
		
		getContentPane().setBackground(Color.GRAY);        //set background color help of awt
		setLayout(null); 
		
		//image add
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
		JLabel image= new JLabel(i1);
		image.setBounds(0,10,600,600);        //set position of picture
		add(image);             //add function to add image in frame
		
		//heading add
		JLabel heading= new JLabel ("QUIZ GAME");
		heading.setBounds(600,60,350,45);     //location set  
		heading.setFont(new Font("Goudy Old Style", Font.BOLD, 50));       //style heading
		heading.setForeground(Color.WHITE);         //color of heading
		add(heading);                        //add function to add heading in frame
		
		//name set
		JLabel name= new JLabel ("Enter your name :");
		name.setBounds(640,180,300,45);     //location set  
		name.setFont(new Font("Goudy Old Style", Font.BOLD, 25));       //style heading
		name.setForeground(Color.WHITE);         //color of heading
		add(name);
		
		//name box set
		ename= new JTextField();        //create textfield for put name
		ename.setBounds(550, 250, 350,40);         // left,top,  width, height
		ename.setFont(new Font ("Goudy Old Style", Font.BOLD, 25));
		add(ename);
		
		//email id set
		JLabel email= new JLabel ("Enter your email id :");
		email.setBounds(630,300,300,45);     //location set  
		email.setFont(new Font("Goudy Old Style", Font.BOLD, 25));       //style heading
		email.setForeground(Color.WHITE);         //color of heading
		add(email); 
				
		//name box set
		mail= new JTextField();        //create textfield for put name
		mail.setBounds(550, 350, 350,40);         // left,top,  width, height
		mail.setFont(new Font ("Goudy Old Style", Font.BOLD, 25));
		add(mail);
	
		
		//create buttons of rules
		
		rules = new JButton("Rules");
		rules.setBounds(540, 450,120,25);
		rules.setBackground(new Color(30,146,255));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);   //add click event to know that this addActionListener function got some action
		add(rules);
		
		//create buttons of back
		
		back = new JButton("Back");
		back.setBounds(780, 450,120,25);
		back.setBackground(new Color(30,146,255));
		back.setForeground(Color.WHITE);
		back.addActionListener(this); 
		add(back);
		
		//frame set
		setSize(1000, 600);                 //length and width of frame
		
		setLocation(250,140);               //Location of the frame
		
		setVisible(true);          //frame is by default hidden so we put this to visible 
		
	}
	public void actionPerformed(ActionEvent ae) { //make abstract method for override unimplement method
		
		if (ae.getSource() == rules) {  //if rules button get clicked then this action willl performe
			String name= ename.getText();  //whatever put in textfield it will show
			setVisible(false);       //to close current frame
			new Rules(name); //create a object to open the class Rules
			
			
		}else
		if(ae.getSource() == back) {   //if back button get clicked then this action willl performe
			setVisible(false);    //to close the frame
		}
	}

	public static void main(String[] args) {
		
		new Login();       //create Login object
		

	}

}
