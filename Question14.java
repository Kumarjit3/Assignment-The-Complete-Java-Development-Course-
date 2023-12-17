
class Calculator
{
    public void Add(int a,int b)
    {
       System.out.print("\nAddition of "+a+" and "+b+" is = "+(a+b)+"\n");
    }

    public void Sub(int a,int b)
    {
       System.out.print("\nSubtraction of "+a+" and "+b+" is = "+(a-b)+"\n");
    }

    public void Mul(int a,int b)
    {
       System.out.print("\nMultiplication of "+a+" and "+b+" is = "+(a*b)+"\n");
    }
   
    public void Div(int a,int b)
    {
      try
      {
         System.out.print("\nAddition of "+a+" and "+b+" is = "+(a/b)+"\n");
      }
      catch(ArithmeticException e)
      {
         System.out.print("\n");
         e.printStackTrace();
         System.out.print("\nDivided by zero exception\n");
      }
    }
}

public class Question14 
{
    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();

        c1.Add(1, 20);
        c1.Sub(2, 40);
        c1.Mul(1, 3);
        c1.Div(30, 0);
    }
}
