package prog.ud07.mapas.ejercicio01;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
		Map<String, String> diccionario = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		String palabra = "";
		String traduccion = "";
		String palabraATraducir = "";
		int aciertos = 0;
		
		diccionario.put("Hola", "Hello");
		diccionario.put("Ratón", "Mouse");
		diccionario.put("Caballo", "Horse");
		diccionario.put("Teclado", "Keyboard");
		diccionario.put("Maletero", "Trunk");
		diccionario.put("Pantalones", "Trousers");
		diccionario.put("Zapatos", "Shoes");
		diccionario.put("Calcetines", "Socks");
		diccionario.put("Gorra", "Cap");
		diccionario.put("Hermano", "Brother");
		diccionario.put("Tonto", "Dumb");
		diccionario.put("Ventana", "Window");
		diccionario.put("Rueda", "Wheel");
		diccionario.put("Escritorio", "Desktop");
		diccionario.put("Mesa", "Table");
		
		
		do {
			System.out.print("Introduzca una palabra a traducir (vacía para acabar): ");
			palabra = sc.nextLine();
			if (compruebaCadenaDiccionario(palabra, diccionario)) {
				System.out.println(palabra + " traducido al inglés es: " + diccionario.get(palabra));
			} else if (!palabra.isBlank()) {
				System.out.println(palabra + " no se encuentra en el diccionario.");
			}
			System.out.println("------------------------------------");
		} while (!palabra.isBlank());
		
		for (int i = 1; i <= 5; i++) {
			palabraATraducir =  generaPalabraAleatoria(diccionario);
			System.out.print("Palabra nº " + i + ": " + palabraATraducir + ", ¿Cuál es su traducción al inglés?: " ); 
			traduccion = sc.nextLine();
			
			if (traduccion.equalsIgnoreCase(diccionario.get(palabraATraducir))) {
				aciertos++;
				System.out.println("Acertaste!");
				System.out.println("Aciertos: " + aciertos + "/5");
			} else {
				System.out.println("Fallaste, la respuesta era: " + diccionario.get(palabraATraducir));
				System.out.println("Aciertos: " + aciertos + "/5");
			}
			System.out.println("------------------------------------------------------");
					
		}
			
		System.out.println("Fin del programa.");
			
	}

	private static String generaPalabraAleatoria(Map<String, String> diccionario) {
		int numeroPalabra = generaEnteroAleatorio();
		int contador = 0;
		String resultado = "";
		
		for (String clave : diccionario.keySet()) {
			if (contador == numeroPalabra) {
				resultado = clave;
			}
			contador++;
		}
		return resultado;
	}
	
	private static boolean compruebaCadenaDiccionario(String palabra, Map<String, String> diccionario) {
		if (!palabra.isBlank() && (diccionario.containsKey(palabra))) {
			return true;
		} else {
			return false;
		}
	}
	
	private static int generaEnteroAleatorio() {
		return (int)(Math.random() * 15);
	}
	
}
