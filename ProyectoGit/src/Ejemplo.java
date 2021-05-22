import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Definimos las variables
		int n1;		
		int n2;		
		int n3;
		
		int suma;
		int resta;
		
		int multiplicacion;
		int division;
		
		char continuar='S';
		
//Para leer creamos el objeto teclado
		Scanner teclado = new Scanner(System.in);
		
//Mientras que quiera continuar:
		while(continuar=='S' | continuar=='s') {
			
//Introducimos las variables
			System.out.print("Introduce el valor del primer numero:");
			n1 = teclado.nextInt();

			System.out.print("Introduce el valor del segundo numero:");
			n2 = teclado.nextInt();

			System.out.print("Introduce el valor del tercer numero:");
			n3 = teclado.nextInt();
			
//Hallamos la suma, la resta y la division
			suma = n1 + n2 + n3;
			
			resta = n1 - n2 - n3;
			
			System.out.println("La suma es " + suma + " y la resta es " + resta);
			
//***MODIFICACIÓN*** Hallamos la multiplicación
			
			multiplicacion = n1 * n2 * n3;
			
			System.out.println("La multiplicacion total es " + multiplicacion);
			
			System.out.print("Quieres continuar?(S/N)");
			continuar=teclado.next().charAt(0);
		}
		
		teclado.close();
	}

}
