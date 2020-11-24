package Ejercicio2Static;

import java.util.Scanner;

public class Calculadora {
	
	static double num1, num2;
	static Scanner leer = new Scanner(System.in);
	
	public Calculadora() {
		System.out.println("Clase Calculadora \n");
	}
	
	public static double Suma(double n1, double n2) {
		return n1 + n2;
	}

	public static double Resta(double n1, double n2) {
		return n1 - n2;
	}

	public static double Multiplicacion(double n1, double n2) {
		return n1 * n2;
	}

	public static String Division(double n1, double n2) {
		if (n2 != 0) {
			return "" + n1 / n2;
		} else {
			return "ERROR, no se puede dividir entre cero!";
		}
	}

	public static void Resultado() {
		int opcion = 0;
		System.out.println("Que Desea Realizar? \nDigite: \n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division");
		opcion = leer.nextInt();
		if (opcion == 1) {
			System.out.println("El Resultado de la Suma es: " + Suma(num1, num2));
		} else if (opcion == 2) {
			System.out.println("El Resultado de la Resta es: " + Resta(num2, num2));
		} else if (opcion == 3) {
			System.out.println("El Resultado de la Multiplicacion es: " + Multiplicacion(num2, num2));
		} else if (opcion == 4) {
			System.out.println("El Resultado de la Division es: " + Division(num1, num2));
		} else {
			System.out.println("Opcion no valida! Solo del 1 al 4");
		}
	}
}
