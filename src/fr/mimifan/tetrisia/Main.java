package fr.mimifan.tetrisia;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.mimifan.tetrisia.enums.FrameVars;
import fr.mimifan.tetrisia.listeners.TetrisKeyListener;

public class Main {
	
	
	public static int score = 0;
	public static JLabel scoreLabel = new JLabel("Score: " + score);
	
	public static JFrame frame = new JFrame("TetrisAI");
	public static JPanel mainPanel = new JPanel(new BorderLayout());
    
	/**
	 * Creates the main JFrame which will contain everything.
	 * @author Mimifan
	 * @return void, it starts the application without returning anything.
	 */
	public static void main(String[] args) {
		frame.setSize(FrameVars.frameWidth,FrameVars.frameHeight); ///< Changes Frame's dimensions to width/height with values in FrameVars .
		frame.setResizable(false); ///< Makes the user unable to resize app while it's running.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ///< Makes the app to stop when clicking on the close button
		frame.setLocationRelativeTo(null); ///< Centers the app on the screen
		frame.addKeyListener(new TetrisKeyListener()); ///< The app will now listen to keyboard use
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER); ///< Adds mainPanel in frame's contentPane
		frame.pack(); ///< Packs the frame
		frame.setVisible(true); ///< Sets the frame visible
		new TetrisPart();
	}
	
	

}
