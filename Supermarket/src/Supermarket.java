/**
 * You should implement a supermarket checkout which:
 *
 * always accepts a string of items and gives back the total price
 * discounts any offers from the total price
 * Use the following pricing information:
 * Item	Price	Offer
 * A	      50	3 for 130
 * B	      30	2 for 37
 * C	      20	N/A
 * D	      10	N/A
 */
public class Supermarket {

    public static int getCheckout(String items) {
        int a = 50;
        int b = 30;
        int c = 20;
        int d = 10;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int sum = 0;
        int offerA = 130;
        int offerB = 37;

        for(int z = 0;z <= items.length() - 1; z++) {
            char item = items.charAt(z);
            if (item == 'a' || item == 'A') {
                countA += 1;
            } else if (item == 'b' || item == 'B') {
                countB += 1;
            } else if (item == 'c' || item == 'C') {
                countC += 1;
            } else if (item == 'd' || item == 'D') {
                countD += 1;
            }

        }
        for (int i = 0;i <= items.length() - 1 ;i++) {
            if (countA > 0) { //check if a is present
                 for (int j = 1;j <= countA; j++) {
                     if(j % 3 == 0) { // if the number is divisible by 3 apply the offer
                         sum += offerA;
                         countA -= 3; // after offer is applied, remove 3 from the count
                     } else if (countA < 3) {
                         sum += countA * a;
                         countA = 0; // set to zero so that the loop goes beyond here
                         break;
                        }
                 }
            }
            if (countB > 0) { //check if b is present
                for (int k = 1;k <= countB; k++) {
                    if (k % 2 == 0) { // if the number is divisible by 2 apply the offer
                        sum += offerB;
                        countB -= 2; // after offer is applied, remove 2 from the count
                    } else if(countB < 2) {
                        sum += countB * b;
                        countB = 0;
                        break;
                    }
                }
            }
            if (countC > 0 || countD > 0) {
                sum += (countC * c) + (countD * d);
                break;
            } else {
                System.out.println("No items");
            }
        }
        return sum;
    }
}
