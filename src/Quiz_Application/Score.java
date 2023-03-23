package Quiz_Application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
	Score(String name, int score){
		setBounds(180,50,1200,700);
		getContentPane().setBackground(Color.BLUE);
		setLayout(null);
		
		//image add
				ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/Score.jpg"));
				JLabel image= new JLabel(i1);
				image.setBounds(0,100,800,450);        //set position of picture
				add(image); 
				
				// heading label
				JLabel heading=new JLabel("Thank you  "+name+" for playing Quiz Game");
			    heading.setBounds(55,30,1000,80);
			    heading .setFont(new Font("Goudy Old Style", Font.BOLD,40));
			    heading.setForeground(Color.WHITE);
				add(heading);
				
				JLabel newscore=new JLabel("Your Score is "+score);
			    newscore.setBounds(820,300,300,30);
			    newscore .setFont(new Font("Goudy Old Style", Font.BOLD,40));
			    newscore.setForeground(Color.WHITE);
				add(newscore);
				
				JButton submit = new JButton("Play Again");
				submit.setBounds(800,500,300,35);
				submit.setBackground(new Color(30,146,255));
				submit.setForeground(Color.WHITE);
				submit.setFont(new Font("Goudy Old Style",Font.BOLD,30));
				submit.addActionListener(this); 
				add(submit);
				
		
				setVisible(true);
		
	}

	public void actionPerformed (ActionEvent ae) {
		setVisible(false);
		new Login();
		
		
		
	}
	

	public static void main(String[] args) {
	
		new Score("User", 0 );

	}

}
