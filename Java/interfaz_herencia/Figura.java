public abstract class Figura implements Print {
	public Integer vertices;
	public String color;

	Figura(Integer vertices, String color) {
		this.vertices = vertices;
		this.color = color;
	}

	public abstract Integer area();
	public abstract Integer perimetro();

	public void print() {
		System.out.println("Vertices: " + vertices);
		System.out.println("Color: " + color);
		System.out.println("Area: " + area());
		System.out.println("Perimetro: " + perimetro());
	}
}