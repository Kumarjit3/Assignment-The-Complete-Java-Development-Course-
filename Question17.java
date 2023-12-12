import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Wildcard
{
    public void Method(List<?>l1)
    {
        l1.forEach(n -> System.out.println(n+" "));
    }
}

public class Question17
{
    public static void main(String[] args)
    {
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);

        List<Integer> l1 = Arrays.asList(3,5,2,6,1,9);
        Wildcard w1 = new Wildcard();
        w1.Method(l1);
        System.out.println("\n");

        List<String> l2 = Arrays.asList("Kumar","Ram","Neil","Rihan","Niloy");
        Wildcard w2 = new Wildcard();
        w2.Method(l2);
        System.out.println("\n");

        List<Float> l3 = Arrays.asList(3.5f,5.1f,2.7f,6.4f,1.1f,9.3f);
        Wildcard w3 = new Wildcard();
        w3.Method(l3);
        System.out.println("\n");

        List<Double> l4 = Arrays.asList(33.3,55.1,25.3,67.9,13.4,97.3);
        Wildcard w4 = new Wildcard();
        w4.Method(l4);
        System.out.println("\n");

        List<Long> l5 = Arrays.asList(39l,51l,25l,66l,17l,99l);
        Wildcard w5 = new Wildcard();
        w5.Method(l5);
        System.out.println("\n\n");

        sc.close();
    }
}