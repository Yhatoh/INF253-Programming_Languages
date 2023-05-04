package Clases2;

public class Main {
	public static void print_int(int a) {
		System.out.println(a);
	}

	public static void main(String args[]) {
		Persona p = new Persona(1, 10);

		print_int(p.get_id());
		print_int(p.get_anio());
		System.out.println(p.get_nombre());

		p.set_var(3, "id");
		p.set_var("Lolero", "nombre");
		System.out.println("Modificado:");
		print_int(p.get_id());
		print_int(p.get_anio());
		System.out.println(p.get_nombre());
	}
}