import java.util.Scanner;
public class Remainder 
{
    public static void main(String[] args)
    {
   Scanner input = new Scanner(System.in);
   
    do  { 
        System.out.println("please enter a number or enter a letter to leave");
        String Number = input.nextLine();
        String  Number1 = Number ;
        String  PreviousNumber = Number + Number1;
        String  Sum = Number + PreviousNumber;
        System.out.println("The sum of your numbers is " + Sum);
        String count = count + 1;
    } while(Sum.equals (100));
}
}


