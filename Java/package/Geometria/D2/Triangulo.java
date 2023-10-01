package Geometria.D2;

public abstract class Triangulo extends Figura {
	public Integer a;
	public Integer b;
	public Integer c;

	Triangulo(Integer a, Integer b, Integer c) {
		super(3);
		this.a = a;
		this.b = b;
		this.c = c;
	}
}