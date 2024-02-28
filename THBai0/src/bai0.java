import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai0 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai0 frame = new bai0();
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
	public bai0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a");
		lblNewLabel.setBounds(15, 42, 64, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập b");
		lblNewLabel_1.setBounds(15, 67, 64, 21);
		contentPane.add(lblNewLabel_1);
		
		JButton btncong = new JButton("+");
		btncong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulycong();
			}
		});
		btncong.setBounds(31, 136, 64, 23);
		contentPane.add(btncong);
		
		txta = new JTextField();
		txta.setBounds(78, 42, 96, 20);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setBounds(78, 67, 96, 20);
		contentPane.add(txtb);
		txtb.setColumns(10);
		
		JButton btntru = new JButton("-");
		btntru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulytru();
			}
		});
		btntru.setBounds(124, 136, 64, 23);
		contentPane.add(btntru);
		
		JButton btnnhan = new JButton("*");
		btnnhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulynhan();
			}
		});
		btnnhan.setBounds(233, 136, 64, 23);
		contentPane.add(btnnhan);
		
		JButton btnchia = new JButton("/");
		btnchia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulychia();
			}
		});
		btnchia.setBounds(339, 136, 64, 23);
		contentPane.add(btnchia);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả");
		lblNewLabel_2.setBounds(15, 213, 64, 23);
		contentPane.add(lblNewLabel_2);
		
		txtketqua = new JTextField();
		txtketqua.setBounds(78, 214, 96, 20);
		contentPane.add(txtketqua);
		txtketqua.setColumns(10);
	}
	public void xulycong() {
		String a =txta.getText();
		String b =txtb.getText();
		double soa =Double.parseDouble(a);
		double sob =Double.parseDouble(b);
		double ketqua =soa + sob;
		txtketqua.setText(String.valueOf(ketqua));
	}
	public void xulytru() {
		String a =txta.getText();
		String b =txtb.getText();
		double soa =Double.parseDouble(a);
		double sob =Double.parseDouble(b);
		double ketqua =soa - sob;
		txtketqua.setText(String.valueOf(ketqua));
	}
	public void xulynhan() {
		String a =txta.getText();
		String b =txtb.getText();
		double soa =Double.parseDouble(a);
		double sob =Double.parseDouble(b);
		double ketqua =soa * sob;
		txtketqua.setText(String.valueOf(ketqua));
	}
	public void xulychia() {
		String a =txta.getText();
		String b =txtb.getText();
		double soa =Double.parseDouble(a);
		double sob =Double.parseDouble(b);
		double ketqua =soa / sob;
		txtketqua.setText(String.valueOf(ketqua));
	}
}
