package prog.ud07.ordenacion.ej01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenaPalabras {

	public static void main(String[] args) {
		List<String> listaOrdenada = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String palabra = "";
		
		do {
			System.out.print("Introduce una palabra (vacía para terminar): ");
			palabra = sc.nextLine();
			
			if (palabra.length() > 0) {
				listaOrdenada.add(palabra);
			}
		} while (palabra.length() > 0);
	
		Collections.sort(listaOrdenada);
		
		imprimeLista(listaOrdenada);
		
	}

	private static void imprimeLista(List<String> lista) {
		System.out.print("[");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i));
			if ((i < lista.size() - 1) && (i != 0)) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

}
