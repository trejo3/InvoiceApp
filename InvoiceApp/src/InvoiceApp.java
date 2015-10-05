import java.util.Scanner;
import java.util.Arrays;

public class InvoiceApp 
{
	public static void main(String[] args)
	{
		Double taxRate, price, subtotal, tax, grandTotal;
		Double[] prices;
		int count, i;
		
		count = 1;
		prices = new Double[100];
		subtotal = 0.0;
		tax = 0.0;
		grandTotal = 0.0;
		price = 0.1;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Tax rate?: ");
		taxRate = keyboard.nextDouble();

			
		do
		{
			System.out.println("Price #" + count + ": ");
			price = keyboard.nextDouble();
			
			prices[count] = price;
			
			subtotal += price;
			
			
			count++;
		} while (price != 0.0);
		
		tax = subtotal*taxRate;
		grandTotal = subtotal + tax;
		
		
		System.out.println("Receipt");
				
		
		for (i=1; i < count - 1; i++)
		{
			System.out.println(prices[i]);		
		}
		
		System.out.println(" ");
		
		System.out.println(subtotal + "  subtotal");
		System.out.println(tax + "  tax");
		System.out.println(grandTotal + "  grand total");
	
		keyboard.close();
	}
	
}
