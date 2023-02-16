package prog.ud07.juegos.buscaminas;

import java.util.Scanner;

public class BuscaMinasApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alto = 0;
		int ancho = 0;
		int numeroMinas = 0;
		int cordHoriz = 1;
		int cordVert = 1;
		String continuar = "";
		final String PALABRA_CONTINUAR = "Continuar";
		
		
		do {
			System.out.println("---BUSCA MINAS---");
			System.out.print("Introduce el alto del tablero: ");
			alto = Integer.parseInt(sc.next());
			System.out.print("Introduce el ancho del tablero: ");
			ancho = Integer.parseInt(sc.next());
			System.out.print("Introduce el número de minas: ");
			numeroMinas = Integer.parseInt(sc.next());
			Tablero tab1 = new Tablero(ancho, alto, numeroMinas);
			System.out.println("Tablero generado!");
			System.out.println("----------------------------------");
			tab1.imprimeTablero();
			
			do {
				System.out.print("Introduce una coordenada horizontal: ");
				cordHoriz = Integer.parseInt(sc.next());
				System.out.print("Introduce una coordenada vertical: ");
				cordVert = Integer.parseInt(sc.next());

				cordHoriz -= 1;
				cordVert -= 1;

				switch (tab1.generaTablero()[cordHoriz][cordVert]) {

				case -2:
					System.out.println("Has perdido.");
					break;
				case 0:
					System.out.println("Casilla Vacía, sigue intentándolo.");
					break;
				case -1:
					System.out.println("Tesoro encontrado! Has ganado.");
					break;
				default:
					System.out.println("?");
				}
			} while (condicionSalidaMenu(cordHoriz, cordVert, tab1));
			
			System.out.print("¿Quieres Volver a jugar? ('Continuar' para seguir, cualquier otra cosa para terminar): ");
			continuar = sc.next();
			
		} while (continuar.equalsIgnoreCase(PALABRA_CONTINUAR));
		sc.close();
	}
	
	private static boolean condicionSalidaMenu(int x, int y, Tablero tab) {
		if ((tab.generaTablero()[x][y] == 0) || (tab.generaTablero()[x][y] != -2) || (tab.generaTablero()[x][y] != -1)){
			return true;
		} else {
			return false;
		}
	}
}
