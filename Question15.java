import java.util.Map;
import java.util.Scanner;
import java.io.Console;
import java.util.HashMap;

class Student
{
    private int Id;
    private String Name;
    private int Age;
    private String Grade;
    public static int i=1;

    public Student(int Id,String Name,int Age,String Grade)
    {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Grade = Grade;
    }

    public void setId(int Id)
    {
        this.Id = Id;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public void setGrade(String Grade)
    {
        this.Grade = Grade;
    }

    public int getId()
    {
        return this.Id;
    }

    public String getName()
    {
        return this.Name;
    }

    public int getAge()
    {
        return this.Age;
    }

    public String getGrade()
    {
        return this.Grade;
    }

    public void DisplayStudent()
    {
        System.out.print("\n\nStudent Name  :  "+this.Name+"\nStudent Id    :  "+this.Id+"\nStudent Age   :  "+this.Age+"\nStudent Grade :  "+this.Grade+"\n\n");
    }
}


public class Question15 
{

    static HashMap<Integer,Student> m1 = new HashMap<Integer,Student>();
    static Student srr[] = new Student[1000];
    static Scanner sc = new Scanner(System.in);

    public static void HeadLine()
    {
        System.out.println("\n\t_____________________________________________________");
        System.out.println("\n\t|---------------StudentList Application--------------|");
        System.out.println("\t_____________________________________________________\n\n");
    }

    public static int Front()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\t<-----------List Items----------->\n");
        System.out.print("\n\t1.Add New Student Information_________________: ");
        System.out.print("\n\t2.Remove Student Information__________________: ");
        System.out.print("\n\t3.Search Student Information__________________: ");
        System.out.print("\n\t4.Update Student Information__________________: ");
        System.out.print("\n\t5.Display All Student Information_____________: ");
        System.out.print("\n\t6.Exit From The Application___________________: ");
        System.out.print("\n\n\tEnter Your Choice In Between[1/2/3/4/5/6] : ");
        int choice = Integer.parseInt(sc.nextLine());
        sc.equals(sc);
        return choice;
    }


    public static boolean AddStudent(int Id,String Name,int Age,String Grade)
    {
        if( (Student.i<srr.length) && (!(m1.containsKey(Id))) )
        {
           srr[Student.i] = new Student(Id,Name,Age,Grade);
           m1.put(srr[Student.i].getId(),srr[Student.i]);
           Student.i++;
           return true;
        }
        else
        {
            if(Student.i>=srr.length)
            {
                System.out.print("\nThe student array is full ! unable to store information\n");
            }
            else
            {
                System.out.print("\nAlready have This student information!\n");
            }
        }
        return false;
    } 

    public static void RemoveStudentInformation()
    {
          if(m1.isEmpty())
          {
             System.out.print("\nStudent list is empty! unable to remove student information\n");
          }
          else
          {
             System.out.print("\n\nEnter Student id : ");
             int id = sc.nextInt(); 
               if(m1.containsKey(id))
               {
                   m1.remove(id);
                   System.out.print("\nStudent information successfully removed\n");
                   Student.i--;
               }
               else
               {
                   System.out.print("\nYou Don't Have any Student Information! with this id \n");
               }  
          }
    }

    public static void SearchStudentInformation()
    {

        if(m1.isEmpty())
        {
            System.out.print("\nStudent list is empty! unable to search student information\n");
        }
        else
        {
            System.out.print("\n\nEnter Student id : ");
            int id = sc.nextInt(); 
            if(m1.containsKey(id))
            {
                System.out.print("\nStudent Information is found........\n");
                System.out.print("\nInformation is : ");
                DisplaySpecific(id);
            }
            else
            {
                System.out.println("\nSearch unsuccessfull! unable to findout any Information with this id\n"); 
            }
        }
    }

    public static boolean UpdateStudentInformation()
    {
        if(m1.isEmpty())
        {
            System.out.print("\nStudentList Is Empty");
        }
        else
        {
            System.out.print("\n\nEnter Student id : ");
            int d = sc.nextInt();
            sc.nextLine();
            System.out.print("\n\tEnter Student New Name : ");
            String Name = sc.nextLine(); 
            System.out.print("\n\tEnter Student New Age : ");
            int Age = sc.nextInt();
            sc.nextLine(); 
            System.out.print("\n\tEnter Student New Grade : ");
            String Grade = sc.nextLine();
        if(m1.containsKey(d))
        {
            for(int i=1; i<Student.i; i++)
            {
                if(srr[i].getId() == d)
                {
                    srr[i].setName(Name);
                    srr[i].setAge(Age);
                    srr[i].setGrade(Grade);
                    return true;
                }
            }
        }
        else
        { 
             System.out.println("\nunable to findout any Information with this id\n"); 
        }
      }
        return false;
    }

    public static void DisplaySpecific(int iid)
    {
        for(int ii=01; ii<Student.i; ii++)
        {
            if(srr[ii].getId() == iid)
            {
                srr[ii].DisplayStudent();
            }
        }
    }

    public static boolean DisplayAllStudent()
    {
        int i=1;
        if(m1.isEmpty())
        {
            return true;
        }
        else
        {
        System.out.println("\nDisplaying All Student Information :\n\n");
        for(Map.Entry<Integer,Student> entry : m1.entrySet())
        {
          Student i1 = entry.getValue();
          System.out.print("\n Contact Information ."+i++);
          i1.DisplayStudent();
        }
        }
          return false;
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
                     System.out.print("\n\n\tEnter Id : ");
                     int Id = sc.nextInt();
                      sc.nextLine();  
                     System.out.print("\n\tEnter Name : ");
                     String Name = sc.nextLine(); 
                     System.out.print("\n\tEnter Age : ");
                     int Age = sc.nextInt();
                     sc.nextLine(); 
                     System.out.print("\n\tEnter Grade : ");
                     String Grade = sc.nextLine();
                     if(AddStudent(Id,Name,Age,Grade))
                     {
                        System.out.println("\n\t "+(Student.i-1)+" Student Information Successfully Added\n");
                        System.out.print("\n\tPress Enter key for continue........ : ");
                        c.readLine();
                     }
                     else
                     {
                        System.out.println("\nAlready Have This Student Information! \n");
                        System.out.print("\n\tPress Enter key for continue........ : ");
                        c.readLine();
                     } 
                  System.out.println("\n");
                  break;
                }


            case 2:
                {
                    RemoveStudentInformation();    
                    System.out.print("\nPress Enter key for continue........ : ");
                    c.readLine();
                    break;
                }

            case 3:
                {
        
                    SearchStudentInformation();
                    System.out.print("\nPress Enter key for continue........ : ");
                    c.readLine();
                    break;
                }
            case 4:
                {
                     if(UpdateStudentInformation())
                     {
                        System.out.print("\nUpdate Successfull\n");
                     }
                     else
                     {
                        System.out.print("\nUpdate Unsuccessfull\n");
                     }
                     System.out.print("\nPress Enter key for continue........ : ");
                     c.readLine();
                     break;
                }    
            case 5:
                {
                   System.out.print("\n");
                   if(DisplayAllStudent())
                   {
                      System.out.print("\nStudentList Is Empty");
                      System.out.print("\nPress Enter key for continue........ : ");
                      c.readLine();
                   }
                    System.out.print("\n");
                  break;
                }
            case 6:
                {
                  System.out.print("\n\n\nExit_________________________________________\n");
                  System.out.print("\n\tThank You For Using StudentList Application\n\n\n\n");
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


/*

           srr[Student.i++] =  new Student(3, "Kumarjit Mongal",20 ,"A");
           srr[Student.i++] =  new Student(2, "Neil Roy",20 ,"A+");
           srr[Student.i++] =  new Student(1, "Manju Mukharjee",20 ,"A++");

           srr[0].DisplayStudent();
 */