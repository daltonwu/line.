import java.io.PrintWriter;
import java.util.Random;

public class Line {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[][][] p = new int[500][500][3];
		
		PrintWriter w = null;
		try {
			w = new PrintWriter("line.ppm", "UTF-8");
		}
		catch(Exception e) {
			System.out.println("Exception caught:\n" + e);
		}
		
		w.println("P3");
		w.println("500 500 255");
		
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
