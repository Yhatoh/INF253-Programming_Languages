public class Test {

	public static void main(String[] args) {
		Figura f = new CuadradoAsterisko(4);
		f.print();
		System.out.println(f.perimetro());
		System.out.println(f.area());
	}
}