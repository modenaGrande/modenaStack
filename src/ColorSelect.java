import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorSelect {

	private JFrame frame3;
	private String colorSet;
	
	public void setColorSet(String colorSet) {
		this.colorSet = colorSet;
	}
	
	public String getColorSet() {
		return colorSet;
	}

	/**
	 * Launch the application.
	 */
	public static void selectColor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorSelect window = new ColorSelect();
					window.frame3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ColorSelect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.setForeground(Color.green);
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				MyFirst_GUI.start();
			}
		});
		btnGreen.setBounds(0, 0, 434, 65);
		frame3.getContentPane().add(btnGreen);
		setColorSet("green");
		
		JButton btnNewButton = new JButton("Black");
		btnNewButton.setForeground(Color.black);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				MyFirst_GUI.start();
			}
		});
		btnNewButton.setBounds(0, 66, 434, 66);
		frame3.getContentPane().add(btnNewButton);
		setColorSet("black");
		
		JButton btnYellow = new JButton("Blue");
		btnYellow.setForeground(Color.blue);
		btnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				MyFirst_GUI.start();
			}
		});
		btnYellow.setBounds(0, 132, 434, 66);
		frame3.getContentPane().add(btnYellow);
		setColorSet("blue");
		
		JButton btnNewButton_1 = new JButton("Red");
		btnNewButton_1.setForeground(Color.red);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				MyFirst_GUI.start();
			}
		});
		btnNewButton_1.setBounds(0, 197, 434, 65);
		frame3.getContentPane().add(btnNewButton_1);
		setColorSet("red");
	}

}
