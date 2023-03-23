package Quiz_Application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
	JButton start, back;
	String name;    
	Rules(String name){
		//create a rules frame background
		
		this.name=name;
		getContentPane().setBackground( new Color(60,156,255));
		setLayout(null);
		
		//heading add
			JLabel heading= new JLabel ("Welcome "+ name + " to Quiz Game");
			heading.setBounds(50,50,650,30);       
			heading.setFont(new Font("Goudy Old Style", Font.BOLD, 40));       
			heading.setForeground(Color.WHITE);         
			add(heading);                        
			
			//create rules list
			JLabel rules= new JLabel ();
			rules.setBounds(20,120,700,350);       
			rules.setFont(new Font("Goudy Old Style", Font.BOLD, 25));       
			rules.setForeground(Color.WHITE); 
			rules.setText(      //rules set dynamically
				"<html>"+
					
				"1.Participation in the quiz is free and open to all persons above 18 years old."
				+"<br> <br>"+
				"2.Humanium reserves the right to conduct necessary checks in order to verify the identity of the participants."
				+"<br> <br>"+
				"3.You can attempt the quiz only once."
				+"<br><br>"+
				"4. There are a total 10 questions of each language."
				+"<br><br>"
					+"<html>"
			);
			add(rules);
			
			//create start button
			start = new JButton("Start");
			start.setBounds(250, 500,100,25);
			start.setBackground(Color.WHITE);
			start.setForeground(Color.BLUE);
			start.addActionListener(this); 
			add(start);
			
			//create back button
			back = new JButton("Back");
			back.setBounds(480, 500,100,25);
			back.setBackground(Color.WHITE);
			back.setForeground(Color.BLUE);
			back.addActionListener(this); 
			add(back);
 
			//create a rules frame
        setSize(800, 600);                 
		
		setLocation(350,100);              
		
		setVisible(true);  
      
	}
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() ==start) {
			setVisible(false);
			new Quiz_List();
			
		}else {
			setVisible(false);
			new Login();
		}
	}

	public static void main(String[] args) {
		new  Rules("User");

	}

}
