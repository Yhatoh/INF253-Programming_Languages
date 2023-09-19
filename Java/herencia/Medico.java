public class Medico extends Soldado {

	public Medico(Integer vida, Integer ataque, Integer rango) {
		super(vida, ataque, rango, "Botiquin de hierro");
	}

	public void curar(Soldado s) {
		s.entrenar(20 * get_rango());
	}

	public void masacra(Soldado s) {}

	public void entrenar(Integer horas) {
		set_vida(get_vida() + horas / 10);
		if(get_vida() % 50 == 0) {
			set_rango(get_rango() + 1);
		}
	}

	public Integer ataque() {
		if(get_arma().equals("Botiquin de hierro")) {
			return get_vida() * get_ataque() * 10;
		}

		if(get_arma().equals("Palito penca")) {
			return 1;
		}

		return get_vida() * get_ataque() / 10;
	}
}