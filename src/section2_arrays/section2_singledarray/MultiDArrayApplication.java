package section2_arrays.section2_singledarray;

public class MultiDArrayApplication {

	public static void main(String[] args) {
		
		// 2D Array
		int[][] x = new int[3][];
		x[0] = new int[3];
		x[1] = new int[1];
		x[2] = new int[2];
		
		// 3D Array
		int[][][] p = new int[2][][];
		
		p[0] = new int[3][];
		p[1] = new int[3][];
		
		p[0][0] = new int[3];
		p[0][1] = new int[1];
		p[0][2] = new int[2];
		
		p[1][0] = new int[3];
		p[1][1] = new int[1];
		p[1][2] = new int[2];
		
		p[0][0][0] = 3;
		
	}

}
