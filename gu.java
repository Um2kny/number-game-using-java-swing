import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gu extends JFrame implements ActionListener{
	JButton sub;
	JTextField gue;
	JLabel heading;
	int correct, tries;
	String com;
	gu(int correct, String com, int tries){
		this.correct = correct;
		this.com = com;
		this.tries = tries;
		getContentPane().setBackground(Color.WHITE);
//buttons
		sub = new JButton("CHECK");
		sub.setBounds(90,170,120,25);
		sub.setBackground(Color.WHITE);       
		sub.setForeground(Color.BLACK);
		sub.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		sub.addActionListener(this);
		add(sub);
//text
		heading =new JLabel("Enter an integer:");
		heading.setBounds(30,70,280,30);
		heading.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		heading.setForeground(Color.BLACK);
		add(heading);

		JLabel h =new JLabel(com);
		h.setBounds(30,10,280,30);
		h.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		h.setForeground(Color.BLACK);
		add(h);
//input
		gue = new JTextField();
		gue.setBounds(130,120,40,25);
		gue.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		add(gue);

//frame

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Number Game");
ImageIcon icon = new ImageIcon(getClass().getResource("/img/icon.png"));
setIconImage(icon.getImage());
		setSize(300,300);
		setLocation(500,220);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == sub){
			int gues = Integer.parseInt(gue.getText());
			if (gues == correct){
				setVisible(false);
				tries++;
				new cong(tries);
			}else if (gues > correct){
				tries++;
				new gu(correct,"TOO HIGH",tries);
				setVisible(false);
			}else if (gues < correct){
				tries++;
				setVisible(false);
				new gu(correct,"TOO LOW",tries);
			}
		}
		
	}
	public static void main(String[] args){
		new gu(0,"YOUR GUESS",0);			
	}
}