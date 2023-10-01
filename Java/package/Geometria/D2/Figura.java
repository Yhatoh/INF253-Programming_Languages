package Geometria.D2;

public abstract class Figura {
	public Integer cant_lados;

	public Figura(Integer cant_lados) {
		this.cant_lados = cant_lados;
	}

	public abstract Integer area();
	public abstract Integer perimetro();
}