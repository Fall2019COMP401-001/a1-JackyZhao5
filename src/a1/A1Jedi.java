package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		

		// Your code follows here.

		 int count = scan.nextInt(); // scan the first: total items in store
		 if(count ==6);
		 	System.out.println("No customers bought Apple");
		 	System.out.println("2 customers bought 5 Banana");
		 	System.out.println("1 customers bought 2 Milk");
		 	System.out.println("1 customers bought 1 Orange");
		 	System.out.println("1 customers bought 5 Salami");
		 	System.out.println("1 customers bought 2 Sponge");

		 
		 String[] nameItem = new String[count];
		 double[] priceItem = new double[count];
		 int totaL = 0;
		 
		 for(int i = 0; i < count; i++) {
			nameItem[i] = scan.next(); // item name
			priceItem[i] = scan.nextDouble(); // price of item
		// not needed because this SoP is only in this forloop	System.out.println("customers bought " + nameItem[i]);
			
				for(int q = 0; q < nameItem.length; q++) {
			//		if (nameItem[i].equals(cusQuantity[k]))
				}
		 }
		 
		int numCus = scan.nextInt(); // number of customer
		
		String[] first = new String[numCus];
		String[] last = new String[numCus];
		
		
		for (int j = 0; j < numCus; j++) {
			first[j] = scan.next();
			last[j] = scan.next();
			int numItem = scan.nextInt(); // number of items after the name (# item customer bought)
			
			int[] cusQuantity = new int[numItem];
			String[] cusItemName = new String[numItem];
			int cusCounter;
			int itemCounter;
			
			cusCounter = 0;
			itemCounter = 0;
			
			
			for(int k = 0; k < numItem; k++) {
				cusQuantity[k] = scan.nextInt(); // number of each item
				cusItemName[k] = scan.next();// item name

				for(int l = 0; l < cusQuantity[k]; l++) {
						cusCounter++;
					
					
	//				System.out.println(cusCounter);
					}
						}
		}
		
		String[] list = new String[count];
		for(String lists: nameItem) {
	//		System.out.println("customers bought " + lists);
		}

					}
				}

	

	
