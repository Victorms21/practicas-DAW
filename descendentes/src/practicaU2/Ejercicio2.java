package practicaU2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Se pide un número hasta que sea positivo
		int numero;
		do { System.out.println("Introduce un numero positivo");
		numero = scanner.nextInt(); }
		while (numero <=0);
		
		//una vez se tenga el número, se muestran los 20 sucesivos
		
		System.out.println("Los 20 números sucesivos a" +numero+ "son");
		for (int i = 1 ; i <= 20; i++) {
			System.out.println(numero + i);
		}
		scanner.close();
		
		}
	}


