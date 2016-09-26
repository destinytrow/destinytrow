import java.util.Scanner;
public class finished
{
    public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    float max = 0;
    float min = 0;
    float ave = 0;
    int count = 0;
    boolean Continue = true;
 
     do {
            if (Continue = false){
                      System.exit(0);
                    } else {
                 System.out.println("enter a number");
                 float num = input.nextFloat();
                  max = num + max ;
                  System.out.println("The maximum is " + max);
                  min = num - max ;
                  System.out.println("The minimum is" + min);
                  count = count + 1;
                  ave = max / count ;
                  System.out.println("The average is " + ave);
                  System.out.println("Would you like to continue? (true/false)");
                  Continue = input.nextBoolean(); 
                }
            }while (Continue != (false));

}
}
       
    
        
    

