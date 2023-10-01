public class Main {
	public static void main(String[] args) {
		Rectangulo c;
		c = new Rectangulo(2, 4);

		System.out.println("Area: " + c.area());
		System.out.println("Perimetro: " + c.perimetro());
		c.print();
		Rectangulo xd = new Rectangulo(10);
		xd.print();
		Rectangulo.print(xd);
		System.out.println(Rectangulo.fibonacci(xd.get_l()));
	}
}