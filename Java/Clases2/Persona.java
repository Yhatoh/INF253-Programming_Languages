package Clases2;

public class Persona implements Modificador {
	private Integer id;
	private Integer anio;
	private String nombre;

	Persona(Integer id, Integer anio) {
		this.id = id;
		this.anio = anio;
		this.nombre = "Juan";
	}

	public void set_var(Integer a, String name) {
		if(name.equals("id")) {
			this.id = a;
		} else if(name.equals("anio")) {
			this.anio = a;
		}
	}

	public void set_var(String n, String name) {
		if(name.equals("nombre")) {
			this.nombre = n;
		}
	}

	public Integer get_id() {
		return this.id;
	}
	public Integer get_anio() {
		return this.anio;
	}
	public String get_nombre() {
		return this.nombre;
	}
}