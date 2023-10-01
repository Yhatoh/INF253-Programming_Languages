package Geometria.D2;

import Geometria.Print;
import java.util.*;

public class Matriz implements Print {
	List< List< Integer > > m;
	
	public Matriz(Integer c, Integer f) {
		m = new ArrayList< List< Integer > >();
		for(Integer i = 0; i < f; i++) {
			List< Integer > aux = new LinkedList< Integer >();
			for(Integer j = 0; j < c; j++) {
				aux.add(i * j);
			}
			m.add(aux);
		}
	}

	public void print() {
		for(Integer i = 0; i < m.size(); i++) {
			for(Integer j = 0; j < m.get(i).size(); j++) {
				System.out.print((m.get(i)).get(j) + " ");
			}
			System.out.print("\n");
		}
	}
}