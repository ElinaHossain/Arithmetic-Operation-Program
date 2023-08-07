import java.util.Scanner;

public class AOP
{
     public static void main(String[] args) 
     {
          //Storage
          Scanner input = new Scanner(System.in);

          //Input Name
          System.out.print("Enter your name: ");
          String name = input.nextLine();

          //Error Checking Name
          if(name.isEmpty()) 
          {
               System.out.println("Error: the name cannot be empty.");
               return;
          }
          //Input Number
          System.out.print("Enter an integer between 10 and 30: ");

          //Error Checking Number
          if(!input.hasNextInt()) 
          {
               System.out.println("Error: the number must be an integer.");
               return;
          }
          int number = input.nextInt();
          input.nextLine();
          if(number < 10 || number > 30)
          {
               System.out.print("Error: the number must be between 10 and 30.");
               return;
          }
          //Input Floating Point
          System.out.print("Enter a floating point number between 0.44 and 0.66: ");

          //Error Checking Floating Point
          if(!input.hasNextDouble())
          {
               System.out.println("Error: the number must be a floating point number.");
               return;
          }
          double fraction = input.nextDouble();
          input.nextLine();
          if(fraction < 0.44 || fraction > 0.66)
          {
               System.out.print("Error: the fraction must be in between 0.44 and 0.66");
               return;
          }

          //Calculation
          final int CONSTANT = 2;
          double result = 0.0;

          //First Operator 
          String firstOperator = "";
          if (number == 30)
          {
               firstOperator = "+";
          }
          else if (number >= 25 && number <= 29)
          {
               firstOperator = "-";
          }
          else if (number >= 20 && number <= 24)
          {
               firstOperator = "/";
          }
          else if (number >= 10 && number <= 19)
          {
               firstOperator = "%";
          }

          //Second Operator
          String secondOperator = "";
          if (fraction > 0.55 && fraction <= 0.66)
          {
               secondOperator = "*";
          }
          else if (fraction >= 0.44 && fraction <= 0.55)
          {
               secondOperator = "/";
          }

          //Calculating Result
          if (firstOperator.equals("+"))
          {
               result = (number + CONSTANT);
          }
          else if (firstOperator.equals("-"))
          {
               result = (number - CONSTANT);
          }
          else if (firstOperator.equals("/"))
          {
               result = (number / CONSTANT);
          }
          else if (firstOperator.equals("%"))
          {
               result = (number % CONSTANT);
          }

          //Output
          System.out.println("Hello " + name + "! The result is " + result + ".");

          if (name.equalsIgnoreCase ("bob")) 
          {
               System.out.println("How cool! My grandpa's name is also " + name + "!");
          }

     }
    
}

