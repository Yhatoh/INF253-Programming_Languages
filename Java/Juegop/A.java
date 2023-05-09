package Juegop;

public class A extends Personaje {
	A(String name) {
		super(name);
	}

	public Integer hacer_danio() {
		if(get_items().size() == 0) {
			return 0;
		}
		return get_items().get(0) * get_level();
	}

	public void level_up() {
		set_level(get_level() + 2);
	}
}