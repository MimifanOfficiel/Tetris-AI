package fr.mimifan.tetrisia;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.mimifan.tetrisia.listeners.TetrisKeyListener;

public class Main {
	
	private static int hauteur=700,largeur=400;
	
	public static int score = 0;
	public static JLabel scoreLabel = new JLabel("Score: " + score);
	
	public static JFrame frame = new JFrame("TetrisIA");
	public static JPanel mainPanel = new JPanel(new BorderLayout());
    
	public static void main(String[] args) {
		frame.setSize(largeur,hauteur);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(new TetrisKeyListener());
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		new TetrisPart();
	}
	
	

}
