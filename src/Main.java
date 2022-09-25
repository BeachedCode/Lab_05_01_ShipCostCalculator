public class Main
{
    public static void main(String[] args)
    {
        double itemPrice = 50;

        if (itemPrice >= 100)
        {
            System.out.println("Shipping Cost: $0.00");
            System.out.println("Total Price: $" + itemPrice);
        }
        else
        {
            double itemTax = itemPrice * 0.02;
            double totalPrice = itemPrice + itemTax;
            System.out.println("Shipping Costs: $" + itemTax);
            System.out.println("Total Cost: $" + totalPrice);
        }
    }
}
