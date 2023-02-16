package prog.ud07.arrays;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[][] = new int[4][5];
		int numero = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				try {
					System.out.print("Introduce el número de la casilla (" + i + ", " + j + "): ");
					numero = Integer.parseInt(sc.next());
					tabla[i][j] = numero;
				} catch (NumberFormatException e) {
					System.err.println("Error, has introducido una cadena.");
				}
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

}
