package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		 int count = scan.nextInt(); // scan the first: total customer

		 String[] nameItem = new String[count];
		 double[] priceItem = new double[count];
		 
		 for(int i = 0; i < count; i++) {
			nameItem[i] = scan.next(); // item name
			priceItem[i] = scan.nextDouble(); // price of item
			
		 }
		 
		int numCus = scan.nextInt(); // number of customer
		
		String[] first = new String[numCus];
		String[] last = new String[numCus];
		
		double sum = 0.00;
		double biggest =0.00;
		double smallest =0.00;
		String bigName= "";
		String smallName= "";
		
		
		for (int j = 0; j < numCus; j++) {
			first[j] = scan.next();
			last[j] = scan.next();
			int numItem = scan.nextInt(); // number of items after the name
			
			int[] cusQuantity = new int[numItem];
			String[] cusItemName = new String[numItem];
			
			for(int k = 0; k < numItem; k++) {
				cusQuantity[k] = scan.nextInt(); // number of each item
				cusItemName[k] = scan.next();// item name
				
			}
			
			double total = 0; // total for each customer
			
			for(int x = 0; x < numItem; x++) {
				for (int  y=0; y < nameItem.length; y++) {
					if (cusItemName[x].equals(nameItem[y])) {
						
						total += cusQuantity[x] * priceItem[y];
						
						break;
					}
				}
				
			}
			
			sum += total;
			
			
			
			if (total < smallest || smallest == 0.0) {
				smallName = first[j] + " " + last[j];
				smallest = total;
			} else if (total > biggest) {
				bigName = first[j] + " " + last[j];
				biggest = total;
			
			
		}
		}
				 System.out.println("Biggest: " + bigName + " (" + String.format("%.2f", ((double)biggest)) + ")");
				 System.out.println("Smallest: " + smallName + " (" + String.format("%.2f", ((double)smallest)) + ")");
				 System.out.println("Average: " + String.format("%.2f", ((double)sum/numCus)));
			
		
		
	}
}
