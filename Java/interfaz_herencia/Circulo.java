public class Circulo extends Figura {
	public Integer radio;

	Circulo(Integer radio, String color) {
		super(10000000, color);
		this.radio = radio;
	}

	public Integer area() {
		return 3 * radio * radio;
	}

	public Integer perimetro() {
		return 2 * 3 * radio;
	}
}