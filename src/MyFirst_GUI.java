import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.JTextField;

public class MyFirst_GUI {

    private JFrame frame;
    public JLabel label_1;
    JTextArea textArea = new JTextArea();
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFirst_GUI window = new MyFirst_GUI();
                    window.frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private Kitok kitok;
    private Meal meal;

    /**
     * Create the application.
     */
    public MyFirst_GUI() {
        kitok = new Kitok("Yellow", this);
        meal = new Meal();
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    
    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 450, 371);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        /**
         * Status bar
         */
//prost jotel skazat 4to tak i dumal 4to nado rebase delat' )))))
       // Name
        
        JLabel label = new JLabel("\u041A\u0438\u0442\u043E\u043A: " + kitok.NAME);
        label.setBounds(0, 0, 441, 25);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.getContentPane().add(label);

        JLabel lblNewLabel = new JLabel("Speed:");
        lblNewLabel.setBounds(0, 26, 70, 25);
        frame.getContentPane().add(lblNewLabel);

        JLabel LabelSpeed = new JLabel(kitok.getSpeed1());
        LabelSpeed.setBounds(71, 26, 370, 25);
        LabelSpeed.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.getContentPane().add(LabelSpeed);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 4 == 0) {
            		kitok.setSpeed(kitok.getSpeed()-1);
            		LabelSpeed.setText(kitok.getSpeed1());
            	}
            }
        });
        
        // Weight

        JLabel lblWeight = new JLabel("Weight");
        lblWeight.setBounds(0, 51, 70, 25);
        frame.getContentPane().add(lblWeight);

        JLabel LabelWeight = new JLabel(kitok.getWeight1());
        LabelWeight.setBounds(71, 51, 370, 25);
        LabelWeight.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.getContentPane().add(LabelWeight);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 3 == 0) {
            		kitok.setWeight(kitok.getWeight()-10);
            		LabelWeight.setText(kitok.getWeight1());
            	}
            }
        });
        
        // Condition

        JLabel lblCondition = new JLabel("Condition");
        lblCondition.setBounds(0, 76, 70, 25);
        frame.getContentPane().add(lblCondition);

        JLabel LabelCondition = new JLabel(kitok.getCondition1());
        LabelCondition.setBounds(71, 76, 370, 25);
        LabelCondition.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.getContentPane().add(LabelCondition);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 3 == 0) {
            		kitok.setCondition(kitok.getCondition()-1);
            		LabelCondition.setText(kitok.getCondition1());
            	}
            }
        });
        
        // Health

        JLabel lblHealth = new JLabel("Health");
        lblHealth.setBounds(0, 101, 70, 25);
        frame.getContentPane().add(lblHealth);

        JLabel LabelHealth = new JLabel(kitok.getHealth1());
        LabelHealth.setBounds(71, 101, 370, 25);
        LabelHealth.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.getContentPane().add(LabelHealth);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 3 == 0) {
            		kitok.setHealth(kitok.getHealth()-1);
            		LabelHealth.setText(kitok.getHealth1());
            	}
            }
        });
        
        // Color

        JLabel lblColor = new JLabel("Color");
        lblColor.setBounds(0, 126, 70, 25);
        frame.getContentPane().add(lblColor);

        JLabel lblColorresult = new JLabel(kitok.getColor1());
        lblColorresult.setBounds(71, 126, 370, 25);
        lblColorresult.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.getContentPane().add(lblColorresult);
        
        // Timer
        
        JLabel label_1 = new JLabel("0");
        label_1.setBounds(395, 5, 46, 14);
        frame.getContentPane().add(label_1);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
                label_1.setText(String.valueOf(counter));
            }
        });
        
        // Average Speed
        
        JLabel lblAvgSpeed = new JLabel("Avg. Speed");
        lblAvgSpeed.setBounds(0, 201, 70, 25);
        frame.getContentPane().add(lblAvgSpeed);
               
        JLabel lblNewLabel_2 = new JLabel();
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_2.setBounds(71, 201, 370, 25);
        frame.getContentPane().add(lblNewLabel_2);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 5 == 0) {
            		double avgSpeed = kitok.getDestination()/counter;
            		lblNewLabel_2.setText(String.valueOf(avgSpeed));
            		System.out.printf("avgSpeed: + %.3f%n ", avgSpeed );
            		System.out.println("Counter: " + counter);
            	}
            }
        });
        
        // Destination
        
        JLabel lblNewLabel_1 = new JLabel("Destination");
        lblNewLabel_1.setBounds(0, 226, 70, 25);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_3 = new JLabel();
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_3.setBounds(71, 226, 370, 25);
        frame.getContentPane().add(lblNewLabel_3);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	//counter.System.out.printf("Destination: + %.3f%n ", kitok.getDestination());
            	//System.out.println("Counter: " + counter);
            	if (counter % 5 == 0) {
            		double dest = kitok.getDestination() + (kitok.getSpeed()/3600d)*(kitok.getCondition()/10d);
            		kitok.setDestination(dest);
            		lblNewLabel_3.setText(String.format("%.3f", kitok.getDestination()));
            	}
            }
        });

        // Buttons
        // Melon Button

        JButton btnNewButton = new JButton("Eat Melon" + " - " + String.valueOf(meal.getMelon()));
        btnNewButton.setBounds(338, 151, 113, 50);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	if (meal.getMelon() > 0) {
            		kitok.eatArbuzik();
            		LabelCondition.setText(kitok.getCondition1());
            		LabelHealth.setText(kitok.getHealth1());
            		LabelSpeed.setText(kitok.getSpeed1());
            		meal.melonIncrease(-1);
            		btnNewButton.setText("Eat Melon" + " - " + String.valueOf(meal.getMelon()));
            		textArea.append("Kitok has eaten Melon. Om-Nom-nom" + "\n");
            	}
            }
        });
        frame.getContentPane().add(btnNewButton);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 3600 == 0) {
            		meal.melonIncrease(1);
            		btnNewButton.setText("Eat Melon" + " - " + String.valueOf(meal.getMelon()));
            	}
            }
        });
        
        // Chips Button

        JButton btnNewButton_1 = new JButton("Eat Chips" + " - " + String.valueOf(meal.getChips()));
        btnNewButton_1.setBounds(225, 151, 113, 50);
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (meal.getChips() > 0) {
            		kitok.eatChipsiki();
            		LabelWeight.setText(kitok.getWeight1());
            		LabelCondition.setText(kitok.getCondition1());
            		meal.chipsIncrease(-1);
            		btnNewButton_1.setText("Eat Chips" + " - " + String.valueOf(meal.getChips()));
            		textArea.append("Kitok has eaten Chips. Om-Nom-nom" + "\n");
            	}
            }
        });
        frame.getContentPane().add(btnNewButton_1);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 3600 == 0) {
            		meal.chipsIncrease(1);
            		btnNewButton_1.setText("Eat Chips" + " - " + String.valueOf(meal.getChips()));
            	}
            }
        });
        
        // Batonchik Button

        JButton btnNewButton_2 = new JButton("Eat Batonchik" + " - " + String.valueOf(meal.getBatonchik()));
        btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_2.setBounds(112, 151, 113, 50);
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (meal.getBatonchik() > 0 ) {
            		kitok.eatBatonchik();
            		LabelWeight.setText(kitok.getWeight1());
            		LabelCondition.setText(kitok.getCondition1());
            		LabelHealth.setText(kitok.getHealth1());
            		meal.batonchikIncrease(-1);
            		btnNewButton_2.setText("Eat Batonchik" + " - " + String.valueOf(meal.getBatonchik()));
            		textArea.append("Kitok has eaten Batonchik. Om-Nom-nom" + "\n");
            	}
            }
        });
        frame.getContentPane().add(btnNewButton_2);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 3600 == 0) {
            		meal.batonchikIncrease(1);
            		btnNewButton_2.setText("Eat Batonchik" + " - " + String.valueOf(meal.getBatonchik()));
            	}
            }
        });
        
        // Planktonchik Button

        JButton btnNewButton_3 = new JButton("Eat Planktonchik" + " - " + String.valueOf(meal.getPlanktonchik()));
        btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
        btnNewButton_3.setBounds(0, 151, 112, 50);
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if (meal.getPlanktonchik() > 0) {
            		kitok.eat();
            		LabelSpeed.setText(kitok.getSpeed1());
            		LabelWeight.setText(kitok.getWeight1());
            		LabelCondition.setText(kitok.getCondition1());
            		LabelHealth.setText(kitok.getHealth1());
            		meal.planktonchikIncrease(-1);;
            		btnNewButton_3.setText("Eat Planktonchik" + " - " + String.valueOf(meal.getPlanktonchik()));
            		textArea.append("Kitok has eaten Planktonchik. Om-Nom-nom" + "\n");
            	}
            }
        });
        frame.getContentPane().add(btnNewButton_3);
        
        kitok.timer.action.registerCounterUpdatedListener(new CounterUpdatedListener() {
            @Override
            public void onCounterUpdated(int counter) {
            	if (counter % 3600 == 0) {
            		meal.planktonchikIncrease(1);
            		btnNewButton_3.setText("Eat Planktonchik" + " - " + String.valueOf(meal.getPlanktonchik()));
            	}
            }
        });
        
        
        textArea.setRows(4);
        textArea.setEditable(false);
        textArea.setBounds(0, 251, 444, 109);
        frame.getContentPane().add(textArea);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(0, 251, 444, 92);
        frame.getContentPane().add(scrollPane);
        
        
    }
}