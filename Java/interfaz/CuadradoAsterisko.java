public class CuadradoAsterisko extends Cuadrado {

	CuadradoAsterisko(Integer a) {
		super(a);
	}

	public void print() {
		for(Integer i = 0; i < get_a(); i++) {
			String linea = "*";	
			if(i == 0 || i  == get_a() - 1) {
				for(Integer j = 0; j < get_a() - 2; j++) {
					linea += "*";
				}
			} else {
				for(Integer j = 0; j < get_a() - 2; j++) {
					linea += " ";
				}
			}
			linea += "*";
			System.out.println(linea);
		}
	}	
}