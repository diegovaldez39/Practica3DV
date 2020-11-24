package Ejercicio2Static;

import java.util.Scanner;

public class CalculadoraDigital {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingrese el Primer Numero: ");
		String captura1 = leer.nextLine();
		System.out.print("Ingrese el Segundo Numero: ");
		String captura2 = leer.nextLine();
		try {
			Calculadora.num1 = Double.parseDouble(captura1);
			Calculadora.num2 = Double.parseDouble(captura2);
			Calculadora.Resultado();
		} catch (NumberFormatException ex) {
			System.out.println("No es un número");
		}

	}

}
