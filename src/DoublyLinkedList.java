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

public class DoublyLinkedList extends JFrame {
	
	class Node
	{
		Node prilink;
		int data;
		Node nextlink;
	}

	private JPanel contentPane;
	private Node first;
	private JTextField insertrear;
	private JTextField insertfront;
	private JTextField displaybox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoublyLinkedList = new JLabel("DOUBLY LINKED LIST DATA STRUCTURE");
		lblDoublyLinkedList.setForeground(new Color(255, 69, 0));
		lblDoublyLinkedList.setFont(new Font("Algerian", Font.BOLD, 18));
		lblDoublyLinkedList.setBounds(94, 11, 385, 24);
		contentPane.add(lblDoublyLinkedList);
		
		JLabel label = new JLabel("ENTER THE ELEMENT :");
		label.setForeground(Color.MAGENTA);
		label.setFont(new Font("Constantia", Font.BOLD, 16));
		label.setBounds(10, 46, 207, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ENTER THE ELEMENT :");
		label_1.setForeground(Color.MAGENTA);
		label_1.setFont(new Font("Constantia", Font.BOLD, 16));
		label_1.setBounds(10, 103, 207, 20);
		contentPane.add(label_1);
		
		insertrear = new JTextField();
		insertrear.setFont(new Font("Constantia", Font.BOLD, 15));
		insertrear.setColumns(10);
		insertrear.setBounds(204, 42, 166, 29);
		contentPane.add(insertrear);
		
		insertfront = new JTextField();
		insertfront.setFont(new Font("Constantia", Font.BOLD, 15));
		insertfront.setColumns(10);
		insertfront.setBounds(204, 94, 166, 29);
		contentPane.add(insertfront);
		
		JButton rear = new JButton("INSERT REAR");
		rear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert rear
				Node temp;
				int elem = Integer.valueOf(insertrear.getText());
				JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
				insertrear.setText("");
				Node newnode = new Node();
				newnode.data = elem;
				newnode.prilink = null;
				newnode.nextlink = null;
				
				if(first==null)
				{
					first = newnode;
				}
				else
				{
					temp = first;
					
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					temp.nextlink = newnode;
					newnode.prilink = temp;
				}
			}
		});
		rear.setForeground(new Color(184, 134, 11));
		rear.setFont(new Font("Constantia", Font.BOLD, 16));
		rear.setBounds(374, 42, 162, 29);
		contentPane.add(rear);
		
		JButton front = new JButton("INSERT FRONT");
		front.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert front
				int elem = Integer.valueOf(insertfront.getText());
				JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
				insertfront.setText("");
				Node newnode = new Node();
				
				newnode.data = elem;
				newnode.prilink = null;
				newnode.nextlink = null;
				
				if(first == null)
				{
					first = newnode;
				}
				else{
					newnode.nextlink = first;
					first.prilink = newnode;
					first = newnode;
				}
			}
		});
		front.setForeground(new Color(184, 134, 11));
		front.setFont(new Font("Constantia", Font.BOLD, 16));
		front.setBounds(374, 94, 162, 29);
		contentPane.add(front);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete rear
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				else if(first.nextlink == null)
				{
					String message = "Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				}
				else{
					temp = first;
					
					while(temp.nextlink.nextlink!=null)
					{
						temp = temp.nextlink;
					}
					String message = "Element deleted is "+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink = null;
				}
			}
		});
		deleterear.setForeground(new Color(184, 134, 11));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 16));
		deleterear.setBounds(204, 148, 166, 29);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion not Possible");
				}
				else if(first.nextlink==null)
				{
					String message = "Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = null;
				}
				else
				{
					String message = "Element deleted is "+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first = first.nextlink;
					first.prilink = null;
				}
			}
		});
		deletefront.setForeground(new Color(184, 134, 11));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 16));
		deletefront.setBounds(204, 206, 166, 29);
		contentPane.add(deletefront);
		
		JButton displayf = new JButton("DISPLAY FORWARD");
		displayf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display forward
				String msg = "";
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else if(first.nextlink==null)
				{
					msg = msg+" "+first.data;
					displaybox.setText(msg);
				}
				else{
					temp = first;
					
					while(temp != null){
						msg = msg+" "+temp.data;
						displaybox.setText(msg);
						temp = temp.nextlink;
					}
				}
			}
		});
		displayf.setForeground(new Color(184, 134, 11));
		displayf.setFont(new Font("Constantia", Font.BOLD, 16));
		displayf.setBounds(68, 260, 196, 29);
		contentPane.add(displayf);
		
		JButton displayr = new JButton("DISPLAY REVERSE");
		displayr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display reverse
				String msg = "";
				Node temp;
				if(first == null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else if(first.nextlink == null)
				{
					msg = msg+" "+first.data;
					displaybox.setText(msg);;
				}
				else{
					temp = first;
					
					while(temp.nextlink != null)
					{
						temp = temp.nextlink;
					}
					
					while(temp != null){
						msg = msg+" "+temp.data;
						displaybox.setText(msg);
						temp = temp.prilink;
					}
				}
			}
		});
		displayr.setForeground(new Color(184, 134, 11));
		displayr.setFont(new Font("Constantia", Font.BOLD, 16));
		displayr.setBounds(318, 260, 196, 29);
		contentPane.add(displayr);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(255, 69, 0));
		displaybox.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		displaybox.setColumns(10);
		displaybox.setBackground(Color.YELLOW);
		displaybox.setBounds(15, 313, 521, 29);
		contentPane.add(displaybox);
	}

}
