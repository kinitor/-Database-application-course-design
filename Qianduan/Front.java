package keshe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Front {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public Front() {

		initialize();
		frame.setVisible(true);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4E66\u5E97\u9500\u552E\u7BA1\u7406\u7CFB\u7EDF");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JButton button = new JButton("\u8FDB\u8D27");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(200, 160, 100, 60);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("\u7528\u6237\u6CE8\u518C");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Gukezhuce();
				frame.setVisible(false);
			}
		});
		button_1.setBounds(200, 270, 100, 60);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("\u7528\u6237\u5347\u7EA7");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new ShengJi();
				frame.setVisible(false);
			}
		});

		button_2.setBounds(500, 270, 100, 60);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("\u552E\u4E66");
		button_3.setBounds(500, 160, 100, 60);
		frame.getContentPane().add(button_3);

		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Chaxun();
				frame.setVisible(false);
			}
		});

		btnNewButton.setBounds(350, 380, 100, 60);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("\u4E66\u5E97\u9500\u552E\u7BA1\u7406\u7CFB\u7EDF");
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(176, 38, 444, 90);
		frame.getContentPane().add(lblNewLabel);

	}
}
