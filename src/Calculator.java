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
	JLabel displaylabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButon;
	JButton threeButton;
	JButton pointButton;
	JButton zeroButton;
	JButton equalButton;
	JButton devisionButton;
	JButton multiplicationButton;
	JButton substractionButton;
	JButton additionButton;
	JButton clearButton;
	boolean isoperatorclicked = false;
	String oldvalue;
	String newvalue;
	float result;
	int operation=0;
	
	
	
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setSize(600, 600);
		jf.setLayout(null);
		jf.setLocation(40, 40);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	displaylabel=new JLabel();
	displaylabel.setBounds(30, 50, 540, 40);
	displaylabel.setBackground(Color.gray);
	displaylabel.setOpaque(true);
	displaylabel.setForeground(Color.WHITE);
	jf.add(displaylabel);
	displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displaylabel.setFont(new Font("Arial", Font.BOLD, 30));
	
	
	
	sevenButton=new JButton("7");
	sevenButton.setBounds(30, 130, 80, 80);
	sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
	sevenButton.addActionListener(this);
	jf.add(sevenButton);
	
	eightButton=new JButton("8");
	eightButton.setBounds(130, 130, 80, 80);
	eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
	eightButton.addActionListener(this);
	jf.add(eightButton);
	
	nineButton=new JButton("9");
	nineButton.setBounds(230, 130, 80, 80);
	nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
	nineButton.addActionListener(this);
	jf.add(nineButton);
	
	fourButton=new JButton("4");
	fourButton.setBounds(30, 230, 80, 80);
	fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
	fourButton.addActionListener(this);
	jf.add(fourButton);
	
	fiveButton=new JButton("5");
	fiveButton.setBounds(130, 230, 80, 80);
	fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
	fiveButton.addActionListener(this);
	jf.add(fiveButton);
	
	sixButton=new JButton("6");
	sixButton.setBounds(230, 230, 80, 80);
	sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
	sixButton.addActionListener(this);
	jf.add(sixButton);
	
	oneButton=new JButton("1");
	oneButton.setBounds(30, 330, 80, 80);
	oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
	oneButton.addActionListener(this);
	jf.add(oneButton);
	
	twoButon=new JButton("2");
	twoButon.setBounds(130, 330, 80, 80);
	twoButon.setFont(new Font("Arial", Font.PLAIN, 40));
	twoButon.addActionListener(this);
	jf.add(twoButon);
	
	threeButton=new JButton("3");
	threeButton.setBounds(230, 330, 80, 80);
	threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
	threeButton.addActionListener(this);
	jf.add(threeButton);
	
	pointButton=new JButton(".");
	pointButton.setBounds(30, 430, 80, 80);
	pointButton.setFont(new Font("Arial", Font.PLAIN, 40));
	pointButton.addActionListener(this);
	jf.add(pointButton);
	
	zeroButton=new JButton("0");
	zeroButton.setBounds(130, 430, 80, 80);
	zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
	zeroButton.addActionListener(this);
	jf.add(zeroButton);
	
	equalButton=new JButton("=");
	equalButton.setBounds(230, 430, 80, 80);
	equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
	equalButton.addActionListener(this);
	jf.add(equalButton);
	
	devisionButton=new JButton("/");
	devisionButton.setBounds(330, 130, 80, 80);
	devisionButton.setFont(new Font("Arial", Font.PLAIN, 40));
	devisionButton.addActionListener(this);
	jf.add(devisionButton);
	
	multiplicationButton=new JButton("x");
	multiplicationButton.setBounds(330, 230, 80, 80);
	multiplicationButton.setFont(new Font("Arial", Font.PLAIN, 40));
	multiplicationButton.addActionListener(this);
	jf.add(multiplicationButton);
	
	substractionButton=new JButton("-");
	substractionButton.setBounds(330, 330, 80, 80);
	substractionButton.setFont(new Font("Arial", Font.PLAIN, 40));
	substractionButton.addActionListener(this);
	jf.add(substractionButton);
	
	additionButton=new JButton("+");
	additionButton.setBounds(330, 430, 80, 80);
	additionButton.setFont(new Font("Arial", Font.PLAIN, 40));
	additionButton.addActionListener(this);
	jf.add(additionButton);
	
	clearButton=new JButton("clear");
	clearButton.setBounds(430, 430, 80, 80);
	clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
	clearButton.addActionListener(this);
	jf.add(clearButton);
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) 
			if(isoperatorclicked) {
				displaylabel.setText("7");
				isoperatorclicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"7");
			}
		
		
		
		else if(e.getSource()==eightButton) {
			if(isoperatorclicked) {
				displaylabel.setText("8");
				isoperatorclicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"8");
			}
		}
		
		
		
		
		else if(e.getSource()==nineButton) {
			if(isoperatorclicked) {
				displaylabel.setText("9");
				isoperatorclicked=false;
			}else {
				displaylabel.setText(displaylabel.getText()+"9");
			}
		}
		
		
		else if(e.getSource()==fourButton) {
			if(isoperatorclicked) {
				displaylabel.setText("4");
				isoperatorclicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"4");
			}
		}
		
		else if(e.getSource()==fiveButton) {
			if(isoperatorclicked) {
				displaylabel.setText("5");
				isoperatorclicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"5");
			}
		}
		
		else if(e.getSource()==sixButton) {
			if(isoperatorclicked) {
				displaylabel.setText("6");
				isoperatorclicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"6");
			}
		}
		
		
		else if(e.getSource()==oneButton) {
			if (isoperatorclicked) {
				displaylabel.setText("1");
				isoperatorclicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"1");
			}
		}
		
		
		else if(e.getSource()==twoButon) {
			if(isoperatorclicked) {
				displaylabel.setText("2");
				isoperatorclicked=false;
				
			}else {
			displaylabel.setText(displaylabel.getText()+"2");
			}
		}
		
		
		else if(e.getSource()==threeButton) {
			if(isoperatorclicked) {
				displaylabel.setText("3");
				isoperatorclicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"3");
			}
		}
		
		
		else if(e.getSource()==zeroButton) {
			if(isoperatorclicked) {
				displaylabel.setText("0");
				isoperatorclicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"0");
			}
		}
		
		
		else if(e.getSource()==clearButton) {
			displaylabel.setText("");
		}
		
		
		
		
		
		
		
		else if(e.getSource()==pointButton) {
			displaylabel.setText(displaylabel.getText()+".");
		}
		
		
		
		
		
		
		
		else if(e.getSource()==additionButton) {
			isoperatorclicked=true;
			operation=1;
			oldvalue=displaylabel.getText();
		}
		
		
		else if(e.getSource()==devisionButton) {
			isoperatorclicked=true;
			operation=4;
			oldvalue=displaylabel.getText();
			
		}
		
		
		
		else if(e.getSource()==substractionButton) {
			isoperatorclicked=true;
			operation=2;
			oldvalue=displaylabel.getText();
		}
		
		else if(e.getSource()==multiplicationButton) {
			isoperatorclicked=true;
			operation=3;
			oldvalue=displaylabel.getText();
		}
		
		
		
		else if(e.getSource()==equalButton) {
			newvalue=displaylabel.getText();
			
			if(operation==1) {
			float oldvalueF=Float.parseFloat(oldvalue);
			float newvalueF=Float.parseFloat(newvalue);
			
			result=oldvalueF+newvalueF;
			
			displaylabel.setText(result+"");
			}
			
			else if(operation==2) {
				float oldvalueF=Float.parseFloat(oldvalue);
				float newvalueF=Float.parseFloat(newvalue);
				result=oldvalueF-newvalueF;
				displaylabel.setText(result+"");
			}
			
			else if(operation==3) {
				float oldvalueF=Float.parseFloat(oldvalue);
				float newvalueF=Float.parseFloat(newvalue);
				result=oldvalueF*newvalueF;
				displaylabel.setText(result+"");
				
			}
			
			else if(operation==4) {
				float oldvalueF=Float.parseFloat(oldvalue);
				float newvalueF=Float.parseFloat(newvalue);
				result=oldvalueF/newvalueF;
				displaylabel.setText(result+"");
			}
		}
		
		
		
			
			
		
	
		
	}
	
}	
	
	
		
	
	
	
		
		
	
		
	


