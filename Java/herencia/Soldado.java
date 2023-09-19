public abstract class Soldado {
	private Integer vida;
	private Integer ataque;
	private Integer rango;
	private String arma;

	public Soldado() {
		this.vida = 10;
		this.ataque = 10;
		this.rango = 1;
		this.arma = "Manos";
	}
	public Soldado(Integer vida, Integer ataque, Integer rango, 
				   String arma) {
		this.vida = vida;
		this.ataque = ataque;
		this.rango = rango;
		this.arma = arma;
	}

	public Integer get_vida() { return vida; }
	public Integer get_ataque() { return ataque; }
	public Integer get_rango() { return rango; }
	public String get_arma() { return arma; }

	public void set_vida(Integer vida) { this.vida = vida; }
	public void set_rango(Integer rango) { this.rango = rango; }

	public void entrenar(Integer horas) {
		vida += horas / 10;
		if(vida % 100 == 0) {
			rango++;
		}
	}

	public void perder_vida(Integer vida) {
		this.vida -= vida;
	}

	public Integer ataque() {
		if(arma.equals("SUPER GOD ARMA XD")) {
			return vida * ataque * 100;
		}

		if(arma.equals("Palito penca")) {
			return 1;
		}

		return vida * ataque / 5;
	}

	public void prints() {
		System.out.println(vida);
		System.out.println(ataque);
		System.out.println(rango);
		System.out.println(arma);
	}

	public abstract void masacra(Soldado s);
	public abstract void curar(Soldado s);
}