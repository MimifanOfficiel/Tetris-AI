package fr.mimifan.tetrisia.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

import fr.mimifan.tetrisia.enums.FrameVars;

@SuppressWarnings("serial")
public class Shape extends JPanel {
	
	private String name;
	private Color color;
	private int[][] matrix;
	private Point initialClick;
	
	/**
	 * <h2> Description </h2>
	 * Creates an instance of Shape, which inherits of JPanel to be drawn in the color given, depending on a two dimensions matrix of integers <br><br>
	 * <code> Shape shape = new Shape("T-Block", Color.Yellow, matrix); </code> <br>
	 * @param name The Shape's name (e.g. T-Block)
	 * @param color The color the shape will be
	 * @param matrix a 2 dimension matrix of integers, 0s will not be drew, 1s will be drew in the color given as parameter
	 */
	public Shape(String name, Color color, int[][] matrix) {
		this.name = name;
		this.color = color;
		this.matrix = matrix;
		setPreferredSize(new Dimension(matrix[0].length * FrameVars.TAILLE_BLOC, matrix.length * FrameVars.TAILLE_BLOC));
		setOpaque(false);
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				initialClick = e.getPoint();
				getComponentAt(initialClick);
			}
		});
		addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent e) {
				int x = getX() + e.getX() - initialClick.x;
				int y = getY() + e.getY() - initialClick.y;
				setLocation(x, y);
				System.out.println("X: " + x + " Y: " + y);
			}
		});
		
	}
	
	/**
	 * Getter for the color of your Shape
	 * @return java.awt.Color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Getter for the matrix of your Shape
	 * @return a two dimensions matrix of integers
	 */
	public int[][] getMatrix(){
		return matrix;
	}
	
	/**
	 * Getter for the name of your Shape
	 * @return java.lang.String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Draws the Shape, called when creating a Shape. <br>
	 * Adding your Shape to any Frame or JPanel will draw it.
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int x = col * FrameVars.TAILLE_BLOC;
                int y = row * FrameVars.TAILLE_BLOC;
                int value = matrix[row][col];
                Rectangle2D rectangle = new Rectangle2D.Double(x, y, FrameVars.TAILLE_BLOC, FrameVars.TAILLE_BLOC);
                if (value == 1) {
                    g2d.setColor(Color.BLACK);
                    g2d.setStroke(new BasicStroke(FrameVars.BORDER_SIZE)); 
                    g2d.draw(rectangle);
                    g2d.setColor(color);
                    g2d.fill(rectangle);
                }
            }
        }
	}

}
