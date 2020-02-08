package testsForSolution;
import mainSolution.checkoutKata;

public class program {
	public static void main(String[] args){
		// Test to check if the price calculation is correct or not.
		// For 2 quantities of A, 1 quantity of item B and 1 quantity of item D
		// the total price should be 140.0. Test to check this.
		checkoutKata ck = new checkoutKata();
		ck.addItem("A", 2);
		ck.addItem("B", 1);
		ck.addItem("D", 1);
		if(ck.calculateTotalPrice(ck.itemsListMap) == 140.0) System.out.println("Passed");
		else System.out.println("Failed");
		
		// For 4 quantities of item B the total price should be 74.0 
		// The 2 quantities of A and 1 quantity of D are removed. Test to check this.
		try {
			ck.removeItem("A", 2);
                        ck.removeItem("D", 1);
                        ck.addItem("B", 3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ck.calculateTotalPrice(ck.itemsListMap) == 74.0) System.out.println("Passed");
		else System.out.println("Failed");
		
	}
}