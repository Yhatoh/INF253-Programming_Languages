package Matriz;

import java.util.*;

public class Ejemplo {
  
  public static void main(String[] argv) {
    List< List< Integer > > m;

    m = new ArrayList< List< Integer > >();

    Random rand = new Random();
    for(Integer i = 0; i < 10; i++) {
      List< Integer > l = new ArrayList< Integer >();
      for(Integer j = 0; j < 5; j++) {
        l.add(rand.nextInt(9));
      }
      m.add(l);
    }
    
    for(Integer i = 0; i < 10; i++) {
      for(Integer j = 0; j < 5; j++) {
        System.out.print(m.get(i).get(j) + " ");
      }
      System.out.print("\n");
    }
  }
}

