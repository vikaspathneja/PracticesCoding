package design_pattern.solidPrinciples;

public class BankUser {
    public static void main(String[] args) {
        Bank b=new HDFCBANK();
        System.out.println(b.rateOfInterest());
    }
}
