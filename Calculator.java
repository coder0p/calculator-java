import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
 
public class Calculator implements ActionListener{
	JFrame jf;
	JLabel displayLabel;
	JButton seven,eight,nine,four,five,six,one,two,three,dot,zero,equals,addition,substraction,division,multiplication,clear;
	boolean isOperatorClicked=false;
	int count=0;
	String oldValue;
	
	Calculator(){
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setResizable(false);
		jf.setSize(400, 600);
		jf.getContentPane().setBackground(Color.darkGray);
		displayLabel=new JLabel();
		displayLabel.setFont(new Font("Ariel", Font.PLAIN, 25));
		displayLabel.setBounds(30, 50, 325, 100);
		displayLabel.setBackground(Color.WHITE);
		displayLabel.setForeground(Color.DARK_GRAY);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		seven=new JButton("7");
		seven.setBounds(30, 170, 50, 50);
		seven.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(seven);
		seven.addActionListener(this);
		
		eight=new JButton("8");
		eight.setBounds(115, 170, 50, 50);
		eight.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(eight);
		eight.addActionListener(this);
		
		nine=new JButton("9");
		nine.setBounds(200, 170, 50, 50);
		nine.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(nine);
		nine.addActionListener(this);
		
		
		four=new JButton("4");
		four.setBounds(30, 250, 50, 50);
		four.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(four);
		four.addActionListener(this);
		
		five=new JButton("5");
		five.setBounds(115, 250, 50, 50);
		five.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(five);
		five.addActionListener(this);
		
		six=new JButton("6");
		six.setBounds(200, 250, 50, 50);
		six.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(six);
		six.addActionListener(this);
		
		one=new JButton("1");
		one.setBounds(30, 330, 50, 50);
		one.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(one);
		one.addActionListener(this);
		
		two=new JButton("2");
		two.setBounds(115, 330, 50, 50);
		two.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(two);
		two.addActionListener(this);
		
		three=new JButton("3");
		three.setBounds(200, 330, 50, 50);
		three.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(three);
		three.addActionListener(this);
		
		zero=new JButton("0");
		zero.setBounds(30, 410, 50, 50);
		zero.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(zero);
		zero.addActionListener(this);
		
		dot=new JButton(".");
		dot.setBounds(115, 410, 50, 50);
		dot.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(dot);
		dot.addActionListener(this);
		
		equals=new JButton("=");
		equals.setBounds(200, 410, 50, 50);
		equals.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(equals);
		equals.addActionListener(this);
		
		
		division=new JButton("/");
		division.setBounds(270, 170, 90, 50);
		division.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(division);
		division.addActionListener(this);
		
		substraction=new JButton("-");
		substraction.setBounds(270, 330, 90, 50);
		substraction.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(substraction);
		substraction.addActionListener(this);
		
		
		multiplication=new JButton("X");
		multiplication.setBounds(270, 250, 90, 50);
		multiplication.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(multiplication);
		multiplication.addActionListener(this);
		
		addition=new JButton("+");
		addition.setBounds(270, 410, 90, 50);
		addition.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(addition);
		addition.addActionListener(this);
		
		clear=new JButton("Clear");
		clear.setBounds(140, 480, 100, 50);
		clear.setFont(new Font("Ariel", Font.BOLD, 25));
		jf.add(clear);
		clear.addActionListener(this);
		
		
		jf.setLocation(500, 50);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==seven) {
			if(isOperatorClicked==true) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if(e.getSource()==eight) {
			if(isOperatorClicked==true) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()==nine) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()==four) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()==five) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()==six) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()==one) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()==two) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()==three) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()==zero) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
		displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource()==dot) {
			displayLabel.setText(displayLabel.getText()+".");
		}else if(e.getSource()==equals) {
		
			
			String newValue=displayLabel.getText();
			float oldValuef=Float.parseFloat(oldValue);
			float newValuef=Float.parseFloat(newValue);
			
			if(count==1) {
				float result = oldValuef+newValuef;
				 displayLabel.setText(result+"");
			}else if(count==2) {
				float result = oldValuef-newValuef;
				 displayLabel.setText(result+"");
			}else if(count==3) {
				float result = oldValuef*newValuef;
				 displayLabel.setText(result+"");
			}else if(count==4) {
				float result = oldValuef/newValuef;
				 displayLabel.setText(result+"");
			}
		}
			
		else if(e.getSource()==addition) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			count=1;
			
			
			
		}else if(e.getSource()==clear) {
			displayLabel.setText(" ");
		}
		else if(e.getSource()==division) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			count=4;
		}
		else if(e.getSource()==substraction) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			count=2;
			
		}else if(e.getSource()==multiplication) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			count=3;
		}
	}

}

