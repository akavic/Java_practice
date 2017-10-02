import  javax.swing.JFrame;
import  javax.swing.JTextField;
import  javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import  javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class Graph1 extends JFrame
{
	private JLabel item1;
	
	Graph1()
	{
	/* creating the window*/
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1=new JLabel("this is a sentence");
		item1.setToolTipText("whoo your hovering");
		add(item1);
	}
	
}
class Graph2 extends JFrame
{
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField pwd;
	
	Graph2()
	{
		/* creating the window*/
		super("great window");// add a title
		setLayout(new FlowLayout());
		
		item1=new JTextField(10);
		add(item1);
		item2=new JTextField("Enter text here");
		add(item2);
		item3=new JTextField("Uneditable",20);
		item3.setEditable(false);
		add(item3);
		pwd=new JPasswordField("what's the code");
		add(pwd);
		
		theHandler handler= new theHandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		pwd.addActionListener(handler);
		
		
		
	}
	private class theHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event) //event is like an enter or click
		{
			//.getSourc basically where it happend 
			String str1="";
			if(event.getSource()==item1)
				str1=String.format("field 1: %s", event.getActionCommand());
				//getActionCommand() gets the text from that location if they type bucky the field one is bucky
			else if(event.getSource()==item2)
				str1=String.format("field 2: %s", event.getActionCommand());
			else if(event.getSource()==item3)
				str1=String.format("field 3: %s", event.getActionCommand());
			else if(event.getSource()==pwd)
				str1=String.format("password field is: %s", event.getActionCommand());
				
			JOptionPane.showMessageDialog(null,str1);
			
			
			
		}

	}
}
class Graphics 
{
	public static void main(String [] args)
	{
		
		Graph2 victor=new Graph2();
		victor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		victor.setSize(300,150);
		victor.setVisible(true);
	
	}
}

	/*
		creating a window graph1();
		
		Graph1 victor=new graph1();
		victor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		victor.setSize(300,300);
		victor.setVisible(true);
	*/



	/* adding and deleting nubers
	
	String fn= JOptionPane.showInputDialog("Enter first number");
		String sn= JOptionPane.showInputDialog("Enter first number");
		
		int num1=Integer.parseInt(fn);
		int num2=Integer.parseInt(sn);
		
		int sum=num1+num2;
		JOptionPane.showMessageDialog(null,"the answer is "+sum,"your a genius",JOptionPane.PLAIN_MESSAGE);*/