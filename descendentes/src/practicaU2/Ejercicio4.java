package practicaU2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Se pide al usuario que introduzca tres números.
		System.out.println("Introduzca el primer número:");
		int num1 = scanner.nextInt();
		
		System.out.println("Introduzca el segundo número:");
		int num2 = scanner.nextInt();
		
		System.out.println("Introduzca el tercer número:");
		int num3 = scanner.nextInt();
		
		//Se pide indicar si se quiere orden ascendente o descendente
		System.out.println("Elija el orden en el que se van a mostrar los números");
		System.out.println("1. Ascendente");
		System.out.println("2. Descendente");
		int opcion = scanner.nextInt();
		
		//Se crea un array que almacene los datos de los números ingresados.
		int[]numeros = {num1, num2, num3};
		
		//Ordenar los números
		 if (opcion == 1) {
	            for (int i = 0; i < numeros.length - 1; i++) {
	                for (int j = 0; j < numeros.length - i - 1; j++) {
	                    if (numeros[j] > numeros[j + 1]) {
	                        // Intercambiar los números si están en el orden incorrecto
	                        int temp = numeros[j];
	                        numeros[j] = numeros[j + 1];
	                        numeros[j + 1] = temp;
	                    }
	                }
	            }
	            System.out.println("Números en orden ascendente:");
	            for (int num : numeros) {
	                System.out.print(num + " ");
	            }
	        } else if (opcion == 2) {
	            for (int i = 0; i < numeros.length - 1; i++) {
	                for (int j = 0; j < numeros.length - i - 1; j++) {
	                    if (numeros[j] < numeros[j + 1]) {
	                        // Intercambiar los números si están en el orden incorrecto
	                        int temp = numeros[j];
	                        numeros[j] = numeros[j + 1];
	                        numeros[j + 1] = temp;
	                    }
	                }
	            }
	            System.out.println("Números en orden descendente:");
	            for (int num : numeros) {
	                System.out.print(num + " ");
	            }
	        } else {
	            System.out.println("Opción no válida. Debes seleccionar 1 o 2.");
	        }

	        scanner.close();
	    }
		
}


