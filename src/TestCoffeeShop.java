import java.util.Scanner;
public class TestCoffeeShop
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        CoffeeShop myCoffeeShop = new CoffeeShop();
        System.out.print ("How many cups of coffee would you like? ");
        int cupsOfCoffee = input.nextInt();
        myCoffeeShop.calcBill(cupsOfCoffee);
        System.out.printf ("You owe $%.2f", myCoffeeShop.getBill());
    }
}