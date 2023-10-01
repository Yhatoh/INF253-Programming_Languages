package Geometria.D2;

public class Cuadrado extends Figura {
	public Integer a;

	Cuadrado(Integer a) {
		super(4);
		this.a = a;
	}

	public Integer area() { return a * a; }
	public Integer perimetro() { return 4 * a; }
}