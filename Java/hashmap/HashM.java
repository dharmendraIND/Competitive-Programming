import java.util.HashMap;

public class HashM {
  public static void main(String[] args)
  {
    HashMap <String, Integer> h = new HashMap<String, Integer>();

    h.put("computer", 161);
    h.put("information technology", 224);
    h.put("electrical", 121);

    System.out.println("hashmap is ");
    System.out.println(h);

    h.put("computer", 124);

    System.out.println("After updating the value and adding duplicate keyws: ");

    System.out.println(h);
  }
}

