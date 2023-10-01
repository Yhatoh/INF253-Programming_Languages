public class Ejercicio {
	public static void main(String[] args) {
		Matriz m = new Matriz(2, 3);
		m.print();

		Figura cua = new Cuadrado(4, "Gris");
		cua.print();
		Figura cir = new Circulo(3, "XD");
		cir.print();
	}
}