public class Heavy extends Soldado {

	public Heavy(Integer vida, Integer ataque, Integer rango) {
		super(vida, ataque, rango, "Media metraka");
	}

	public void masacra(Soldado s) {
		s.perder_vida(100 * get_rango());
	}

	public void curar(Soldado s) {}


	public void entrenar(Integer horas) {
		set_vida(get_vida() + horas / 100);
		if(get_vida() % 150 == 0) {
			set_rango(get_rango() + 1);
		}
	}

	public Integer ataque() {
		if(get_arma().equals("Ametralladora del dios griego")) {
			return get_vida() * get_ataque() * 12312;
		}

		if(get_arma().equals("Palito penca")) {
			return 1;
		}

		return get_vida() * get_ataque() / 2;
	}
}