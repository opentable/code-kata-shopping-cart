/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainSolution;

public class program {
	public static void main(String[] args) {
		checkoutKata ck = new checkoutKata();
		
		// When the cart is empty check the contents
		// This should throw an exception because the cart is empty
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
		
		// Here you add 3 quantities of item A
		// and then print the total price and also review the cart
		System.out.println("");
		ck.addItem("A", 3);
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice);
		
		
		// Here you add 2 quantities of item B to the existing cart
		// and then print the total price and also review the cart
		System.out.println("");
		ck.addItem("B", 2);
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice2 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice2);
		
		
		// Here you add 4 quantities of item C to the existing cart
		// and then print the total price and also review the cart
		System.out.println("");
		ck.addItem("C", 4);
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice3 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice3);
		
		
		// Here you remove 2 quantities of item B from the existing cart
		// and then print the total price and also review the cart
		System.out.println("");
		try {
			ck.removeItem("B", 2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.toString());
		}
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice4 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice4);
		
		
		// Here you remove 1 quantity of item A from the existing cart
		// and then print the total price and also review the cart
		System.out.println("");
		try {
			ck.removeItem("A", 1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.toString());
		}
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice5 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice5);
		
		
		// Here you empty your cart and then review 
		// the total price and content of the cart
		System.out.println("");
		ck.emptyCart();
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice6 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice6);
		
		
		// Add item A again with quantity of 4 and review the price and content of the cart
		System.out.println("");
		ck.addItem("A", 4);
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice7 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice7);
                
                // Add item B with quantity of 4 and review the price and content of the cart
                System.out.println("");
		ck.addItem("B", 4);
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice8 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice8);
                
	}
}