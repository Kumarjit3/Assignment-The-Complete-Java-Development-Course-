import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Information
{
    String Name;
    String Email;
    int Number;
    public static int i=1;

    public Information(String Name,String Email,int Number)
    {
        this.Name = Name;
        this.Email = Email;
        this.Number = Number;
    }

    public String GetName()
    {
        return Name;
    }

    public void DisplayAll()
    {
       System.out.println("\nName : "+Name+"\nEmail : "+Email+"\nNumber : "+Number+"\n");
    }
}


public class Question16
{
    static HashMap<String,Information> map = new HashMap<>();
    static Information[] info = new Information[1000];

    public static void HeadLine()
    {
        System.out.println("\n\t_____________________________________________________");
        System.out.println("\n\t|---------------ContactList Application--------------|");
        System.out.println("\t_____________________________________________________\n\n");
    }

    public static int Front()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t<-----------List Items----------->\n");
        System.out.print("\n\t1.Add New Contact_________________: ");
        System.out.print("\n\t2.Remove Contact__________________: ");
        System.out.print("\n\t3.Search Contact__________________: ");
        System.out.print("\n\t4.Display All Contact_____________: ");
        System.out.print("\n\t5.Exit From The Application_______: ");
        System.out.print("\n\n\tEnter Your Choice In Between[1/2/3/4/5] : ");
        int item = Integer.parseInt(sc.nextLine());
        sc.equals(sc);
        return item;
    }

    public static boolean AddContact(String Name,String Email,int Number)
    {
        if(!RetrieveContact(Name))
        {
           info[Information.i] = new Information(Name,Email,Number);
           map.put(info[Information.i].Name,info[Information.i]);
           Information.i++;
           return true;
        }
        else
        {
            System.out.println("\nThe Contact Information Is Already Have! No Need To Add it Again\n");
            System.out.print("\nPress Emter key for continue......... ");
        }
        return false;
    }

     public static boolean RetrieveContact(String Name)
     {
         if(map.containsKey(Name))
            return true;
         else 
            return false;   
     }

     public static boolean RemoveContact(String Name)
    {
        if(RetrieveContact(Name))
        {
            map.remove(Name);
            Information.i--;
            return true;
        }
        else
        {
            System.out.println("\nThis Name '"+Name+"' Do Not have Any Contact Information\n"); 
        }
        return false;
    }

     public static boolean DisplayAllContact()
    {
        int i=1;
        if(map.isEmpty())
        {
            return true;
        }
        else
        {
        System.out.println("\nDisplaying All Contact Information :\n\n");
        for(Map.Entry<String,Information> entry : map.entrySet())
        {
          Information i1 = entry.getValue();
          System.out.print("\n Contact Information ."+i++);
          i1.DisplayAll();
        }
        }
          return false;
    }

    public static void DisplaySpecific(String name)
    {
        for(int ii=1; ii<Information.i; ii++)
        {
            String s1 = info[ii].GetName();
            if(s1.equals(name))
            {
                  info[ii].DisplayAll();
            }
        }

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
                
                     System.out.print("\n\tEnter Name : ");
                     String Name = sc.nextLine(); 
                     System.out.print("\n\tEnter Email : ");
                     String Email = sc.nextLine(); 
                     System.out.print("\n\tEnter Number : ");
                     int Number = sc.nextInt();
                     sc.nextLine(); 
                     if(AddContact(Name,Email,Number))
                     {
                        System.out.println("\n\t "+(Information.i-1)+" Contact Information Successfully Added\n");
                        System.out.print("\n\tPress Enter key for continue........ : ");
                        c.readLine();
                     }
                     else
                     {
                        System.out.println("\nYou Already Have This Contact Information! \n");
                        System.out.print("\n\tPress Enter key for continue........ : ");
                        c.readLine();
                     } 
                  System.out.println("\n");
                  break;
                }


            case 2:
                {
                      System.out.print("\n");
                      System.out.print("\nEnter Name : ");
                      String Name1 = sc.nextLine(); 
                  if(RemoveContact(Name1))
                  {
                      System.out.print("\nContact Information Successfully Removed\n");
                      System.out.print("\nPress Enter key for continue........ : ");
                      c.readLine();
                  }
                  else
                  {
                      System.out.print("\nYou Don't Have This Contact Information! \n");
                      System.out.print("\nPress Enter key for continue........ : ");
                      c.readLine();
                  }  
                      System.out.print("\n");
                      break;
                }

            case 3:
                {
                     System.out.print("\n");
                     System.out.print("\nEnter Name : ");
                     String Name1 = sc.nextLine(); 
                  if(RetrieveContact(Name1))
                  {
                     System.out.print("\nContact Information is found........\n");
                      DisplaySpecific(Name1);  
                     System.out.print("\nPress Enter key for continue........ : ");
                     c.readLine();
                  }
                  else
                  {
                     System.out.print("\nYou Don't Have Any Contact Information According To This Name! \n");
                     System.out.print("\nPress Enter key for continue........ : ");
                     c.readLine();
                  }  
                     System.out.print("\n");
                     break;
                }
            case 4:
                {
                   System.out.print("\n");
                   if(DisplayAllContact())
                   {
                      System.out.print("\nContactList Application Is Empty");
                      System.out.print("\nPress Enter key for continue........ : ");
                      c.readLine();
                   }
                    System.out.print("\n");
                  break;
                }
            case 5:
                {
                  System.out.print("\n\n\nExit_________________________________________\n");
                  System.out.print("\n\tThank You For Using Contact List Application\n\n\n\n");
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

