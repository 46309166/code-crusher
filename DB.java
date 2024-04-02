import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Hello extends JFrame{
	
	
	JLabel l1;
	JTextField t1;
	JButton b1;
	JPanel jpanel;
	

	public Hello() {
		
		l1=new JLabel("Name:");
		t1=new JTextField("STUDENT INFORMATION SYSTEM");
		b1=new JButton("Submit");
		jpanel=new JPanel();
		
		add(l1);
		
		add(t1);
		add(b1);
		
		setVisible(true);
		setSize(500,500);
		setTitle("STUDENT INFORMATION SYSTEM")
		setLayout(new FlowLayout());
		
		
	}

	public static void main(String[] args) {
		
		
		new Hello();

	}

}

