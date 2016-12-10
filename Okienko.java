import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTree;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Okienko {

	private JFrame frmPrzewidywanieWynikwMeczy;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okienko window = new Okienko();
					window.frmPrzewidywanieWynikwMeczy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Okienko() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrzewidywanieWynikwMeczy = new JFrame();
		frmPrzewidywanieWynikwMeczy.setBackground(Color.WHITE);
		frmPrzewidywanieWynikwMeczy.setTitle("Przewidywanie wynik\u00F3w meczyk\u00F3w, hehe");
		frmPrzewidywanieWynikwMeczy.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmPrzewidywanieWynikwMeczy.setBounds(100, 100, 537, 361);
		frmPrzewidywanieWynikwMeczy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrzewidywanieWynikwMeczy.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Legia Warszawa - Real Madryt 3:3");
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(0, 0, 521, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmPrzewidywanieWynikwMeczy.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PSV Eindhoven - Bayern Monachium 1:2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(0, 23, 337, 34);
		frmPrzewidywanieWynikwMeczy.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 233, 310, 34);
		frmPrzewidywanieWynikwMeczy.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(0, 67, 384, 39);
		frmPrzewidywanieWynikwMeczy.getContentPane().add(lblNewLabel_2);
		frmPrzewidywanieWynikwMeczy.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));

		JButton btnNewButton = new JButton("Jenson Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				lblNewLabel_2.setText("Adam");
			}
		});
		btnNewButton.setBounds(330, 239, 134, 23);
		frmPrzewidywanieWynikwMeczy.getContentPane().add(btnNewButton);
		
	
	}
}
