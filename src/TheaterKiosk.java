import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        int age = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = input.nextInt();

        if (age >= 21)
        {
            System.out.println("You get a wristband!");
        }
        else
        {
            System.exit(0);
        }
    }
}