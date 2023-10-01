package Geometria.D2;

public class TrianguloRectangulo extends Triangulo {
	public TrianguloRectangulo(Integer a, Integer b, Integer c) {
		super(a, b, c);
	}

	public Integer area() {
		if(a > b && a > c) {
			return b * c / 2;
		}
		if(b > a && b > c) {
			return a * c / 2;
		}

		return a * b / 2;
	}

	public Integer perimetro() {
		return a + b + c;
	}
}