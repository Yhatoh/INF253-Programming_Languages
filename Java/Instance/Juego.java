package Instance;

import java.util.*;

class Juego {

  public static void main(String[] argv) {
    Personaje p = new B("Pepito el destructor");

    if(p instanceof B) {
      System.out.println("B");
    } else {
      System.out.println("A");
    }
	}
}
