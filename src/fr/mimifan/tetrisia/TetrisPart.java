package fr.mimifan.tetrisia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import fr.mimifan.tetrisia.layouts.GridPanel;
import fr.mimifan.tetrisia.shapes.AllShapes;
import fr.mimifan.tetrisia.shapes.Shape;

@SuppressWarnings("serial")
public class TetrisPart extends JPanel implements ActionListener {

	private static Timer timer;
	private static Random random = new Random();
    
    private static boolean isStarted = false;
    
    private static ArrayList<Shape> nextPieces = new ArrayList<Shape>();
    
    private static Shape currentPiece = null;
	
	private static TetrisPart instance;
	
	public TetrisPart() {
		instance = this;
		AllShapes.insertShapes();
		start();
	}
	
	private static void start() {
		isStarted = true;
		
		timer = new Timer(400, instance);
        timer.start();
        Main.mainPanel.add(gamePanel(), BorderLayout.WEST);
        Main.mainPanel.add(sidePanel(), BorderLayout.EAST);
        Main.frame.pack();
	}
	
	private static Container gamePanel() {
		JPanel gameGrid = new GridPanel();
		currentPiece = newPiece();		
		currentPiece.setLocation(75, -30);
		gameGrid.add(currentPiece);
		return gameGrid;
	}
	
	private static Container sidePanel() {
		JPanel nextShapes = new JPanel();
		nextShapes.setBackground(Color.LIGHT_GRAY);
		nextShapes.setSize(250, 500);
		nextShapes.setLayout(new BoxLayout(nextShapes, BoxLayout.Y_AXIS));
		nextShapes.add(new JLabel("-Incoming Pieces-"));	
		nextShapes.add(Main.scoreLabel);
		for(int i=0; i<3;i++) {
			Shape next = newPiece();
			nextShapes.add(next);
		}
		return nextShapes;
	}
	
	private static Shape newPiece() {
		Object[] shapes = AllShapes.getShapes().keySet().toArray();
		Shape nS = AllShapes.getShapes().get(shapes[random.nextInt(shapes.length)]);
		return new Shape(nS.getName(), nS.getColor(), nS.getMatrix());
		
	}
	
	/*private static void pause() {
		if(!isPaused) isPaused = true; 
	}*/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}