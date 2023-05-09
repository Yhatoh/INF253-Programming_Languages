package Juegop;

import java.util.*;

class Juego {
	public static void print_list(List< Integer > myListOfItems) {
		System.out.print("[");
		for(Integer it : myListOfItems) {
		     System.out.print(it.toString() + ", ");
		}
		System.out.print("]\n");
	}

	public static void main(String[] argv) {
		Scanner reader = new Scanner(System.in);
		Integer n = reader.nextInt();
		List< Integer > mapa = new ArrayList< Integer >();
		for(Integer i = 0; i < n; i++) {
			Integer item_en_el_suelo = reader.nextInt();
			mapa.add(item_en_el_suelo);
		}

		Personaje p;
		System.out.println("Queri ser bacan o no? [1: A, 2: B]");
		Integer op_class = reader.nextInt();
		if(op_class == 1) {
			p = new A("Pepito el Destructor");
		} else {
			p = new B("Pepito el Construidor");
		}

		Integer pos_actual = 0;
		while(true) {
			Integer op = reader.nextInt();
			if(op == 1) {
				if(pos_actual == 0) pos_actual = n;
				pos_actual -= 1;
			} else if(op == 2) {
				if(pos_actual == n - 1) pos_actual = -1;
				pos_actual += 1;
			} else if(op == 3) {
				p.aniadir_item(mapa.get(pos_actual));
			} else if(op == 4) {
				System.out.println("MUERE :) " + p.hacer_danio());
			} else if(op == 5) {
				System.out.println("-- Stats --");
				System.out.println(p.get_name());
				System.out.println(p.get_level());
				print_list(p.get_items());
				System.out.println("-----------");
			} else if(op == 6) {
				p.level_up();
			} else {
				break;
			}
		}

		reader.close();
	}
}