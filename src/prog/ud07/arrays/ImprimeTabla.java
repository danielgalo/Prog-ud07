package prog.ud07.arrays;

public class ImprimeTabla {
	
	protected void imprimeTabla(int[][] tabla) {
		System.out.println("------------------------------------------");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(String.format("%2d", tabla[i][j]) + "	"); 
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
	}
}
