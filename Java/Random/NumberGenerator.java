package Random;

import java.util.Random;

public class NumberGenerator {
	static Random rand = new Random();
	public static Integer num(Integer a, Integer b) {

		// 0 X - 1
		// 0 y b - a - 1 -> a y b
		Integer ret = rand.nextInt(b - a) + a + 1;
		return ret;
	}

	public static Float numfloat() {
		return rand.nextFloat();
	}
}