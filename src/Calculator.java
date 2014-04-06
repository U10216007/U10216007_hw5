import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame {
	
	private JTextField jresult = new JTextField(10);
	private JButton jone = new JButton("1");
	private JButton jtwo = new JButton("2");
	private JButton jthree = new JButton("3");
	private JButton jfour = new JButton("4");
	private JButton jfive = new JButton("5");
	private JButton jsix = new JButton("6");
	private JButton jseven = new JButton("7");
	private JButton jeight = new JButton("8");
	private JButton jnine = new JButton("9");
	private JButton jzero = new JButton("0");
	private JButton jplus= new JButton("+");
	private JButton jminus = new JButton("-");
	private JButton jmutlity = new JButton("*");
	private JButton jdivide = new JButton("/");
	private JButton jdot = new JButton(".");
	private JButton jequal = new JButton("=");
	private String number = "";
	
	public Calculator(){
		
		
	
		JPanel p1 = new JPanel();
		p1.add(jresult);
		add(p1,BorderLayout.NORTH);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4,4,0,0));
		p2.add(jone);
		p2.add(jtwo);
		p2.add(jthree);
		p2.add(jplus);
		p2.add(jfour);
		p2.add(jfive); 
		p2.add(jsix);		
		p2.add(jminus);
		p2.add(jseven);
		p2.add(jeight);
		p2.add(jnine);
		p2.add(jmutlity);
		p2.add(jzero);
		p2.add(jdot);
		p2.add(jequal);
		p2.add(jdivide);
		
		add(p2,BorderLayout.CENTER);
		
		jone.addActionListener(new ButtonListner());
		jtwo.addActionListener(new ButtonListner());
		jthree.addActionListener(new ButtonListner());
		jfour.addActionListener(new ButtonListner());
		jfive.addActionListener(new ButtonListner());
		jsix.addActionListener(new ButtonListner());
		jseven.addActionListener(new ButtonListner());
		jeight.addActionListener(new ButtonListner());
		jnine.addActionListener(new ButtonListner());
		jzero.addActionListener(new ButtonListner());
		jdot.addActionListener(new ButtonListner());
		
	}
	
	class ButtonListner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == jone){
				number = number + "1";
				jresult.setText(number);
			}else if(e.getSource() == jtwo){
				number = number + "2";
				jresult.setText(number);
			}else if(e.getSource() == jthree){
				number = number + "3";
				jresult.setText(number);
			}else if(e.getSource() == jfour){
				number = number + "4";
				jresult.setText(number);
			}else if(e.getSource() == jfive){
				number = number + "5";
				jresult.setText(number);
			}else if(e.getSource() == jsix){
				number = number + "6";
				jresult.setText(number);
			}else if(e.getSource() == jseven){
				number = number + "7";
				jresult.setText(number);
			}else if(e.getSource() == jeight){
				number = number + "8";
				jresult.setText(number);
			}else if(e.getSource() == jnine){
				number = number + "9";
				jresult.setText(number);
			}else if(e.getSource() == jzero){
				number = number + "0";
				jresult.setText(number);
			}else if(e.getSource() == jdot){
				number = number + ".";
				jresult.setText(number);	
				
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		
		Calculator frame = new Calculator();
		frame.setTitle("Calculator");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	
	
}








