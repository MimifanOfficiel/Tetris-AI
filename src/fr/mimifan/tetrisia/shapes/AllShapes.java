package fr.mimifan.tetrisia.shapes;

import java.awt.Color;
import java.util.HashMap;

import fr.mimifan.tetrisia.enums.ShapeMatrix;

public class AllShapes {
	
	public static HashMap<String, Shape> shapes = new HashMap<>();
	
	static Shape square = new Shape("Square", Color.yellow, ShapeMatrix.square);
	
	static Shape slay = new Shape("SLay", Color.green, ShapeMatrix.slay);
	static Shape sstand = new Shape("SStand", Color.green, ShapeMatrix.sstand);
	
	static Shape zlay = new Shape("ZLay", Color.red, ShapeMatrix.zlay);
	static Shape zstand = new Shape("ZStand", Color.red, ShapeMatrix.zstand);
	
	static Shape hline = new Shape("HLine", Color.cyan, ShapeMatrix.Hline);
	static Shape vline = new Shape("VLine", Color.cyan, ShapeMatrix.Vline);
	
	static Shape lup = new Shape("LUP", Color.orange, ShapeMatrix.lup);
	static Shape ldown = new Shape("LDOWN", Color.orange, ShapeMatrix.ldown);
	static Shape lleft = new Shape("LLEFT", Color.orange, ShapeMatrix.lleft);
	static Shape lright = new Shape("LRIGHT", Color.orange, ShapeMatrix.lright);
	
	static Shape jup = new Shape("JUP", Color.blue, ShapeMatrix.jup);
	static Shape jdown = new Shape("JDOWN", Color.blue, ShapeMatrix.jdown);
	static Shape jleft = new Shape("JLEFT", Color.blue, ShapeMatrix.jleft);
	static Shape jright = new Shape("JRIGHT", Color.blue, ShapeMatrix.jright);
	
	
	public static HashMap<String, Shape> getShapes(){
		return shapes;
	}
	
	public static void insertShapes() {
		shapes.put("Square", square);
		shapes.put("SLay", slay);
		//shapes.put("SStand", sstand);
		shapes.put("ZLay", zlay);
		//shapes.put("ZStand", zstand);
		shapes.put("HLine", hline);
		//shapes.put("VLine", vline);
		//shapes.put("LUP", lup);
		//shapes.put("LDOWN", ldown);
		shapes.put("LLEFT", lleft);
		//shapes.put("LRIGHT", lright);
		//shapes.put("JUP", jup);
		//shapes.put("JDOWN", jdown);
		//shapes.put("JLEFT", jleft);
		shapes.put("JRIGHT", jright);
		
	}
	
}
