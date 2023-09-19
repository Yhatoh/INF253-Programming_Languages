public class Campo {

	public static void main(String[] args) {
		//Soldado s1 = new Soldado();
		Soldado s2 = new Heavy(300, 100, 5);
		Soldado s3 = new Medico(50, 40, 7);

		s2.masacra(s3);

		System.out.println("MASACRADO:");
		s3.prints();

		s2.curar(s3);
		System.out.println("CURAR?:");
		s3.prints();

		s3.curar(s3);
		s3.prints();
	}
}