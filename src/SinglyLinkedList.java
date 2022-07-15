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

public class SinglyLinkedList extends JFrame {
	class Node
	{
	int data;
	Node link;
	}
	private JPanel contentPane;
	private Node first;
	private JTextField rearfield;
	private JTextField frontfield;
	private JTextField displaybox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglyLinkedList frame = new SinglyLinkedList();
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
	public SinglyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 351);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSinglyLinkedList = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
		lblSinglyLinkedList.setForeground(new Color(255, 69, 0));
		lblSinglyLinkedList.setFont(new Font("Algerian", Font.BOLD, 18));
		lblSinglyLinkedList.setBounds(104, 11, 385, 24);
		contentPane.add(lblSinglyLinkedList);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT :");
		lblEnterTheElement.setForeground(new Color(255, 0, 255));
		lblEnterTheElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterTheElement.setBounds(20, 50, 207, 20);
		contentPane.add(lblEnterTheElement);
		
		JLabel label = new JLabel("ENTER THE ELEMENT :");
		label.setForeground(Color.MAGENTA);
		label.setFont(new Font("Constantia", Font.BOLD, 16));
		label.setBounds(20, 97, 207, 20);
		contentPane.add(label);
		
		rearfield = new JTextField();
		rearfield.setFont(new Font("Constantia", Font.BOLD, 15));
		rearfield.setBounds(203, 46, 166, 29);
		contentPane.add(rearfield);
		rearfield.setColumns(10);
		
		frontfield = new JTextField();
		frontfield.setFont(new Font("Constantia", Font.BOLD, 15));
		frontfield.setColumns(10);
		frontfield.setBounds(203, 93, 166, 29);
		contentPane.add(frontfield);
		
		JButton rear = new JButton("INSERT REAR");
		rear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert rear element
				Node temp;
				int elem = Integer.valueOf(rearfield.getText());
				JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
				rearfield.setText("");
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first==null)
				{
					first = newnode;
				}
				else
				{
					temp = first;
					while(temp.link!=null)
					{
						temp = temp.link;
					}
					temp.link = newnode;
				}
				
			}
		});
		rear.setForeground(new Color(184, 134, 11));
		rear.setFont(new Font("Constantia", Font.BOLD, 16));
		rear.setBounds(379, 46, 162, 29);
		contentPane.add(rear);
		
		JButton front = new JButton("INSERT FRONT");
		front.setForeground(new Color(184, 134, 11));
		front.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert front element
				int elem = Integer.valueOf(frontfield.getText());
				JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
				frontfield.setText("");
				Node newnode = new Node();
				newnode.data = elem;
				newnode.link = null;
				if(first==null)
				{
					first = newnode;
				}
				else
				{
					newnode.link = first;
					first = newnode;
				}
			}
		});
		front.setFont(new Font("Constantia", Font.BOLD, 16));
		front.setBounds(379, 93, 162, 29);
		contentPane.add(front);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete rear element
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				else if(first.link==null)
				{
					String message = "Element deleted is "+ first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				}
				else
				{
					temp = first;
					while(temp.link.link!=null){
						temp = temp.link;
					}
					String message = "Element deleted is "+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link = null;
				}
			}
		});
		deleterear.setForeground(new Color(184, 134, 11));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 16));
		deleterear.setBounds(203, 133, 166, 29);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete front element
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				else if(first.link==null)
				{
					String message = "Element deletd is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				}
				else
				{
					String message = "Element deletd is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = first.link;
				}
			}
		});
		deletefront.setForeground(new Color(184, 134, 11));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(203, 173, 166, 29);
		contentPane.add(deletefront);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display an element
				String msg = "";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else if(first.link==null)
				{
					msg = msg+" "+first.data;
					displaybox.setText(msg);
				}
				else{
					temp = first;
					while(temp!=null)
					{
						msg = msg+" "+temp.data;
						temp = temp.link;
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(184, 134, 11));
		display.setFont(new Font("Constantia", Font.BOLD, 16));
		display.setBounds(203, 213, 166, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(255, 69, 0));
		displaybox.setBackground(new Color(255, 255, 0));
		displaybox.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		displaybox.setColumns(10);
		displaybox.setBounds(20, 266, 521, 29);
		contentPane.add(displaybox);
	}

}
