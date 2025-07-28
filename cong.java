import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class cong extends JFrame implements ActionListener{
	JButton sub;
	int tries;
	cong(int tries){
		this.tries = tries;
		getContentPane().setBackground(Color.WHITE);
//buttons
		sub = new JButton("PLAY AGAIN");
		sub.setBounds(60,130,170,25);
		sub.setBackground(Color.WHITE);       
		sub.setForeground(Color.BLACK);
		sub.setFont(new Font("Mongolian Baiti",Font.BOLD,15));
		sub.addActionListener(this);
		add(sub);
//text
		JLabel heading =new JLabel("Number of tries taken: " + tries + "");
		heading.setBounds(10,70,280,30);
		heading.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
		heading.setForeground(Color.BLACK);
		add(heading);

		JLabel h =new JLabel("CORRECT!!");
		h.setBounds(60,10,280,30);
		h.setFont(new Font("Mongolian Baiti", Font.BOLD,30));
		h.setForeground(Color.BLACK);
		add(h);


//frame

		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Number Game");
		setSize(300,300);
		setLocation(500,220);
ImageIcon icon = new ImageIcon(getClass().getResource("/img/icon.png"));
setIconImage(icon.getImage());
		setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		if (ae.getSource() == sub){
			setVisible(false);
			new ins();
			
		}
		
	}
	public static void main(String[] args){
		new cong(1);			
	}
}