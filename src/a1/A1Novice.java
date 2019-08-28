package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		
		 int count = scan.nextInt(); // scan the first: total customer
	
		
		String[] first = new String[count]; // store first name as a String to be retrieved by the next for-loop.  "count" int-variable to refer to which # of customer
		String[] last = new String[count]; //store last name as a String to be retrieved by the next for-loop
		for(int i =0; i<count; i++) {  // loop the first, last, and "total number of items bought by customers" to be retrieved by the next for-loop
			first[i]  = scan.next();  // scan the first name of customer
			last[i] = scan.next();  // scan the last name of customer
			int totnum = scan.nextInt();  // scan the "total number of items bought by customers"
			
			int[] numbought = new int[totnum]; // store the number of items bought by i (the first customer, the second customer etc.) customer
			String[] itemname = new String[totnum]; // store the 'items names' to be retrieved by the next for-loop
			double[] itemCost = new double[totnum]; //  store the 'item cost' to be retrieved by the next for-loop
			
			for(int e = 0; e < totnum; e++) { // go into the item cost (known as 'totnum') to get the 'numbought' 'itemname' and 'itemcost'
				numbought[e] = scan.nextInt(); //scan the 'number of items bought by customer' (# of orange bought) as an integer
				itemname[e] = scan.next();  // scan the 'item name' as a integer
				itemCost[e] = scan.nextDouble();  // scan the store the 'item cost' as a double to be retrieved by the for-loop
				
			}
			//outside of the second forloop to retrieve data
			double sum = 0; // double sum as a variable..
			
			for(int e = 0; e < totnum; e++) {
				sum = numbought[e] * itemCost[e] + sum; // get the total sum of the cost for customer 'e'
			}
			
				
			char f = first[i].charAt(0);
				System.out.println(f + ". " + last[i] + ": " + String.format("%.2f", ((double)sum)));

			
				
			}
		
		}
	}
	
	
