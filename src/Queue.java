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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(104, 11, 257, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER AN ELEMENT :");
		lblEnterQueueSize.setForeground(new Color(112, 128, 144));
		lblEnterQueueSize.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterQueueSize.setBounds(10, 117, 188, 20);
		contentPane.add(lblEnterQueueSize);
		
		sizefield = new JTextField();
		sizefield.setBounds(182, 46, 130, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// create queue 
				size = Integer.valueOf(sizefield.getText());
				q = new int[size];
				String message = "Queue of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		queue.setForeground(new Color(218, 165, 32));
		queue.setFont(new Font("Constantia", Font.BOLD, 16));
		queue.setBounds(182, 77, 242, 29);
		contentPane.add(queue);
		
		JLabel label = new JLabel("ENTER QUEUE SIZE :");
		label.setForeground(new Color(105, 105, 105));
		label.setFont(new Font("Constantia", Font.BOLD, 16));
		label.setBounds(10, 46, 188, 20);
		contentPane.add(label);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(182, 117, 130, 20);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// insert element in queue
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane, "Insert not possible");
				}
				else
				{
					elem = Integer.valueOf(element.getText());
					++r;
					q[r] = elem;
					JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
					element.setText("");
				}
			}
		});
		insert.setForeground(new Color(218, 165, 32));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(320, 116, 104, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// delete element in queue
				if(f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Delete not Possible");
				}
				else
				{
					String message = "Element deleted is"+" "+q[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}
			}
		});
		delete.setForeground(new Color(218, 165, 32));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(182, 156, 104, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display queue
				String msg = "";
				if(f>r)
				{
					JOptionPane.showMessageDialog(contentPane, "Display not Possible");
				}
				else
				{
					for(int i=f; i<=r; i++)
					{
						msg = msg+" "+q[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(218, 165, 32));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(182, 190, 104, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(255, 20, 147));
		displaybox.setBackground(new Color(238, 232, 170));
		displaybox.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		displaybox.setColumns(10);
		displaybox.setBounds(10, 224, 414, 26);
		contentPane.add(displaybox);
	}

}
