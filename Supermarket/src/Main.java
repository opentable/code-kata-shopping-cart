public class Main {
    public static void main(String[] args) {
        System.out.println(Supermarket.getCheckout("aaac"));
        System.out.println(Supermarket.getCheckout("abcd"));
        System.out.println(Supermarket.getCheckout("bAcc"));
        System.out.println(Supermarket.getCheckout("aaBc"));
        System.out.println(Supermarket.getCheckout("adcaa"));
        System.out.println(Supermarket.getCheckout("bbbc")); // it looks than when the offer b is applied then it does not apply the normal cost if any extra are present
    }
}
