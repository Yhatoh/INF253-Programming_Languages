public class Rectangulo {
	private static Integer next_id = 0;
	private Integer id = 0;
	private Integer l, a;

	public Rectangulo(Integer l, Integer a) {
		this.id = ++next_id;
		this.l = l;
		this.a = a;
	}

	public Rectangulo(Integer c) {
		this.id = ++next_id;
		this.l = c;
		this.a = c;
	}

	public Integer get_l() { return l; }
	public void set_l(Integer l) { this.l = l; }
	public Integer get_a() { return a; }

	public Integer area() { return l * a; }
	public Integer perimetro() { return 2 * (l + a);}
	public void print() {
		System.out.println("l: " + l + ", a: " + a + ", id: " + id);
	}

	public static void print(Rectangulo x) {
		x.print();
	}

	public static Integer fibonacci(Integer x) {
		if(x == 1) return 1;
		if(x == 2) return 1;
		return fibonacci(x - 1) + fibonacci(x - 2);
	}
}