package prog.ud07.juegos.buscaminas;

public class Tablero {

	private int alto;
	private int ancho;
	private int numeroMinas;
	
	private static final int NUMERO_MINA = -2;
	private static final int NUMERO_TESORO = -1;
	
	int[][] tablero;
	
	public Tablero(int alto, int ancho, int numeroMinas) {
		setAlto(alto);
		setAncho(ancho);
		setNumeroMinas(numeroMinas);
		generaTablero();
	}

	public void setAlto(int alto) {
		if (alto > 0) {
			this.alto = alto;
		} else {
			throw new IllegalArgumentException("El alto del tablero debe ser de una casilla como mínimo.");
		}
		
	}

	public void setAncho(int ancho) {
		if (ancho > 0) {
			this.ancho = ancho;
		} else {
			throw new IllegalArgumentException("El ancho del tablero debe ser de una casilla como mínimo.");
		}
	}

	public void setNumeroMinas(int numeroMinas) {
		if ((numeroMinas > 0) && (numeroMinas < alto * ancho)) {
			this.numeroMinas = numeroMinas;
		} else {
			throw new IllegalArgumentException("Número de minas inválido.");
		}
		
	}
	
	public int[][] generaTablero() {
		tablero = new int[ancho][alto];
		generaMinas(tablero, numeroMinas);
		generaTesoro(tablero);
			
		
		return tablero;
	}
	
	
	public void imprimeTablero() {
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
	
	private static void generaMinas(int[][] tablero, int numeroMinas) {
    for (int i = 0; i < numeroMinas; i++) {
      int fila = generaEnteroAleatorio(0, tablero.length - 1);
      int columna = generaEnteroAleatorio(0, tablero[0].length - 1);
      tablero[fila][columna] = NUMERO_MINA;
    }
	}
	
	private static void generaTesoro(int[][] tablero) {
    int fila = generaEnteroAleatorio(0, tablero.length - 1);
    int columna = generaEnteroAleatorio(0, tablero[0].length - 1);
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
      	tablero[fila][columna] = NUMERO_TESORO;
      }
    }
	}
	
	private static int generaEnteroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
}
