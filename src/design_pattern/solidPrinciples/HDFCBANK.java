package design_pattern.solidPrinciples;

public class HDFCBANK extends Bank{
    @Override
    int rateOfInterest() {
        System.out.println("hdfc roi");
        return super.rateOfInterest();
    }
}
