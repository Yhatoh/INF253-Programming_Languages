package Juegop;

import java.util.*;

public abstract class Personaje {
	private String name;
	private Integer level;
	private List< Integer > items;

	Personaje(String name) {
		this.name = name;
		this.level = 1;
		this.items = new ArrayList< Integer >();
	}

	public abstract Integer hacer_danio();
	public abstract void level_up();

	public String get_name() {
		return this.name;
	}

	public Integer get_level() {
		return this.level;
	}

	public void set_level(Integer level) {
		this.level = level;
	}

	public List< Integer > get_items() {
		return this.items;
	}

	public void aniadir_item(Integer i) {
		items.add(i);
	}
}