import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;


class Restaurant
{
    String item;
    int price;
    public static int i=1;

    public void addItem(String item)
    {
        this.item = item;
    }

    public void addPrice(int price)
    {
        this.price = price;
    }

    public String getItem()
    {
        return item;
    }

    public void showMenu(int i)
    {
        System.out.print("\n\t"+i+". "+item+"   --->   "+price+"\n");
    }
}

public class Question20 
{
    static HashMap<String,Restaurant> menu = new HashMap<>();
    static Restaurant[] arr = new Restaurant[1000];

    public static void HeadLine()
    {
        System.out.println("\n\t______________________________________________");
        System.out.println("\n\t|---------------Restaurant Menu--------------|");
        System.out.println("\t______________________________________________\n\n");
    }

    public static int Front()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t<-----------List Items----------->\n");
        System.out.print("\n\t1.Add New Menu_________________: ");
        System.out.print("\n\t2.Remove Menu__________________: ");
        System.out.print("\n\t3.Selecte Menu_________________: ");
        System.out.print("\n\t4.Update Price_________________: ");
        System.out.print("\n\t5.Display Full Menu____________: ");
        System.out.print("\n\t6.Exit From The App____________: ");
        System.out.print("\n\n\tEnter Your Choice In Between[1/2/3/4/5/6] : ");
        int item = Integer.parseInt(sc.nextLine());
        sc.equals(sc);
        return item;
    }



    public static boolean addNewItem(String name,int rupees)
    {
        arr[Restaurant.i] = new Restaurant();
        arr[Restaurant.i].item = name;
        arr[Restaurant.i].price = rupees;
        menu.put(arr[Restaurant.i].getItem(),arr[Restaurant.i]);
        Restaurant.i++;
        return true;
    }

    public static boolean removeItem(String name)
    {
        for(int i=1; i<Restaurant.i; i++)
        {
            String s1 = arr[i].getItem();
            if(s1.equals(name))
            {
                for(int j=i; j<Restaurant.i; j++)
                {
                    arr[j] = arr[j+1];
                }
                Restaurant.i--;
                return true;
            }
        }
        return false;
    }

    public static boolean updatePrice(String name,int rupees)
    {
        for(int i=1; i<Restaurant.i; i++)
        {
            String s1 = arr[i].getItem();
            if(s1.equals(name))
            {
                arr[i].price = rupees;
                return true;
            }
        }
        return false;
    }

    public static boolean SelecteItem(String name)
    {
        for(int i=1; i<Restaurant.i; i++)
        {
            String s1 = arr[i].getItem();
            if(s1.equals(name))
            {
                return true;
            }
        }
         return false;
    }

    public static void DisplayAllMenu()
    {
        if(Restaurant.i == 1)
        {
            System.out.print("\nResturant Menu list is empty\n");
        }
        else
        {
            System.out.print("\n\t____________________________\n");
            System.out.print("\n\t  DISH       |       PRICE\n");
            System.out.print("\t____________________________\n");
            for(int i=1; i<Restaurant.i; i++)
            {
               arr[i].showMenu(i);
            }
             System.out.print("\n\n\n");
        }
    }

    public static void DisplaySpecificItem(String name)
    {
        for(int i=1; i<Restaurant.i; i++)
        {
            String s1 = arr[i].getItem();
            if(s1.equals(name))
            {
                arr[i].showMenu(i);
            }
        }
        System.out.print("\n\n\n");
    }

    public static void main(String[] args) 
    {
       System.out.print("\n\n"); 
       Scanner sc = new Scanner(System.in);
       Console c = System.console();
       HeadLine();


       while(true)
        { 
         switch (Front()) 
         {
            case 1:
                {
                    System.out.println("\n");
                
                     System.out.print("\n\tEnter Dish Name : ");
                     String Name = sc.nextLine(); 
                     System.out.print("\n\tEnter Dish Price : ");
                     int Number = sc.nextInt();
                     sc.nextLine(); 
                     if(addNewItem(Name,Number))
                     {
                        System.out.println("\n\t "+(Restaurant.i-1)+" menu item is Successfully Added\n");
                        System.out.print("\n\tPress Enter key for continue........ : ");
                        c.readLine();
                     }
                     else
                     {
                        System.out.println("\nYou already Have a Dish with This name! Add unique dish...\n");
                        System.out.print("\n\tPress Enter key for continue........ : ");
                        c.readLine();
                     } 
                  System.out.println("\n");
                  break;
                }


            case 2:
                {
                      System.out.print("\n");
                      System.out.print("\nEnter Dish Name : ");
                      String Name1 = sc.nextLine(); 
                  if(removeItem(Name1))
                  {
                      System.out.print("\nDish item Successfully Removed\n");
                      System.out.print("\nPress Enter key for continue........ : ");
                      c.readLine();
                  }
                  else
                  {
                      System.out.print("\nYou don't have any dish with this name ! unable to remove.... \n");
                      System.out.print("\nPress Enter key for continue........ : ");
                      c.readLine();
                  }  
                      System.out.print("\n");
                      break;
                }

            case 3:
                {
                     System.out.print("\n");
                     System.out.print("\nEnter Dish Name : ");
                     String Name1 = sc.nextLine(); 
                  if(SelecteItem(Name1))
                  {
                     DisplaySpecificItem(Name1);  
                     System.out.print("Dish is selected........\n");
                     System.out.print("\nPress Enter key for continue........ : ");
                     c.readLine();
                  }
                  else
                  {
                     System.out.print("\nYou Don't Have Any Dish item According To This Name! unable to select......\n");
                     System.out.print("\nPress Enter key for continue........ : ");
                     c.readLine();
                  }  
                     System.out.print("\n");
                     break;
                }
            case 4:
                {
                   System.out.print("\n");
                   System.out.print("\nEnter Dish Name : ");
                   String name = sc.nextLine();
                   if(SelecteItem(name))
                   {
                      System.out.print("\nEnter New Price : ");
                      int rupees = sc.nextInt();
                      updatePrice(name,rupees);
                      System.out.print("\nUpdate price successfully\n");
                   }
                  else
                   {
                      System.out.print("\nYou do not have any Dish item with this name ! unable to update price of it......\n");
                      System.out.print("\nPress Enter key for continue........ : ");
                      c.readLine();
                   }
                    System.out.print("\n");
                  break;
                }
            case 5:
                {
                    DisplayAllMenu();
                    break;
                }
            case 6:
                {
                  System.out.print("\n\n\nExit_________________________________________\n");
                  System.out.print("\n\tThank You For Using Our Restaurant Menu Application\n\tWish you a good day & good life\n\n\n\n");
                  System.exit(0);
                  break;
                }                
         
            default:
            {
                System.out.print("\nWrong Choice ! Choose Again\n");
                System.out.print("\nPress Enter key for continue........ : ");
                c.readLine();
                break;
            }
         }
         sc.equals(sc);
       } 
    }
}
