package practicaU2;


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
		
		//Ordenar los números
		switch (opcion) {
	     case 1:
             if (num1 > num2) {
                 int temp = num1;
                 num1 = num2;
                 num2 = temp;
             }
             if (num2 > num3) {
                 int temp = num2;
                 num2 = num3;
                 num3 = temp;
             }
             if (num1 > num2) {
                 int temp = num1;
                 num1 = num2;
                 num2 = temp;
             }
             System.out.println("Números en orden ascendente: " + num1 + ", " + num2 + ", " + num3);
             break;
         case 2:
             if (num1 < num2) {
                 int temp = num1;
                 num1 = num2;
                 num2 = temp;
             }
             if (num2 < num3) {
                 int temp = num2;
                 num2 = num3;
                 num3 = temp;
             }
             if (num1 < num2) {
                 int temp = num1;
                 num1 = num2;
                 num2 = temp;
             }
             System.out.println("Números en orden descendente: " + num1 + ", " + num2 + ", " + num3);
             break;
         default:
             System.out.println("Opción no válida. Debes seleccionar 1 o 2.");
     }

     scanner.close();
 }
}

		
	



