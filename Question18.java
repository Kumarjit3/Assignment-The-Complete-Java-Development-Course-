import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class Question18 
{
    public static void main(String[] args)
    {
       ArrayList<Integer> a1 = new ArrayList<>();

      a1.add(10);
      a1.add(20);
      a1.add(30);
      a1.add(40);
      a1.add(50);
      a1.add(60);
      System.out.print("\n"+a1+"\n");
      a1.set(3, 44);
      System.out.println("\n"+a1.remove(0));
      System.out.println("\n"+a1.remove(3));
      System.out.println("\nContains 30 : "+a1.contains(30));
      System.out.println("\nContains 3 : "+a1.contains(3));
      System.out.println("\n"+a1);  

      List<Integer> l1 = new LinkedList<>();

      l1.add(10);
      l1.add(20);
      l1.add(30);
      l1.add(40);
      l1.add(50);
      l1.add(60);
      System.out.println("\n"+l1+"\n");
      l1.set(2, 33);
      System.out.println("\n"+l1.remove(0));
      System.out.println("\n"+l1.remove(4));
      System.out.println("\nContains 33 : "+l1.contains(33));
      System.out.println("\nContains 31 :"+l1.contains(31));
      System.out.println("\n"+l1);

    }

}
