public class Pizza {
	private Integer spice;
	private float temperatura;
	private String tipo;
	private float grosor;

	public Pizza() {
		spice = 12123;
		temperatura = (float)2.3;
		tipo = "M";
		grosor = (float)2.0;
	}

	public Pizza(Integer spice, float temperatura, String tipo,
				 float grosor) {
		this.spice = spice;
		this.temperatura = temperatura;
		this.tipo = tipo;
		this.grosor = grosor;
	}

	public Integer get_spice() { return spice; }
	public float get_temperatura() { return temperatura; }
	public String get_tipo() { return tipo; }
	public float get_grosor() { return grosor; }	

	public void print_pizza() {
		System.out.println("spice: " + this.get_spice());
		System.out.println("temperatura: " + this.get_temperatura());
		System.out.println("tipo: " + this.get_tipo());
		System.out.println("grosor: " + this.get_grosor());
	}
}