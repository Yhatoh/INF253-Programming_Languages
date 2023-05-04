package Clases;

public class Cuadrado extends Figura {
	private Integer lado;

	Cuadrado() {
		super("Cuadrado", false);
	}

	Cuadrado(Integer a) {
		super("Cuadrado", true);
		this.lado = a;
	}

	public Integer area() {
		if(this.get_fue_creado()) {
			return this.lado * this.lado;
		}
		return -1;
	}

	public Integer get_lado() {
		return this.lado; 
	}

	public void set_lado(Integer a) {
		this.lado = a;
		this.set_fue_creado(true);
	}
}