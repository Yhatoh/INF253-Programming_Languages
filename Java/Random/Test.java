package Random;

public class Test {
	public static void main(String[] argv) {
		Float f = NumberGenerator.numfloat();
		if(f > 0.3) {
			System.out.println("No aparece item");
		} else {
			System.out.println("Si aparece item");
		}
	}
}