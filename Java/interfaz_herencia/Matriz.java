import java.util.*;

public class Matriz implements Print {
	public Integer filas;
	public Integer columnas;
	public List< List< Integer > > m;

	Matriz(Integer f, Integer c) {
		filas = f;
		columnas = c;
		m = new ArrayList< List< Integer > >();
		for(Integer i = 0; i < f; i++) {
			m.add(new ArrayList< Integer >());
			for(Integer j = 0; j < c; j++) {
				m.get(i).add(j * i);
			}
		}
	}

	public void print() {
		for(Integer i = 0; i < filas; i++) {
			for(Integer j = 0; j < columnas; j++) {
				System.out.print(m.get(i).get(j) + " ");
			}
			System.out.print("\n");
		}
	}
}