package design_pattern.solidPrinciples;

public class ICICIBANK extends Bank{
    @Override
    int rateOfInterest() {
        System.out.println("icici roi");
        return super.rateOfInterest();
    }
}
