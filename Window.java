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
	FillItems filler = new FillItems();
	private JFrame frmSymulacja;
	private JTextField txtKosztSumaryczny;
	private JTextField txtKosztSumaryczny_1;
	private JTextField txtKosztSumaryczny_2;
	private JTextField txtKosztSumaryczny_3;
	private JTextField txtKosztSumaryczny_4;
	private JTextField txtKosztSumaryczny_5;
	private JTextField txtKosztSumaryczny_6;
	private JTextField txtKosztSumaryczny_7;
	private JTextField txtReliability;
	private JTextField txtLiczbaSztuk;
	private JTextField txtLiczbaSztuk_1;
	private JTextField txtLiczbaSztuk_2;
	private JTextField txtLiczbaSztuk_3;
	private JTextField txtLiczbaSztuk_4;
	private JTextField txtLiczbaSztuk_5;
	private JTextField txtLiczbaSztuk_6;
	private JTextField txtLiczbaSztuk_7;
	
	int indexes[] = new int[8];
	private JTextField txtcznaCena;
	private JTextField textField;
	
	
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
			
		
		frmSymulacja = new JFrame();
		frmSymulacja.setTitle("Symulacja");
		frmSymulacja.setBounds(100, 100, 639, 562);
		frmSymulacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSymulacja.getContentPane().setLayout(null);
		
		
		
		//----------------------------------------------------------------------------------
		//pola tekstowe na koszty sumaryczne (liczba przedmiotów * koszt jednostkowy)
		txtKosztSumaryczny = new JTextField();
		txtKosztSumaryczny.setText("Koszt sumaryczny");
		txtKosztSumaryczny.setEditable(false);
		txtKosztSumaryczny.setBounds(477, 36, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny);
		txtKosztSumaryczny.setColumns(10);
		
		txtKosztSumaryczny_1 = new JTextField();
		txtKosztSumaryczny_1.setText("Koszt sumaryczny");
		txtKosztSumaryczny_1.setEditable(false);
		txtKosztSumaryczny_1.setColumns(10);
		txtKosztSumaryczny_1.setBounds(477, 82, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_1);
				
		txtKosztSumaryczny_2 = new JTextField();
		txtKosztSumaryczny_2.setText("Koszt sumaryczny");
		txtKosztSumaryczny_2.setEditable(false);
		txtKosztSumaryczny_2.setColumns(10);
		txtKosztSumaryczny_2.setBounds(477, 128, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_2);
			
		txtKosztSumaryczny_3 = new JTextField();
		txtKosztSumaryczny_3.setText("Koszt sumaryczny");
		txtKosztSumaryczny_3.setEditable(false);
		txtKosztSumaryczny_3.setColumns(10);
		txtKosztSumaryczny_3.setBounds(477, 174, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_3);
				
		txtKosztSumaryczny_4 = new JTextField();
		txtKosztSumaryczny_4.setText("Koszt sumaryczny");
		txtKosztSumaryczny_4.setEditable(false);
		txtKosztSumaryczny_4.setColumns(10);
		txtKosztSumaryczny_4.setBounds(477, 220, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_4);
				
		txtKosztSumaryczny_5 = new JTextField();
		txtKosztSumaryczny_5.setText("Koszt sumaryczny");
		txtKosztSumaryczny_5.setEditable(false);
		txtKosztSumaryczny_5.setColumns(10);
		txtKosztSumaryczny_5.setBounds(477, 266, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_5);
				
		txtKosztSumaryczny_6 = new JTextField();
		txtKosztSumaryczny_6.setText("Koszt sumaryczny");
		txtKosztSumaryczny_6.setEditable(false);
		txtKosztSumaryczny_6.setColumns(10);
		txtKosztSumaryczny_6.setBounds(477, 312, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_6);
				
	/*	txtKosztSumaryczny_7 = new JTextField();
		txtKosztSumaryczny_7.setText("Koszt sumaryczny");
		txtKosztSumaryczny_7.setEditable(false);
		txtKosztSumaryczny_7.setColumns(10);
		txtKosztSumaryczny_7.setBounds(955, 358, 105, 20);
		frmSymulacja.getContentPane().add(txtKosztSumaryczny_7);*/
	
		txtReliability = new JTextField();
		txtReliability.setText("Dost\u0119pno\u015B\u0107");
		txtReliability.setEditable(false);
		txtReliability.setColumns(10);
		txtReliability.setBounds(477, 456, 105, 20);
		frmSymulacja.getContentPane().add(txtReliability);
		
		
		
		
		//----------------------------------------------------------------------------------
		//pola na wymagan¹ liczbê sztuk ka¿dego przedmiotu
					
		txtLiczbaSztuk = new JTextField();
		txtLiczbaSztuk.setText("Liczba sztuk");
		txtLiczbaSztuk.setEditable(false);
		txtLiczbaSztuk.setColumns(10);
		txtLiczbaSztuk.setBounds(378, 36, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk);
				
		txtLiczbaSztuk_1 = new JTextField();
		txtLiczbaSztuk_1.setText("Liczba sztuk");
		txtLiczbaSztuk_1.setEditable(false);
		txtLiczbaSztuk_1.setColumns(10);
		txtLiczbaSztuk_1.setBounds(378, 82, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_1);
				
		txtLiczbaSztuk_2 = new JTextField();
		txtLiczbaSztuk_2.setText("Liczba sztuk");
		txtLiczbaSztuk_2.setEditable(false);
		txtLiczbaSztuk_2.setColumns(10);
		txtLiczbaSztuk_2.setBounds(378, 128, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_2);
				
		txtLiczbaSztuk_3 = new JTextField();
		txtLiczbaSztuk_3.setText("Liczba sztuk");
		txtLiczbaSztuk_3.setEditable(false);
		txtLiczbaSztuk_3.setColumns(10);
		txtLiczbaSztuk_3.setBounds(378, 174, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_3);
				
		txtLiczbaSztuk_4 = new JTextField();
		txtLiczbaSztuk_4.setText("Liczba sztuk");
		txtLiczbaSztuk_4.setEditable(false);
		txtLiczbaSztuk_4.setColumns(10);
		txtLiczbaSztuk_4.setBounds(378, 220, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_4);
				
		txtLiczbaSztuk_5 = new JTextField();
		txtLiczbaSztuk_5.setText("Liczba sztuk");
		txtLiczbaSztuk_5.setEditable(false);
		txtLiczbaSztuk_5.setColumns(10);
		txtLiczbaSztuk_5.setBounds(378, 266, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_5);
				
		txtLiczbaSztuk_6 = new JTextField();
		txtLiczbaSztuk_6.setText("Liczba sztuk");
		txtLiczbaSztuk_6.setEditable(false);
		txtLiczbaSztuk_6.setColumns(10);
		txtLiczbaSztuk_6.setBounds(378, 312, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_6);
				
	/*	txtLiczbaSztuk_7 = new JTextField();
		txtLiczbaSztuk_7.setText("Liczba sztuk");
		txtLiczbaSztuk_7.setEditable(false);
		txtLiczbaSztuk_7.setColumns(10);
		txtLiczbaSztuk_7.setBounds(856, 358, 78, 20);
		frmSymulacja.getContentPane().add(txtLiczbaSztuk_7);*/

		txtcznaCena = new JTextField();
		txtcznaCena.setText("\u0141\u0105czna cena");
		txtcznaCena.setEditable(false);
		txtcznaCena.setColumns(10);
		txtcznaCena.setBounds(477, 425, 105, 20);
		frmSymulacja.getContentPane().add(txtcznaCena);
		
		
		textField = new JTextField();
		textField.setText("Dost\u0119pno\u015B\u0107");
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(328, 481, 86, 20);
		frmSymulacja.getContentPane().add(textField);
		
		//----------------------------------------------------------------------------------
		//labele
		
		JLabel lblDysk = new JLabel("Dysk");
		lblDysk.setBounds(43, 39, 46, 14);
		frmSymulacja.getContentPane().add(lblDysk);
		
		JLabel label = new JLabel("Router");
		label.setBounds(43, 85, 46, 14);
		frmSymulacja.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Switch");
		label_1.setBounds(43, 131, 46, 14);
		frmSymulacja.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Klimatyzacja");
		label_2.setBounds(43, 177, 81, 14);
		frmSymulacja.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Firewall");
		label_3.setBounds(43, 223, 81, 14);
		frmSymulacja.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Agregat");
		label_4.setBounds(43, 269, 81, 14);
		frmSymulacja.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Zasilacz");
		label_5.setBounds(43, 315, 81, 14);
		frmSymulacja.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Czynniki losowe");
		label_6.setBounds(43, 361, 109, 14);
		frmSymulacja.getContentPane().add(label_6);
			
		JLabel lblDostpno = new JLabel("Dost\u0119pno\u015B\u0107");
		lblDostpno.setBounds(43, 459, 195, 14);
		frmSymulacja.getContentPane().add(lblDostpno);
		
		
		
		
		//----------------------------------------------------------------------------------
		//menusy
		
		
		JComboBox comboBox = new JComboBox(filler.getDiscsNames());
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox.getSelectedIndex();
				double price = filler.getPrice(filler.discs, index) * filler.getQuantity(filler.discs, index);
				String text = String.format("%.2f", price);
				txtKosztSumaryczny.setText(text);
				int quantity = filler.getQuantity(filler.discs, index);
				String quant = String.valueOf(quantity);
				txtLiczbaSztuk.setText(quant);
				indexes[0] = index;
				
				String text2 = String.format("%.6f", calcReliability());
				txtReliability.setText(text2);
				
				String total_price = String.format("%.2f", calcPrice());
				txtcznaCena.setText(total_price);
				
				String down_time = String.format("%.6f", calcHoursOfDowntime());
				textField.setText(down_time);
			}
		});
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(178, 39, 190, 20);
		frmSymulacja.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(filler.getRoutersNames());
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox_1.getSelectedIndex();
				double price = filler.getPrice(filler.routers, index) * filler.getQuantity(filler.routers, index);
				String text = String.format("%.2f", price);
				txtKosztSumaryczny_1.setText(text);
				int quantity = filler.getQuantity(filler.routers, index);
				String quant = String.valueOf(quantity);
				txtLiczbaSztuk_1.setText(quant);
				indexes[1] = index;
				
				String text2 = String.format("%.6f", calcReliability());
				txtReliability.setText(text2);
				
				String total_price = String.format("%.2f", calcPrice());
				txtcznaCena.setText(total_price);
				
				String down_time = String.format("%.6f", calcHoursOfDowntime());
				textField.setText(down_time);
			}
		});
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(178, 85, 190, 20);
		frmSymulacja.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(filler.getSwitchesNames());
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox_2.getSelectedIndex();
				double price = filler.getPrice(filler.switches, index) * filler.getQuantity(filler.switches, index);
				String text = String.format("%.2f", price);
				txtKosztSumaryczny_2.setText(text);
				int quantity = filler.getQuantity(filler.switches, index);
				String quant = String.valueOf(quantity);
				txtLiczbaSztuk_2.setText(quant);
				indexes[2] = index;
				
				String text2 = String.format("%.6f", calcReliability());
				txtReliability.setText(text2);
				
				String total_price = String.format("%.2f", calcPrice());
				txtcznaCena.setText(total_price);
				
				String down_time = String.format("%.6f", calcHoursOfDowntime());
				textField.setText(down_time);
			}
		});
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(178, 131, 190, 20);
		frmSymulacja.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(filler.getCoolingSystemsNames());
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox_3.getSelectedIndex();
				double price = filler.getPrice(filler.cooling_systems, index) * filler.getQuantity(filler.cooling_systems, index);
				String text = String.format("%.2f", price);
				txtKosztSumaryczny_3.setText(text);
				int quantity = filler.getQuantity(filler.cooling_systems, index);
				String quant = String.valueOf(quantity);
				txtLiczbaSztuk_3.setText(quant);
				indexes[3] = index;
				
				String text2 = String.format("%.6f", calcReliability());
				txtReliability.setText(text2);
				
				String total_price = String.format("%.2f", calcPrice());
				txtcznaCena.setText(total_price);
				
				String down_time = String.format("%.6f", calcHoursOfDowntime());
				textField.setText(down_time);
			}
		});
		comboBox_3.setSelectedIndex(0);
		comboBox_3.setBounds(178, 177, 190, 20);
		frmSymulacja.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox(filler.getFirewallsNames());
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox_4.getSelectedIndex();
				double price = filler.getPrice(filler.firewalls, index) * filler.getQuantity(filler.firewalls, index);
				String text = String.format("%.2f", price);
				txtKosztSumaryczny_4.setText(text);
				int quantity = filler.getQuantity(filler.firewalls, index);
				String quant = String.valueOf(quantity);
				txtLiczbaSztuk_4.setText(quant);
				indexes[4] = index;
				
				String text2 = String.format("%.6f", calcReliability());
				txtReliability.setText(text2);
				
				String total_price = String.format("%.2f", calcPrice());
				txtcznaCena.setText(total_price);
				
				String down_time = String.format("%.6f", calcHoursOfDowntime());
				textField.setText(down_time);
			}
		});
		comboBox_4.setSelectedIndex(0);
		comboBox_4.setBounds(178, 223, 190, 20);
		frmSymulacja.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox(filler.getPowerSystemsNames());
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox_5.getSelectedIndex();
				double price = filler.getPrice(filler.power_systems, index) * filler.getQuantity(filler.power_systems, index);
				String text = String.format("%.2f", price);
				txtKosztSumaryczny_5.setText(text);
				int quantity = filler.getQuantity(filler.power_systems, index);
				String quant = String.valueOf(quantity);
				txtLiczbaSztuk_5.setText(quant);
				indexes[5] = index;
				
				String text2 = String.format("%.6f", calcReliability());
				txtReliability.setText(text2);
				
				String total_price = String.format("%.2f", calcPrice());
				txtcznaCena.setText(total_price);
				
				String down_time = String.format("%.6f", calcHoursOfDowntime());
				textField.setText(down_time);
			}
		});
		comboBox_5.setSelectedIndex(0);
		comboBox_5.setBounds(178, 269, 190, 20);
		frmSymulacja.getContentPane().add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox(filler.getAggregatesNames());
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox_6.getSelectedIndex();
				double price = filler.getPrice(filler.aggregates, index) * filler.getQuantity(filler.aggregates, index);
				String text = String.format("%.2f", price);
				txtKosztSumaryczny_6.setText(text);
				int quantity = filler.getQuantity(filler.aggregates, index);
				String quant = String.valueOf(quantity);
				txtLiczbaSztuk_6.setText(quant);
				indexes[6] = index;
				
				String text2 = String.format("%.6f", calcReliability());
				txtReliability.setText(text2);
				
				String total_price = String.format("%.2f", calcPrice());
				txtcznaCena.setText(total_price);
				
				String down_time = String.format("%.6f", calcHoursOfDowntime());
				textField.setText(down_time);
			}
		});
		comboBox_6.setSelectedIndex(0);
		comboBox_6.setBounds(178, 315, 190, 20);
		frmSymulacja.getContentPane().add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox(filler.getRandomNames());
		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = comboBox_7.getSelectedIndex();
			/*	double price = filler.getPrice(filler.random, index) * filler.getQuantity(filler.random, index);
				String text = String.format("%.2f", price);
				txtKosztSumaryczny_7.setText(text);
				int quantity = filler.getQuantity(filler.random, index);
				String quant = String.valueOf(quantity);
				txtLiczbaSztuk_7.setText(quant);*/
				
				
				indexes[7] = index;
								
				String text2 = String.format("%.6f", calcReliability());
				txtReliability.setText(text2);
				
				String total_price = String.format("%.2f", calcPrice());
				txtcznaCena.setText(total_price);
				
				String down_time = String.format("%.6f", calcHoursOfDowntime());
				textField.setText(down_time);
			}
		});
		comboBox_7.setSelectedIndex(0);
		comboBox_7.setBounds(178, 361, 190, 20);
		frmSymulacja.getContentPane().add(comboBox_7);
		
		JLabel lblcznaCena = new JLabel("\u0141\u0105czna cena");
		lblcznaCena.setBounds(43, 428, 109, 14);
		frmSymulacja.getContentPane().add(lblcznaCena);
		
		JLabel lblOznaczaToe = new JLabel("Oznacza to, \u017Ce system nie dzia\u0142a\u0142 przez");
		lblOznaczaToe.setBounds(43, 484, 275, 14);
		frmSymulacja.getContentPane().add(lblOznaczaToe);
		
		
		
		JLabel lblWCiguRoku = new JLabel("godzin w ci\u0105gu roku.");
		lblWCiguRoku.setBounds(428, 484, 154, 14);
		frmSymulacja.getContentPane().add(lblWCiguRoku);
		
		
		
		
		
	}
	
	
	double calcPrice()
	{		
		double result = 0.0;
		
		result += filler.getPrice(filler.discs, indexes[0]) * filler.getQuantity(filler.discs, indexes[0]);
		result += filler.getPrice(filler.routers, indexes[1]) * filler.getQuantity(filler.routers, indexes[1]);
		result += filler.getPrice(filler.switches, indexes[2]) * filler.getQuantity(filler.switches, indexes[2]);
		result += filler.getPrice(filler.cooling_systems, indexes[3]) * filler.getQuantity(filler.cooling_systems, indexes[3]);
		result += filler.getPrice(filler.firewalls, indexes[4]) * filler.getQuantity(filler.firewalls, indexes[4]);
		result += filler.getPrice(filler.power_systems, indexes[5]) * filler.getQuantity(filler.power_systems, indexes[5]);
		result += filler.getPrice(filler.aggregates, indexes[6]) * filler.getQuantity(filler.aggregates, indexes[6]);
				
		//System.out.println("Sumaryczna cena: " + result);
		return result;
	}
	
	double calcReliability()
	{
	/*	double nominator = 
				filler.getReliability(filler.discs, indexes[0]) *
				filler.getReliability(filler.routers, indexes[1]) *
				filler.getReliability(filler.switches, indexes[2]) *
				filler.getReliability(filler.cooling_systems, indexes[3]) *
				filler.getReliability(filler.firewalls, indexes[4]) *
				filler.getReliability(filler.power_systems, indexes[5]) *
				filler.getReliability(filler.aggregates, indexes[6]);*/
				
		
		double result = 0.0;
		
		result += filler.getReliability(filler.discs, indexes[0]) * filler.getQuantity(filler.discs, indexes[0]);
		result += filler.getReliability(filler.routers, indexes[1]) * filler.getQuantity(filler.routers, indexes[1]);
		result += filler.getReliability(filler.switches, indexes[2]) * filler.getQuantity(filler.switches, indexes[2]);
	//	result += filler.getReliability(filler.cooling_systems, indexes[3]) * filler.getQuantity(filler.cooling_systems, indexes[3]);
		result += filler.getReliability(filler.firewalls, indexes[4]) * filler.getQuantity(filler.firewalls, indexes[4]);
		result += filler.getReliability(filler.power_systems, indexes[5]) * filler.getQuantity(filler.power_systems, indexes[5]);
		result += filler.getReliability(filler.aggregates, indexes[6]) * filler.getQuantity(filler.aggregates, indexes[6]);
		result += filler.getReliability(filler.random, indexes[7]) * filler.getQuantity(filler.random, indexes[7]);
		
		
		int total_quantity = 0;
		
		total_quantity += filler.getQuantity(filler.discs, indexes[0]);
		total_quantity += filler.getQuantity(filler.routers, indexes[1]);
		total_quantity += filler.getQuantity(filler.switches, indexes[2]);
	//	total_quantity += filler.getQuantity(filler.cooling_systems, indexes[3]);
		total_quantity += filler.getQuantity(filler.firewalls, indexes[4]);
		total_quantity += filler.getQuantity(filler.power_systems, indexes[5]);
		total_quantity += filler.getQuantity(filler.aggregates, indexes[6]);
		total_quantity += filler.getQuantity(filler.random, indexes[7]);
		
		
		result = result / total_quantity;

		
		//System.out.println(result + " - result, total_quantity = " + total_quantity);
		return result;
	}
	
	double calcHoursOfDowntime()
	{
		double result = 0.0;
		
		result = 24 * 365;
		
		result = (1-calcReliability()) * result;
		
		
		return result;
		
	}
	
}
