import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 305);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCircularQueueData = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblCircularQueueData.setForeground(new Color(165, 42, 42));
		lblCircularQueueData.setFont(new Font("Algerian", Font.BOLD, 18));
		lblCircularQueueData.setBounds(62, 11, 357, 24);
		contentPane.add(lblCircularQueueData);
		
		JLabel label_1 = new JLabel("ENTER QUEUE SIZE :");
		label_1.setForeground(SystemColor.controlDkShadow);
		label_1.setFont(new Font("Constantia", Font.BOLD, 16));
		label_1.setBounds(10, 59, 188, 20);
		contentPane.add(label_1);
		
		sizefield = new JTextField();
		sizefield.setColumns(10);
		sizefield.setBounds(197, 59, 171, 20);
		contentPane.add(sizefield);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create Cqueue
				size = Integer.valueOf(sizefield.getText());
				cq = new int[size];
				String message = "Circular Queue of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setForeground(new Color(218, 165, 32));
		queue.setFont(new Font("Constantia", Font.BOLD, 16));
		queue.setBounds(197, 90, 171, 29);
		contentPane.add(queue);
		
		JLabel label_2 = new JLabel("ENTER AN ELEMENT :");
		label_2.setForeground(new Color(112, 128, 144));
		label_2.setFont(new Font("Constantia", Font.BOLD, 16));
		label_2.setBounds(10, 130, 188, 20);
		contentPane.add(label_2);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(197, 130, 130, 20);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert an element
				int elem;
				if(count == size)
				{
					JOptionPane.showMessageDialog(contentPane, "Insert not Possible");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					r = (r+1)%size;
					cq[r] = elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(218, 165, 32));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(337, 129, 104, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete an element
				if(count == 0)
				{
					JOptionPane.showMessageDialog(contentPane, "Delet not Possible");
				}
				else
				{
					String message = "Element deleted is"+" "+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f = (f+1)%size;
					count--;
				}
			}
		});
		delete.setForeground(new Color(218, 165, 32));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(197, 161, 104, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display Cqueue
				String msg = "";
				int f1 = f;
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else
				{
					for(int i=1; i<=count; i++)
					{
						msg = msg+" "+cq[f1];
						f1 = (f1+1)%size;
					}
					displaybox.setText(msg);				}
			}
		});
		display.setForeground(new Color(218, 165, 32));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(197, 195, 104, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(255, 20, 147));
		displaybox.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(238, 232, 170));
		displaybox.setBounds(10, 229, 431, 26);
		contentPane.add(displaybox);
	}

}
