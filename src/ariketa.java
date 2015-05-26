import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ariketa extends JFrame {

	private JPanel contentPane;
	private JTextField txtTestua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ariketa frame = new ariketa();
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
	public ariketa() {
		setTitle("JFrame ariketa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBidali = new JButton("Bidali");
		btnBidali.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	             String testua = txtTestua.getText().toString();
	             System.out.println(testua);
			}
		});
		
		
		btnBidali.setBounds(35, 194, 137, 51);
		contentPane.add(btnBidali);
		
		JButton btnEzeztatu = new JButton("Ezeztatu");
		btnEzeztatu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTestua.setText("");
			}
		});
		
		
		btnEzeztatu.setBounds(288, 194, 123, 51);
		contentPane.add(btnEzeztatu);
		
		txtTestua = new JTextField();
		txtTestua.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorSelectionForeground"));
		txtTestua.setBackground(UIManager.getColor("Button.shadow"));
		txtTestua.setHorizontalAlignment(SwingConstants.LEFT);
		txtTestua.setToolTipText("Idatzi zure izena");
		txtTestua.setBounds(112, 39, 240, 91);
		contentPane.add(txtTestua);
		txtTestua.setColumns(10);
	}
}
