package prog.ud07.arrays;

public class TablaNumerosAleatorios {
	
	public static void main(String[] args) {

		int tabla[][] = new int[4][5];
		int maximo = 999;
		int minimo = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = generaEnteroAleatorio(minimo, maximo);
			}
		}
		
		System.out.println("------------------------------------------");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(String.format("%2d", tabla[i][j]) + "	"); 
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
	}
	
	private static int generaEnteroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
}
