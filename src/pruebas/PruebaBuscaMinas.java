package pruebas;

import java.util.Scanner;

public class PruebaBuscaMinas {

	private static final int NUMERO_TESORO = -3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int NUMERO_MINA = -2;
		int numeroMinas = 15;
		int ancho = 5;
		int alto = 5;
		int[][] tablero = new int[ancho][alto];
		
		
    for (int i = 0; i < numeroMinas; i++) {
      int fila = generaEnteroAleatorio(1, tablero.length - 1);
      int columna = generaEnteroAleatorio(1, tablero.length - 1);
      tablero[fila][columna] = NUMERO_MINA;
    }
    
    int fila = generaEnteroAleatorio(0, tablero.length - 1);
    int columna = generaEnteroAleatorio(0, tablero.length - 1);
    
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
      	tablero[fila][columna] = NUMERO_TESORO;
      }
    }
    
    int x = 1;
    int y = 1;
    
    
    // (la 'x' y la 'y' estan al revés)
    do {
      System.out.println("Introduce las coordenadas del tesoro!!!!!!!!!!: ");
      System.out.print("Coordenada y: ");
      y = Integer.parseInt(sc.next());
      System.out.print("Coordenada x: ");
      x = Integer.parseInt(sc.next());

      
      x -= 1;
      y-= 1;
      
      if (tablero[x][y] == -3) {
      	System.out.println("Has ganado!!!!!!!!!!!!");
      } else if (tablero[x][y] == -2) {
      	System.out.println("Has perdido :(((((");
      } else if (tablero[x][y] == 0) {
      	System.out.println("Aqui no hay na");
      }
    } while ((tablero[x][y] == -3) || (tablero[x][y] == 0));
    
    System.out.println("-----------------------");
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
          System.out.print(String.format("%2d", tablero[i][j]));
          System.out.print("   ");
      }
      System.out.println();
    }
    System.out.println("-----------------------");

	}

	private static int generaEnteroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
}
