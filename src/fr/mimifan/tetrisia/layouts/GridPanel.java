package fr.mimifan.tetrisia.layouts;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import fr.mimifan.tetrisia.enums.FrameVars;

@SuppressWarnings("serial")
public class GridPanel extends JPanel {
	
	public GridPanel() {
		setPreferredSize(new Dimension(FrameVars.NB_COLONNES * FrameVars.TAILLE_BLOC, FrameVars.NB_LIGNES * FrameVars.TAILLE_BLOC));
		setBackground(Color.black);
	}
	
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < FrameVars.NB_LIGNES; i++) {
            for (int j = 0; j < FrameVars.NB_COLONNES; j++) {
                g.drawRect(j * FrameVars.TAILLE_BLOC, i * FrameVars.TAILLE_BLOC, FrameVars.TAILLE_BLOC, FrameVars.TAILLE_BLOC);
            }
        }
    }

}
