public class Cuadrado implements Figura {
	private Integer a;

	public Cuadrado() {}
	public Cuadrado(Integer a) {
		this.a = a;
	}

	public Integer get_a() { return a; }

	public Integer perimetro() { return 4 * a; }
	public Integer area() { return a * a; }
	public void print() {
		for(Integer i = 0; i <= a + 1; i++) {
			if(i == 0 || i  == a + 1) {
				String linea = " ";
				for(Integer j = 0; j < a; j++) {
					linea += "_";
				}
				linea += " ";
				System.out.println(linea);
			} else {
				String linea = "|";
				for(Integer j = 0; j < a; j++) {
					linea += " ";
				}
				linea += "|";
				System.out.println(linea);
			}
		}
	}
}