import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ins extends JFrame implements ActionListener{
	JButton st;
	ins(){
		getContentPane().setBackground(Color.WHITE);
//buttons
		st = new JButton("START");
		st.setBounds(90,200,120,25);
		st.setBackground(Color.WHITE);       
		st.setForeground(Color.BLACK);
		st.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		st.addActionListener(this);
		add(st);
//text
		JLabel heading =new JLabel(" NUMBER GAME");
		heading.setBounds(15,10,280,30);
		heading.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		heading.setForeground(Color.BLACK);
		add(heading);

		JLabel h1 =new JLabel(" Instructions:");
		h1.setBounds(10,60,280,30);
		h1.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		h1.setForeground(Color.BLACK);
		add(h1);

		JLabel rul =new JLabel();
		rul.setBounds(10,70,280,150);
		rul.setFont(new Font("Tahoma", Font.PLAIN,15));
		rul.setForeground(Color.RED);
		rul.setText(
			"<html>" +
				"1. Guess the number between 1-100" + "<br><br>" +
				"2. Hints will be given after each guess" + "<br><br>" + 
				"3. Number of tries taken will be calculated" + "<br><br>" +
			"<html>"
		);
		add(rul);
//frame

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Number Game");
		setSize(300,300);
ImageIcon icon = new ImageIcon(getClass().getResource("/img/icon.png"));
setIconImage(icon.getImage());
		setLocation(500,220);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == st){
			int tries = 0;
     		 	int correct;
      			final int MAX = 100;
      			Random rand = new Random();
      			correct = rand.nextInt(MAX) + 1;
			setVisible(false);
			new gu(correct,"YOUR GUESS",tries);
			
		}
		
	}
	public static void main(String[] args){
		new ins();			
	}
}