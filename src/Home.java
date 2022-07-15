import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 364);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(124, 252, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChooseADatastracture = new JLabel("CHOOSE A DATASTRACTURE");
		lblChooseADatastracture.setForeground(new Color(139, 0, 139));
		lblChooseADatastracture.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lblChooseADatastracture.setBounds(135, 11, 227, 19);
		contentPane.add(lblChooseADatastracture);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE ARRAY WINDOW OPENING CODE HEAR
//				Array a = new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setForeground(new Color(0, 0, 255));
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		array.setBounds(202, 52, 86, 25);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// PLACE STACK WINDOW OPENING CODE HEAR
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(30, 144, 255));
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setBounds(93, 101, 86, 25);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE QUEUE WINDOW OPENING CODE HEAR
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(255, 0, 255));
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		queue.setBounds(293, 101, 86, 25);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE CIRCULAR QUEUE WINDOW OPENING CODE HEAR
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(255, 20, 147));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 12));
		cqueue.setBounds(27, 163, 152, 25);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE SINGLY LINKED LIST WINDOW OPENING CODE HEAR
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(233, 150, 122));
		sll.setFont(new Font("Constantia", Font.BOLD, 12));
		sll.setBounds(293, 163, 166, 25);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// PLACE DOUBLY LINKED LIST WINDOW OPENING CODE HEAR
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(new Color(210, 105, 30));
		dll.setFont(new Font("Constantia", Font.BOLD, 12));
		dll.setBounds(151, 223, 172, 25);
		contentPane.add(dll);
	}
}
