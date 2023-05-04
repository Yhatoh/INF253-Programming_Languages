package Clases;
import java.util.*;

public class Figuras {
	public static void print_int(int a) {
		System.out.println(a);
	}

	public static void main(String args[]) {
		/*Cuadrado var = new Cuadrado(4);
		print_int(var.get_lado());
		print_int(var.area());

		Cuadrado hola = new Cuadrado();
		print_int(hola.area());
		hola.set_lado(12);
		print_int(hola.area());*/

		Figura var2 = new Cuadrado(4);
		print_int(var2.area());

		List< Integer > lista = new ArrayList< Integer >();
	}
}