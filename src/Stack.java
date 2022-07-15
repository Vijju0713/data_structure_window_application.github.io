import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStackDataStructure = new JLabel("STACK DATA STRUCTURE");
		lblStackDataStructure.setForeground(new Color(0, 128, 128));
		lblStackDataStructure.setFont(new Font("Algerian", Font.BOLD, 18));
		lblStackDataStructure.setBounds(112, 4, 252, 32);
		contentPane.add(lblStackDataStructure);
		
		JLabel lblEnterTheStack = new JLabel("ENTER THE STACK SIZE :");
		lblEnterTheStack.setForeground(new Color(0, 0, 255));
		lblEnterTheStack.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterTheStack.setBounds(61, 47, 234, 22);
		contentPane.add(lblEnterTheStack);
		
		sizefield = new JTextField();
		sizefield.setBounds(234, 48, 130, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.setForeground(new Color(128, 0, 128));
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// stack creation code
				size = Integer.valueOf(sizefield.getText());
				s = new int[size];
				String message = "Stack of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		stack.setBounds(153, 80, 165, 27);
		contentPane.add(stack);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT :");
		lblEnterAnElement.setForeground(Color.BLUE);
		lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterAnElement.setBounds(10, 118, 234, 22);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(171, 118, 130, 20);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// push code
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					++top;
					s[top] = elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(128, 0, 128));
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setBounds(324, 118, 89, 23);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pop code
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Pop not Possible");
				}
				else
				{
					String message = "Element deleted is"+" "+s[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
				}
			}
		});
		pop.setForeground(new Color(128, 0, 128));
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(187, 151, 89, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				String msg = "";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else
				{
				for(int i=top; i>=0; i--)
				{
					msg = msg+" "+s[i];
				}
				displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(128, 0, 128));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(161, 185, 146, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(204, 204, 255));
		displaybox.setForeground(new Color(0, 0, 255));
		displaybox.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		displaybox.setColumns(10);
		displaybox.setBounds(10, 223, 414, 27);
		contentPane.add(displaybox);
	}
}
