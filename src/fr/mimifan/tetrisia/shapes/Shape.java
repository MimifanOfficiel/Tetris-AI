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
	
	public Color getColor() {
		return color;
	}
	
	public int[][] getMatrix(){
		return matrix;
	}
	public String getName() {
		return name;
	}
	
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
