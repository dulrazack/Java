/*Receiving Input From the user*/
import java.util.Scanner;
public class CodesCracker5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an Integer Value: ");
        int num = scan.nextInt();
        while(num!=0)
            num = scan.nextInt();
        System.out.println("\nProgram Closed!");
    }
}
