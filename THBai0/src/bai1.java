import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class bai1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtten;
	private JTextField txtmk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1 frame = new bai1();
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
	public bai1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setBounds(22, 29, 94, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MẬT KHẨU");
		lblNewLabel_1.setBounds(22, 59, 94, 14);
		contentPane.add(lblNewLabel_1);
		
		txtten = new JTextField();
		txtten.setBounds(150, 26, 96, 20);
		contentPane.add(txtten);
		txtten.setColumns(10);
		
		txtmk = new JTextField();
		txtmk.setBounds(150, 56, 96, 20);
		contentPane.add(txtmk);
		txtmk.setColumns(10);
		
		JButton btndn = new JButton("ĐĂNG NHẬP");
		btndn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulydangnhap();
			}
		});
		btndn.setBounds(100, 134, 106, 23);
		contentPane.add(btndn);
	}
	public void xulydangnhap() {
		String ten =txtten.getText().toString();
		String mk =txtmk.getText().toString();
		if(ten.equals("63CNTT") && mk.equals("123")) {
			manhinhchinh f = new manhinhchinh();
			f.setVisible(true);
			this.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null, "Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin đăng nhập.");
		}
	}

}
