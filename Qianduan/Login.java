package keshe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4E66\u5E97\u9500\u552E\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel label = new JLabel("\u7BA1\u7406\u5458");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(65, 48, 72, 38);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(65, 99, 72, 31);
		frame.getContentPane().add(label_1);
		
		JButton button = new JButton("\u91CD\u7F6E");
		button.setBounds(80, 169, 113, 51);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u767B\u5F55");
		button_1.setBounds(240, 169, 113, 51);
		frame.getContentPane().add(button_1);
		
		textField = new JTextField();
		textField.setBounds(172, 55, 181, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(172, 102, 181, 24);
		frame.getContentPane().add(passwordField);
		
		JLabel label_2 = new JLabel("\u767B\u5F55");
		label_2.setFont(new Font("宋体", Font.BOLD, 20));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(151, 13, 126, 29);
		frame.getContentPane().add(label_2);
	}
}
