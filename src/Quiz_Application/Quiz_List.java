package Quiz_Application;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

public class Quiz_List extends JFrame implements ActionListener {
	JButton java,python,sql,back;
	
	Quiz_List(){
		getContentPane().setBackground(Color.GRAY);
		setLayout(null);
		
		//image add
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/2.jpg"));
		JLabel image= new JLabel(i1);
		image.setBounds(0,100,820,400);        //set position of picture
		add(image); 
		
		//heading add
		JLabel heading= new JLabel ("QUIZ LIST");
		heading.setBounds(840,60,350,45);     
		heading.setFont(new Font("Goudy Old Style", Font.BOLD, 50));       
		heading.setForeground(Color.WHITE);         
	   add(heading);   
		//create buttons of java
		
		java = new JButton("JAVA");
		java.setBounds(840, 200,200,35);
		java.setBackground(new Color(30,146,255));
		java.setForeground(Color.WHITE);
		java.setFont(new Font("Goudy Old Style",Font.BOLD,30));
		java.addActionListener(this);   
		add(java);
				
		//create buttons of python
				
		python = new JButton("PYTHON");
		python.setBounds(840,300,200,35);
		python.setBackground(new Color(30,146,255));
		python.setForeground(Color.WHITE);
		python.setFont(new Font("Goudy Old Style",Font.BOLD,30));
		python.addActionListener(this); 
		add(python);
		
		//create buttons of SQL
		
		sql = new JButton("SQL");
		sql.setBounds(840,400,200,35);
		sql.setBackground(new Color(30,146,255));
		sql.setForeground(Color.WHITE);
		sql.setFont(new Font("Goudy Old Style",Font.BOLD,30));
		sql.addActionListener(this); 
		add(sql);
		
		//back to login button
		back = new JButton("BACK TO LOGIN");
		back.setBounds(50,600,300,35);
		back.setBackground(new Color(30,146,255));
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Goudy Old Style",Font.BOLD,20));
		back.addActionListener(this); 
		add(back);
		
		
		
		setSize(1200,700);
		setLocation(200,100);
		setVisible(true);
		
	}
public void actionPerformed(ActionEvent ae) { 
		
		if (ae.getSource() == java) {    
			setVisible(false);     
			 new Java_Quiz();	
		}else
			
		if(ae.getSource() == python) {   
			setVisible(false); 
			new Python_Quiz();
		}else
			
		if(ae.getSource() == sql) {   
		   setVisible(false);
		   new Sql_Quiz();
		}
		if(ae.getSource()==back) {
			setVisible(false);
			new Login();
		}

	}

	public static void main(String[] args) {
		new Quiz_List();

	}

}
