import java.io.PrintWriter;
import java.util.Random;

public class Line {
	private static final int XRES = 500;
	private static final int YRES = 500;
	private static int[][][] p = new int[XRES][YRES][3];
	
	private static void plotLine(int x0, int y0, int x1, int y1) {
		final double A = m; // Δy
		final double B = 1; // -Δx
		final double d = 2*A + B;
	}
	
	private static void plot(int x, int y, int[] rgb) {
		System.arraycopy(rgb, 0, p[x][y], 0, 3);
	}
	public static void main(String[] args) {
		Random rand = new Random();
		int[][][] p = new int[XRES][YRES][3];
		int num = 5; // how many lines to draw
		double m; // random slope in interval [-5, 5]
		
		while(num > 0) {
			m = 10*rand.nextDouble() - 5;
			plotLine(x, y, m);
			
			final double A = m; // Δy
			final double B = 1; // -Δx
			final double D = 2A + B;
			while(x <= 
			num--;
		}
		
		PrintWriter w = null;
		try {
			w = new PrintWriter("line.ppm", "UTF-8");
		}
		catch(Exception e) {
			System.out.println("Exception caught:\n" + e);
		}
		
		w.println("P3");
		w.println(XRES + " " + YRES + " 255");
		
		for(int i = 0; i < 500; i++) {
			for(int j = 0; j < 500; j++) {
				for(int k = 0; k < 3; k++) {
					w.println(p[i][j][k] + " ");
				}
			}
			w.println();
		}
		
		w.close();
	}
}
