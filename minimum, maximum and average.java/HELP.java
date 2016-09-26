import java.util.Scanner;
public class HELP
{
    public static void main(String[] args)
    {
   Scanner input = new Scanner(System.in);
   String cont = ("yes");
   int total = 0;
   while (cont == ("yes")){
           System.out.println("do you want to continue?");
           cont = input.nextLine();
           System.out.println("Enter your first number");
           int number = input.nextInt();
           total = total + number;
          System.out.println(total);
      }
    }
}
            