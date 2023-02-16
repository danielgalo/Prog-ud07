package prog.ud07.arrays;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		int tabla[][] = new int[3][6];
		
		tabla[0][0] = 35;
		tabla[0][2] = 64;
		tabla[0][3] = 69;
		tabla[0][5] = 93;
		
		tabla[1][1] = 12;
		tabla[1][4] = 92;
		tabla[1][5] = 97;
		
		tabla[2][0] = 13;
		tabla[2][2] = 33;
		tabla[2][4] = 52;
		
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
