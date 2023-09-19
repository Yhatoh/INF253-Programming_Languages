import java.io.*;

public class Pizzeria {

	public static void main(String[] argc) {
		Pizza p1 = new Pizza();
		p1.print_pizza();
		Pizza p2 = new Pizza(-34, 12736512, "XXXL", (float)10000.0);
		p2.print_pizza();
	}
}