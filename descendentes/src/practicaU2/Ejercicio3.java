package practicaU2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Defino contadores para los múlyiplos
		int countMultiplos2 = 0;
		int countMultiplos3 = 0;
		
		// Se itera del 1 al 100
		for (int i = 1; i<= 100; i++) {
			// Comprueba si es múltiplo de 2
			if (i % 2 == 0) {
				System.out.println(i + " es múltiplo de 2");
				countMultiplos2++;
				
				//Comprueba si es últiplo de 3
				if (i%3 ==0 ) {
					System.out.println(i+"es múltiplo de 3");
					countMultiplos3++;
					
				}
			}
			//Se muestra el total de múltiplos de 2 y 3
			System.out.println("Total de múltiplos de 2:"+countMultiplos2);
			System.out.println("Total de múltiplos de 3:"+countMultiplos3);
		}
	}

}
