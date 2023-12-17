import java.util.ArrayList;

class CustomList<T>
{
    ArrayList<T> a1 = new ArrayList<>();

    public void addItem(T item)
    {
        a1.add(item);
        System.out.print("\nItem "+item+" is add to the list\n");
    }

    public void searchItem(T item)
    {
        int i=0;
        for(T a : a1)
        {
            if(a == item)
            {
                i++;
                System.out.print("\nItem "+item+" is found\n");
            }
        }
        if(i==0)
        {
            System.out.print("\nItem "+item+" is not found\n");
        }
    }

    public T getItem(int index)
    {
       if(index < a1.size())
       {
          return a1.get(index);
       }
       return null;
    }


    public void displayList()
    {
        for(T x : a1)
        {
            System.out.print("\n"+x+" ");
        }
         System.out.print("\n\n\n");
    }
}

public class Question19 
{
    public static void main(String[] args)
    {
        CustomList<String> s1 = new CustomList<>();

        s1.addItem("Banana");
        s1.addItem("Mango");
        s1.addItem("Orange");
        s1.addItem("PineApple");
        s1.addItem("Apple");
        s1.addItem("Lemons");
        s1.addItem("Strawberries");
        s1.addItem("Guava");
        s1.addItem("Cherries");
        s1.addItem("BlackBerry");

        s1.displayList();

        System.out.println("\nIndex 3 item is : "+s1.getItem(3)+"\n");
        s1.searchItem("StrawBerries");

        CustomList<Integer> s2 = new CustomList<>();

        s2.addItem(12);
        s2.addItem(11);
        s2.addItem(13);
        s2.addItem(15);
        s2.addItem(28);

        s2.searchItem(3);
        System.out.println("\nIndex 3 item is :"+s2.getItem(3)+"\n");

        s2.displayList();
    }
}
