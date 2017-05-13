import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frmSymulacja;
	private JTextField txtKosztSumaryczny;
	private JTextField txtKosztSumaryczny_1;
	private JTextField txtKosztSumaryczny_2;
	private JTextField txtKosztSumaryczny_3;
	private JTextField txtKosztSumaryczny_4;
	private JTextField txtKosztSumaryczny_5;
	private JTextField txtKosztSumaryczny_6;
	private JTextField txtKosztSumaryczny_7;
	private JTextField txtLiczbaSztuk;
	private JTextField txtLiczbaSztuk_1;
	private JTextField txtLiczbaSztuk_2;
	private JTextField txtLiczbaSztuk_3;
	private JTextField txtLiczbaSztuk_4;
	private JTextField txtLiczbaSztuk_5;
	private JTextField txtLiczbaSztuk_6;
	private JTextField txtLiczbaSztuk_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmSymulacja.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		
		
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FillItems filler = new FillItems();
		
		
		frmSymulacja = new JFrame();
		frmSymulacja.setTitle("Symulacja");
		frmSymulacja.setBounds(100, 100, 1100, 562);
		frmSymulacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSymulacja.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(-183, 11, 653, 465);
		frmSymulacja.getContentPane().add(panel);
		
		
		
		//----------------------------------------------------------------------------------
		//labele
		
		JLabel lblDysk = new JLabel("Dysk");
		lblDysk.setBounds(521, 39, 46, 14);
		frmSymulacja.getContentPane().add(lblDysk);
		
		JLabel label = new JLabel("Router");
		label.setBounds(521, 85, 46, 14);
		frmSymulacja.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Switch");
		label_1.setBounds(521, 131, 46, 14);
		frmSymulacja.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Klimatyzacja");
		label_2.setBounds(521, 177, 81, 14);
		frmSymulacja.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Firewall");
		label_3.setBounds(521, 223, 81, 14);
		frmSymulacja.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Agregat");
		label_4.setBounds(521, 269, 81, 14);
		frmSymulacja.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Zasilacz");
		label_5.setBounds(521, 315, 81, 14);
		frmSymulacja.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Czynniki losowe");
		label_6.setBounds(521, 361, 109, 14);
		frmSymulacja.getContentPane().add(label_6);
				
		//----------------------------------------------------------------------------------
		//menusy
		
		//!!!!! odkomentowaæ linijki comboBox_1.setSelectedIndex(0); jak ju¿ dodamy te rzeczy w klasie FillItems (bo inaczej bêd¹ wskazywaæ na NULL)
		
		JComboBox comboBox = new JComboBox(filler.getDiscsNames());
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(656, 39, 130, 20);
		frmSymulacja.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(filler.getRoutersNames());
//		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(656, 85, 130, 20);
		frmSymulacja.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(filler.getSwitchesNames());
//		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(656, 131, 130, 20);
		frmSymulacja.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(filler.getCoolingSystemsNames());
//		comboBox_3.setSelectedIndex(0);
		comboBox_3.setBounds(656, 177, 130, 20);
		frmSymulacja.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(filler.getFirewallsNames());
//		comboBox_4.setSelectedIndex(0);
		comboBox_4.setBounds(656, 223, 130, 20);
		frmSymulacja.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox(filler.getPowerSystemsNames());
//		comboBox_5.setSelectedIndex(0);
		comboBox_5.setBounds(656, 269, 130, 20);
		frmSymulacja.getContentPane().add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox(filler.getAggregatesNames());
//		comboBox_6.setSelectedIndex(0);
		comboBox_6.setBounds(656, 315, 130, 20);
		frmSymulacja.getContentPane().add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox(filler.getRandomNames());
//		comboBox_7.setSelectedIndex(0);
		comboBox_7.setBounds(656, 361, 130, 20);
		frmSymulacja.getContentPane().add(comboBox_7);
		
		
		//----------------------------------------------------------------------------------
		//pola tekstowe na koszty sumaryczne (liczba przedmiotów * koszt jednostkowy)
		
		txtKosztSumaryczny = new JTextField();
		txtKosztSumaryczny.setText("Koszt sumaryczny");
		txtKosztSumaryczny.setEditable(false);
		txtKosztSumaryczny.setBounds(955, 36, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny);
		txtKosztSumaryczny.setColumns(10);
		
		txtKosztSumaryczny_1 = new JTextField();
		txtKosztSumaryczny_1.setText("Koszt sumaryczny");
		txtKosztSumaryczny_1.setEditable(false);
		txtKosztSumaryczny_1.setColumns(10);
		txtKosztSumaryczny_1.setBounds(955, 82, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_1);
		
		txtKosztSumaryczny_2 = new JTextField();
		txtKosztSumaryczny_2.setText("Koszt sumaryczny");
		txtKosztSumaryczny_2.setEditable(false);
		txtKosztSumaryczny_2.setColumns(10);
		txtKosztSumaryczny_2.setBounds(955, 128, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_2);
		
		txtKosztSumaryczny_3 = new JTextField();
		txtKosztSumaryczny_3.setText("Koszt sumaryczny");
		txtKosztSumaryczny_3.setEditable(false);
		txtKosztSumaryczny_3.setColumns(10);
		txtKosztSumaryczny_3.setBounds(955, 174, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_3);
		
		txtKosztSumaryczny_4 = new JTextField();
		txtKosztSumaryczny_4.setText("Koszt sumaryczny");
		txtKosztSumaryczny_4.setEditable(false);
		txtKosztSumaryczny_4.setColumns(10);
		txtKosztSumaryczny_4.setBounds(955, 220, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_4);
		
		txtKosztSumaryczny_5 = new JTextField();
		txtKosztSumaryczny_5.setText("Koszt sumaryczny");
		txtKosztSumaryczny_5.setEditable(false);
		txtKosztSumaryczny_5.setColumns(10);
		txtKosztSumaryczny_5.setBounds(955, 266, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_5);
		
		txtKosztSumaryczny_6 = new JTextField();
		txtKosztSumaryczny_6.setText("Koszt sumaryczny");
		txtKosztSumaryczny_6.setEditable(false);
		txtKosztSumaryczny_6.setColumns(10);
		txtKosztSumaryczny_6.setBounds(955, 312, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_6);
		
		txtKosztSumaryczny_7 = new JTextField();
		txtKosztSumaryczny_7.setText("Koszt sumaryczny");
		txtKosztSumaryczny_7.setEditable(false);
		txtKosztSumaryczny_7.setColumns(10);
		txtKosztSumaryczny_7.setBounds(955, 358, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_7);
		
		//----------------------------------------------------------------------------------
		//pola na wymagan¹ liczbê sztuk ka¿dego przedmiotu
			
		txtLiczbaSztuk = new JTextField();
		txtLiczbaSztuk.setText("Liczba sztuk");
		txtLiczbaSztuk.setEditable(false);
		txtLiczbaSztuk.setColumns(10);
		txtLiczbaSztuk.setBounds(856, 36, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk);
		
		txtLiczbaSztuk_1 = new JTextField();
		txtLiczbaSztuk_1.setText("Liczba sztuk");
		txtLiczbaSztuk_1.setEditable(false);
		txtLiczbaSztuk_1.setColumns(10);
		txtLiczbaSztuk_1.setBounds(856, 82, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_1);
		
		txtLiczbaSztuk_2 = new JTextField();
		txtLiczbaSztuk_2.setText("Liczba sztuk");
		txtLiczbaSztuk_2.setEditable(false);
		txtLiczbaSztuk_2.setColumns(10);
		txtLiczbaSztuk_2.setBounds(856, 128, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_2);
		
		txtLiczbaSztuk_3 = new JTextField();
		txtLiczbaSztuk_3.setText("Liczba sztuk");
		txtLiczbaSztuk_3.setEditable(false);
		txtLiczbaSztuk_3.setColumns(10);
		txtLiczbaSztuk_3.setBounds(856, 174, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_3);
		
		txtLiczbaSztuk_4 = new JTextField();
		txtLiczbaSztuk_4.setText("Liczba sztuk");
		txtLiczbaSztuk_4.setEditable(false);
		txtLiczbaSztuk_4.setColumns(10);
		txtLiczbaSztuk_4.setBounds(856, 220, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_4);
		
		txtLiczbaSztuk_5 = new JTextField();
		txtLiczbaSztuk_5.setText("Liczba sztuk");
		txtLiczbaSztuk_5.setEditable(false);
		txtLiczbaSztuk_5.setColumns(10);
		txtLiczbaSztuk_5.setBounds(856, 266, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_5);
		
		txtLiczbaSztuk_6 = new JTextField();
		txtLiczbaSztuk_6.setText("Liczba sztuk");
		txtLiczbaSztuk_6.setEditable(false);
		txtLiczbaSztuk_6.setColumns(10);
		txtLiczbaSztuk_6.setBounds(856, 312, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_6);
		
		txtLiczbaSztuk_7 = new JTextField();
		txtLiczbaSztuk_7.setText("Liczba sztuk");
		txtLiczbaSztuk_7.setEditable(false);
		txtLiczbaSztuk_7.setColumns(10);
		txtLiczbaSztuk_7.setBounds(856, 358, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_7);

	}
}
