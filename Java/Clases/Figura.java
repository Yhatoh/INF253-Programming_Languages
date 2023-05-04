package Clases;

public abstract class Figura {
	private Boolean fue_creado;
	private String tipo;

	Figura(String tipo, Boolean fue_creado) {
		this.fue_creado = fue_creado;
		this.tipo = tipo;
	}

	Figura() {
		this.tipo = "";
		this.fue_creado = false;
	}

	public Boolean get_fue_creado() {
		return this.fue_creado;
	}

	public void set_fue_creado(Boolean fue_creado) {
		this.fue_creado = fue_creado;
	}

	public String get_tipo() {
		return this.tipo;
	}

	public abstract Integer area();
}