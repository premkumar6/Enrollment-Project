package school;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;




/*public class Swing
{
	public static void main(String args[])
	{
   Demo1 d= new Demo1();
    }
}*/

class Demo1 extends JFrame
{
	JTextField t1, t2, t3, t4, t5, t6,t7, t8, t9;
	JLabel l1, l2, l3, l4, l5, l6, l7, lr, wl, head, l8, l9, lpay, lfin;
	JButton b;
	JRadioButton r1, r2, r4, r5,r3, rfin;
	JSeparator s;
	JPanel contentPane;
	 
	
	public Demo1(Details d)
	{
		
		
		d.input();
		//setLayout(new FlowLayout());
		 setBounds(450, 190, 1014, 597);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
		String f= d.fees +"";
		t1= new JTextField(d.fname);
		t2= new JTextField(d.lname);
		t3= new JTextField(d.dob);
		t4= new JTextField(d.branchname);
		t5= new JTextField(d.courses);
		t7= new JTextField(d.usn);
		t6= new JTextField(f);
		t8= new JTextField(d.father);
		t9= new JTextField(d.mother);
		b=  new JButton("OK");
		l1= new JLabel("First Name:");
		l2= new JLabel("Last Name:");
		l3= new JLabel("Date of Birth:");
		l4= new JLabel("Branch:");
		l5= new JLabel("Courses:");
		l6= new JLabel("Fees:");
		l7= new JLabel("USN:");
		l8= new JLabel("Father's Name:");
		l9= new JLabel("Mother's Name:");
		lr= new JLabel("Select Gender"); 
		lpay= new JLabel("Payment Mode"); 
		lfin= new JLabel("I agree to submit my Marks card to avail scholarship");
		
		
		r1= new JRadioButton();
		r2= new JRadioButton();
		r3= new JRadioButton();
		r4= new JRadioButton();
		r5= new JRadioButton();
		rfin= new JRadioButton();


		ButtonGroup bg= new ButtonGroup();
		ButtonGroup bg1= new ButtonGroup();
		 
		if(d.sem==1)
		{
		head= new JLabel("Enrollment Form");
        head.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        head.setBounds(362, 0, 325, 50);
        contentPane.add(head);
		}
		else if(d.sem==3|| d.sem==5 || d.sem==7)
		{
			head= new JLabel("Course Registration Form");
	        head.setFont(new Font("Times New Roman", Font.PLAIN, 42));
	        head.setBounds(310, 0, 525, 50);
	        contentPane.add(head);
		}
		
		l1.setBounds(20, 100, 100, 30);
		contentPane.add(l1); 
		t1.setBounds(110, 100, 200, 30);
		contentPane.add(t1);   
		t1.setColumns(10);
		l2.setBounds(20, 150, 100, 30);
		contentPane.add(l2); 
		t2.setBounds(110, 150, 200, 30);
		contentPane.add(t2);
		l3.setBounds(20, 200, 100, 30);
		contentPane.add(l3); 
		t3.setBounds(110, 200, 200, 30);
		contentPane.add(t3);
		lr.setBounds(20, 260, 100, 30);
		contentPane.add(lr); 
		r1.setText("Male");
	    r1.setBounds(110, 250, 120, 50);
		contentPane.add(r1);
		r2.setText("Female");
	    r2.setBounds(110, 280, 120, 50);
		contentPane.add(r2);
		bg.add(r1);
		bg.add(r2); 
		l4.setBounds(550, 100, 100, 30);
		contentPane.add(l4);
		t4.setBounds(650, 100, 200, 30);
		contentPane.add(t4);
		l7.setBounds(550, 150, 100, 30);
		contentPane.add(l7);
		t7.setBounds(650, 150, 200, 30);
		contentPane.add(t7);
		l8.setBounds(550, 200, 100, 30);
		contentPane.add(l8);
		t8.setBounds(650, 200, 200, 30);
		contentPane.add(t8);
		l9.setBounds(550, 250, 100, 30);
		contentPane.add(l9);
		t9.setBounds(650, 250, 200, 30);
		contentPane.add(t9);
		l5.setBounds(20, 330, 100, 30);
		contentPane.add(l5);
		t5.setBounds(110, 330, 800, 30);
		contentPane.add(t5);
		l6.setBounds(20, 380, 100, 30);
		contentPane.add(l6);
		t6.setBounds(110, 380, 100, 30);
		contentPane.add(t6);
		
		lpay.setBounds(300, 380, 100, 30);
		contentPane.add(lpay);
		r3.setText("Online");
	    r3.setBounds(450, 370, 120, 50);
		contentPane.add(r3);
		r4.setText("Cash");
	    r4.setBounds(550, 370, 120, 50);
		contentPane.add(r4);
		r5.setText("Cheque/DD");
	    r5.setBounds(650, 370, 120, 50);
		contentPane.add(r5);
		bg1.add(r3);
		bg1.add(r4);
		bg1.add(r5);
		
		lfin.setBounds(20, 430, 400, 30);
		contentPane.add(lfin);
		rfin.setText("I Agree");
	    rfin.setBounds(340, 420, 120, 50);
		contentPane.add(rfin);
	
		
		add(b);
		
	}
}