public class Cuadrado extends Figura {
	public Integer a;

	Cuadrado(Integer a, String color) {
		super(4, color);
		this.a = a;
	}

	public Integer area() {
		return a * a;
	}

	public Integer perimetro() {
		return 4 * a;
	}
}