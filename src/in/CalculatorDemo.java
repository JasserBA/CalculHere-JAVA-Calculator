package in;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Insets;
import java.awt.Window;

public class CalculatorDemo {

	private JFrame frame;
	private JTextField display_Memory; // All input Element are global Variable
	private JTextField border_display;
	private JTextField display_Result;
	private String actionReceived;
	private float First = 0;
	private String MemoryResult; 
	ImageIcon logo = new ImageIcon(".//res//calculHere.png");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorDemo window = new CalculatorDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	
	public CalculatorDemo() {

		/*
		  try { String filename = "digital_7\\digital-7.ttf"; Font customFont =
		  Font.createFont(Font.TRUETYPE_FONT, new File(filename)); customFont =
		  customFont.deriveFont(Font.BOLD, 28);
		  
		  GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		  ge.registerFont(customFont); System.out.println(customFont); // Now you can
		  use customFont for rendering text. } catch (IOException | FontFormatException
		  e) { // Handle the exception appropriately (e.g., log it or display an error
		  message). e.printStackTrace(); }
		 */		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(10, 150, 400, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(logo.getImage());

		display_Memory = new JTextField();
		display_Memory.setMargin(new Insets(2, 2, 10, 2));
		display_Memory.setBackground(Color.DARK_GRAY);
		display_Memory.setBorder(null);
		display_Memory.setBounds(250, 37, 85, 23);
		display_Memory.setHorizontalAlignment(SwingConstants.CENTER);
		display_Memory.setFont(new Font("Arial", Font.PLAIN, 15));
		display_Memory.setForeground(new Color(255, 255, 255));
		display_Memory.setColumns(10);
		frame.getContentPane().add(display_Memory);
		
		display_Result = new JTextField();
		display_Result.setBorder(null);
		display_Result.setForeground(Color.WHITE);
		display_Result.setFont(new Font("Arial", Font.BOLD, 40));
		display_Result.setColumns(10);
		display_Result.setBackground(Color.DARK_GRAY);
		display_Result.setBounds(64, 60, 271, 37);
		frame.getContentPane().add(display_Result);
		
		border_display = new JTextField();
		border_display.setBounds(54, 45, 288, 62);
		border_display.setFont(new Font("Arial", Font.BOLD, 40));
		border_display.setForeground(new Color(255, 255, 255));
		border_display.setBackground(Color.DARK_GRAY);
		border_display.setColumns(10);
		frame.getContentPane().add(border_display);
		
		JEditorPane display_main = new JEditorPane();
		display_main.setBounds(44, 37, 305, 78);
		display_main.setBackground(new Color(60, 60, 60));
		frame.getContentPane().add(display_main);
		display_main.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_1.getText());
			}
		});
		btn_1.setBackground(new Color(243, 243, 243));
		btn_1.setBounds(42, 230, 70, 70);
		frame.getContentPane().add(btn_1);
		btn_1.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_2.getText());
			}
		});
		btn_2.setBackground(new Color(243, 243, 243));
		btn_2.setBounds(122, 230, 70, 70);
		frame.getContentPane().add(btn_2);
		btn_2.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_3.getText());
			}
		});
		btn_3.setBackground(new Color(243, 243, 243));
		btn_3.setBounds(202, 230, 70, 70);
		frame.getContentPane().add(btn_3);
		btn_3.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_4.getText());
			}
		});
		btn_4.setBackground(new Color(243, 243, 243));
		btn_4.setBounds(42, 310, 70, 70);
		frame.getContentPane().add(btn_4);
		btn_4.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_5.getText());
			}
		});
		btn_5.setBackground(new Color(243, 243, 243));
		btn_5.setBounds(124, 310, 70, 70);
		frame.getContentPane().add(btn_5);
		btn_5.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_6.getText());
			}
		});
		btn_6.setBackground(new Color(243, 243, 243));
		btn_6.setBounds(202, 310, 70, 70);
		frame.getContentPane().add(btn_6);
		btn_6.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_7.getText());
			}
		});
		btn_7.setBackground(new Color(243, 243, 243));
		btn_7.setBounds(42, 395, 70, 70);
		frame.getContentPane().add(btn_7);
		btn_7.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_8.getText());
			}
		});
		btn_8.setBackground(new Color(243, 243, 243));
		btn_8.setBounds(124, 395, 70, 70);
		frame.getContentPane().add(btn_8);
		btn_8.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_9.getText());
			}
		});
		btn_9.setBackground(new Color(243, 243, 243));
		btn_9.setBounds(202, 395, 70, 70);
		frame.getContentPane().add(btn_9);
		btn_9.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_0.getText());
			}
		});
		btn_0.setBackground(new Color(243, 243, 243));
		btn_0.setBounds(42, 475, 70, 70);
		frame.getContentPane().add(btn_0);
		btn_0.setFont(new Font("Arial", Font.BOLD, 40));


		JButton btn_Division = new JButton("÷");
		btn_Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionReceived = btn_Division.getText();
				display_Memory.setVisible(true);
				if(display_Memory.getText() == null || display_Memory.getText().isEmpty()) {
					display_Memory.setText(display_Result.getText() + btn_Division.getText());
				}
				else {
					display_Memory.setText(display_Memory.getText() + display_Result.getText() + btn_Division.getText());;
				}
				display_Result.setText(null);	
				if (display_Memory.getText().length()>0) {
					String memoryText = display_Memory.getText().substring(0,display_Memory.getText().length()-1);				
			        First = Integer.parseInt(memoryText);
				}
			}
		});
		btn_Division.setForeground(Color.LIGHT_GRAY);
		btn_Division.setBounds(279, 145, 70, 70);
		btn_Division.setBackground(new Color(89, 89, 89));
		frame.getContentPane().add(btn_Division);
		btn_Division.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_Multiplication = new JButton("×");
		btn_Multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionReceived = btn_Multiplication.getText();
				display_Memory.setVisible(true);
				if(display_Memory.getText() == null) {
					display_Memory.setText(display_Result.getText() + btn_Multiplication.getText());
				}
				else {
					display_Memory.setText(display_Memory.getText() + display_Result.getText() + btn_Multiplication.getText());;
				}
				display_Result.setText(null);
				if (display_Memory.getText().length()>0) {
					String memoryText = display_Memory.getText().substring(0,display_Memory.getText().length()-1);				
			        First = Integer.parseInt(memoryText);
				}
			}
		});
		btn_Multiplication.setForeground(Color.LIGHT_GRAY);
		btn_Multiplication.setBounds(279, 230, 70, 70);
		btn_Multiplication.setBackground(new Color(89, 89, 89));
		frame.getContentPane().add(btn_Multiplication);
		btn_Multiplication.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_Substraction = new JButton("-");
		btn_Substraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionReceived = btn_Substraction.getText();
				display_Memory.setVisible(true);
				if(display_Memory.getText() == null) {
					display_Memory.setText(display_Result.getText() + btn_Substraction.getText());
				}
				else {
					display_Memory.setText(display_Memory.getText() + display_Result.getText() + btn_Substraction.getText());;
				}
				display_Result.setText(null);	
				if (display_Memory.getText().length()>0) {
					String memoryText = display_Memory.getText().substring(0,display_Memory.getText().length()-1);				
			        First = Integer.parseInt(memoryText);
				}
			}
		});
		btn_Substraction.setForeground(Color.LIGHT_GRAY);
		btn_Substraction.setBounds(279, 310, 70, 70);
		btn_Substraction.setBackground(new Color(89, 89, 89));
		frame.getContentPane().add(btn_Substraction);
		btn_Substraction.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_Addidition = new JButton("+");
		btn_Addidition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionReceived = btn_Addidition.getText();
				display_Memory.setVisible(true);
				if(display_Memory.getText() == null) {
					display_Memory.setText(display_Result.getText() + btn_Addidition.getText());
				}

				else {
					display_Memory.setText(display_Memory.getText() + display_Result.getText() + btn_Addidition.getText());;
					/*
					 * if (display_Memory.getText().charAt(display_Memory.getText().length()-1) ==
					 * '=') { MemoryResult = display_Result.getText();
					 * display_Memory.setText(MemoryResult + btn_Addidition.getText()); }
					 */
				}
				display_Result.setText(null);	
/*				if (display_Memory.getText().length()>0) {
					String memoryText = display_Memory.getText().substring(0,display_Memory.getText().length()-1);				
			        First = Integer.parseInt(memoryText);
				}
			if (display_Result.getText().contains("=")){
					 if (display_Memory.getText().charAt(display_Memory.getText().length()-2) == '=' || display_Memory.getText().charAt(display_Memory.getText().length()-3) == '=') {					 
						 MemoryResult = display_Result.getText();
						 display_Memory.setText(MemoryResult);
				 }
				}*/

			}
		});
		btn_Addidition.setBounds(279, 395, 70, 70);
		btn_Addidition.setBackground(new Color(89, 89, 89));
		btn_Addidition.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn_Addidition);
		btn_Addidition.setFont(new Font("Arial", Font.BOLD, 40));

		
		JButton btn_Equal = new JButton("=");
		btn_Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 display_Memory.setVisible(true);
			 // Check if DisplayMemory's text is empty or null
			 if(display_Memory.getText().isEmpty() || display_Memory.getText() == null) {
			 	display_Memory.setText(display_Result.getText() + btn_Equal.getText());
			 }
			 else {
				display_Memory.setText(display_Memory.getText() + display_Result.getText() + btn_Equal.getText());;
			 }
				
			 float Second = Integer.parseInt(display_Result.getText());
			
			 if (actionReceived.equals("÷") && First !=0) { 
				 float div =  First / Second;
				 display_Result.setText(String.valueOf(div));
				 First = Float.valueOf(display_Result.getText());
			 }
			 if (actionReceived.equals("×") && First !=0) { 
				 int  Mul = (int) (First * Second);
				 display_Result.setText(String.valueOf(Mul));
				 First = Float.valueOf(display_Result.getText());
			 }
			 if (actionReceived.equals("-") && First !=0) { 
				 int Sub = (int) (First - Second);
				 display_Result.setText(String.valueOf(Sub)); 
				 First = Float.valueOf(display_Result.getText());
			 }
			 if (actionReceived.equals("+") && First !=0) { 
				 int Add = (int) (First + Second);
				 display_Result.setText(String.valueOf(Add));
				 First = Float.valueOf(display_Result.getText());
			 }
				
			}	
		});
		btn_Equal.setForeground(Color.LIGHT_GRAY);
		btn_Equal.setBounds(124, 475, 225, 70);
		btn_Equal.setBackground(new Color(89, 89, 89));
		btn_Equal.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.getContentPane().add(btn_Equal);
		btn_Equal.setFont(new Font("Arial", Font.BOLD, 40));
		
		JButton btn_ClearE = new JButton("CE");
		btn_ClearE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(null);
				display_Memory.setText(null);
				display_Memory.setVisible(false);
			}
		});

		btn_ClearE.setBounds(122, 145, 70, 70);
		btn_ClearE.setForeground(Color.LIGHT_GRAY);
		btn_ClearE.setBackground(new Color(89, 89, 89));
		frame.getContentPane().add(btn_ClearE);
		btn_ClearE.setFont(new Font("Arial", Font.BOLD, 25));

		
		JButton btn_Dot = new JButton(".");
		btn_Dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display_Result.setText(display_Result.getText() + btn_Dot.getText());
			}
		});
		btn_Dot.setForeground(Color.LIGHT_GRAY);
		btn_Dot.setBounds(199, 145, 70, 70);
		btn_Dot.setBackground(new Color(89, 89, 89));
		frame.getContentPane().add(btn_Dot);
		btn_Dot.setFont(new Font("Arial", Font.BOLD, 40));
		
		JButton btn_Back = new JButton("<");
		btn_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(display_Result.getText().isEmpty() || display_Result.getText()== null)) {
					display_Result.setText(display_Result.getText().substring(0,display_Result.getText().length()-1));
				}
			}
		});

		
		btn_Back.setForeground(Color.LIGHT_GRAY);
		btn_Back.setFont(new Font("Arial", Font.BOLD, 25));
		btn_Back.setBackground(new Color(89, 89, 89));
		btn_Back.setBounds(42, 145, 70, 70);
		frame.getContentPane().add(btn_Back);
		
		JPanel panel_0 = new JPanel();
		panel_0.setBackground(Color.DARK_GRAY);
		panel_0.setBounds(20, 37, 8, 78);
		frame.getContentPane().add(panel_0);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 515, 8, 76);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(0, 585, 78, 8);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(378, 0, 8, 78);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(308, 0, 76, 8);
		frame.getContentPane().add(panel_4);

	}
}
