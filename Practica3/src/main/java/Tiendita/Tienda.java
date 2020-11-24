package Tiendita;

import java.util.Scanner;

public class Tienda {
	/*
	 * 3. Aplicar lo de las practicas anteriores y usar métodos static cuando sea
	 * necesario en el siguiente problema: En una tienda se hace un 5% de descuento
	 * a los clientes cuya compra supere los 20 y un 7% cuando supere 50 dólares en
	 * las áreas de frutas, verduras y carnes. ¿Cuál será el total que pagará una
	 * persona por su compra ?, se debe mostrar el nombre del cliente, producto,
	 * precio, cantidad, descuento y total a pagar La tienda tiene Área de frutas,
	 * verduras, carnes, Lácteos, Granos básicos
	 */

	private static String nombreC, producto, area;
	private static double precio, descuento, totalPagar;
	private static int cantidad;

	static Scanner leer = new Scanner(System.in);

	public Tienda() {
		System.out.println("Bienvenido a la Tiendita");
	}

	public static void Captura() {
		System.out.print("Ingrese el Nombre: ");
		nombreC = leer.nextLine();
		System.out.print("Ingrese el Producto: ");
		producto = leer.nextLine();
		System.out.print("Ingrese el Precio del Producto: ");
		precio = leer.nextDouble();
		System.out.println("Ingrese la Cantidad: ");
		cantidad = leer.nextInt();
		System.out.print("En que area compro?");
		System.out.println("\nFrutas\nVerduras\nCarnes\nLacteos\nGranos\nDigite correctamente.");
		area = leer.nextLine();
		area = leer.nextLine();
	}

	public static double PagoSinDesc() {
		return precio * cantidad;
	}

	public static String Validaciones() {
		if (area.equals("Frutas") || area.equals("Verduras") || area.equals("Carnes")) {
			if (PagoSinDesc() > 20 && PagoSinDesc() <= 50) {
				return "Descuento fue de: " + ((PagoSinDesc() * 0.05)) + "\nEl total a pagar es: "
						+ (PagoSinDesc() - (PagoSinDesc() * 0.05));
			} else if (PagoSinDesc() > 50) {
				return "Descuento fue de: " + ((PagoSinDesc() * 0.07)) + "\nEl total a pagar es: "
						+ (PagoSinDesc() - (PagoSinDesc() * 0.07));
			} else {
				return "No tiene descuento, El total a pagar es: " + PagoSinDesc();
			}
		}
		return "No tiene descuento, El total a pagar es: " + PagoSinDesc();
	}

	public static void Mostrar() {
		System.out.println("Nombre del Cliente: " + nombreC);
		System.out.println("Producto: " + producto);
		System.out.println("Area de Compra: " + area);
		System.out.println("Precio del Producto: " + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println(Validaciones());
	}
}
