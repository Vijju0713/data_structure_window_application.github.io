import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField insertposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 312);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrayDataStructure = new JLabel("ARRAY DATA STRUCTURE");
		lblArrayDataStructure.setForeground(new Color(0, 0, 255));
		lblArrayDataStructure.setFont(new Font("Algerian", Font.BOLD, 16));
		lblArrayDataStructure.setBounds(151, 0, 265, 32);
		contentPane.add(lblArrayDataStructure);
		
		JLabel lblEnterArrayLength = new JLabel("ENTER ARRAY LENGTH");
		lblEnterArrayLength.setForeground(new Color(255, 0, 0));
		lblEnterArrayLength.setFont(new Font("Constantia", Font.BOLD, 14));
		lblEnterArrayLength.setBounds(76, 53, 179, 18);
		contentPane.add(lblEnterArrayLength);
		
		length = new JTextField();
		length.setBounds(315, 52, 111, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JLabel lblInsertAnInteger = new JLabel("INSERT AN INTEGER ELEMENT");
		lblInsertAnInteger.setForeground(Color.RED);
		lblInsertAnInteger.setFont(new Font("Constantia", Font.BOLD, 12));
		lblInsertAnInteger.setBounds(13, 143, 186, 16);
		contentPane.add(lblInsertAnInteger);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR CREATING ARRAY
// 				   String len = length.getText();
// 				   int l = Integer.valueOf(len);
				int len = Integer.valueOf(length.getText());
				arr = new int[len];
				String message = "Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setForeground(new Color(205, 92, 92));
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setBounds(198, 90, 144, 27);
		contentPane.add(create);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(198, 140, 86, 20);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR INSRTION
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertposition.getText());
				arr[pos] = elem;
				String message = "Element "+elem+" Inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertposition.setText("");
			}
		});
		insert.setForeground(new Color(255, 0, 255));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(410, 139, 111, 22);
		contentPane.add(insert);
		
		deletepos = new JTextField();
		deletepos.setColumns(10);
		deletepos.setBounds(198, 170, 86, 20);
		contentPane.add(deletepos);
		
		JLabel lblDeletePosition = new JLabel("DELETE POSITION");
		lblDeletePosition.setForeground(Color.RED);
		lblDeletePosition.setFont(new Font("Constantia", Font.BOLD, 12));
		lblDeletePosition.setBounds(13, 170, 186, 16);
		contentPane.add(lblDeletePosition);
		
		insertposition = new JTextField();
		insertposition.setColumns(10);
		insertposition.setBounds(356, 140, 50, 20);
		contentPane.add(insertposition);
		
		JLabel lblInsertPosition = new JLabel("POSITION");
		lblInsertPosition.setForeground(Color.RED);
		lblInsertPosition.setFont(new Font("Constantia", Font.BOLD, 12));
		lblInsertPosition.setBounds(290, 143, 60, 16);
		contentPane.add(lblInsertPosition);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DELETION
				int pos = Integer.valueOf(deletepos.getText());
				arr[pos] = 0;
				String message = "Element deleted @ the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deletepos.setText("");
			}
		});
		delete.setForeground(new Color(255, 0, 255));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(294, 169, 111, 22);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DISPLAY
				String msg = "";
				for(int i=0; i<=arr.length-1; i++)
				{
					msg = msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(0, 0, 255));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(198, 201, 135, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		displaybox.setForeground(new Color(0, 0, 255));
		displaybox.setBackground(new Color(127, 255, 212));
		displaybox.setColumns(10);
		displaybox.setBounds(13, 239, 508, 27);
		contentPane.add(displaybox);
	}
}
