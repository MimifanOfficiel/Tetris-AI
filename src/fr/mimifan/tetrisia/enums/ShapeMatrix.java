package fr.mimifan.tetrisia.enums;

public class ShapeMatrix {
	
	/* Matrice pour le block carré */
	public static int[][] square = {
            {1, 1},
            {1, 1}
    };
	
	/* Matrices pour les blocks T */
	public static int[][] Tup = {
			{0, 1, 0},
            {1, 1, 1}
	};
	
	public static int[][] Tdown = {
			{1, 1, 1},
			{0, 1, 0}
	};
	
	public static int[][] Tleft = {
			{0, 1},
			{1, 1},
			{0, 1}
	};
	
	public static int[][] Tright = {
			{1, 0},
			{1, 1},
			{1, 0}
	};
	
	
	
	/* Matrices pour les blocks L */
	public static int[][] lup = {
	        {1, 0},
            {1, 0},
            {1, 1}
    };
	
	public static int[][] ldown = {
            {1, 1},
            {0, 1},
            {0, 1}
    };
	
	public static int[][] lleft = {
            {0, 0, 1},
            {1, 1, 1},
    };
	
	public static int[][] lright = {
            {1, 1, 1},
            {1, 0, 0}
    };
	
	
	
	/* Matrices pour les blocks J */
	public static int[][] jup = {
            {0, 1},
            {0, 1},
            {1, 1}
    };
	
	public static int[][] jdown = {
            {1, 1},
            {1, 0},
            {1, 0}
    };
	
	public static int[][] jleft = {
            {1, 1, 1},
            {0, 0, 1}
    };
	
	public static int[][] jright = {
            {1, 0, 0},
            {1, 1, 1}
    };
	
	
	/* Matrices pour les blocks S */
	public static int[][] slay = {
            {0, 1, 1},
            {1, 1, 0},
    };
	
	public static int[][] sstand = {
            {1, 0},
            {1, 1},
            {0, 1}
    };
	
	
	
	/* Matrices pour les blocks Z */
	public static int[][] zstand  = {
            {0, 1},
            {1, 1},
            {1, 0}
    };
	
	public static int[][] zlay  = {
            {1, 1, 0},
            {0, 1, 1},
    };
	
	
	
	/* Matrices pour les blocks I */
	public static int[][] Hline = {
            {1, 1, 1, 1}
    };
	
	public static int[][] Vline = {
            {1},
            {1},
            {1},
            {1}
    };
	
}
