import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Greetings {

	private JFrame frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Greetings window = new Greetings();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Greetings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame("Super Kitok");
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnStartGame = new JButton("Start Game");
		btnStartGame.setBounds(0, 0, 217, 262);
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				ColorSelect.selectColor();
			}
		});
		frame2.getContentPane().setLayout(null);
		frame2.getContentPane().add(btnStartGame);
		
		JButton btnNewButton = new JButton("Hall of Fame");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(218, 0, 217, 262);
		frame2.getContentPane().add(btnNewButton);
	}
}
