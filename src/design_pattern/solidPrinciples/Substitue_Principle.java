package design_pattern.solidPrinciples;
public class Substitue_Principle
{
  // maybe conform to ++
  static void useIt(Rectangle r)
  {
    int width = r.getWidth();
    r.setHeight(10);
//    System.out.println("width*height="+width*r.getHeight());
    System.out.println("Expected area of " + (width*10) + ", got " + r.getArea());
  }

  public static void main(String[] args) {
    Rectangle rc = new Rectangle(2, 3);
    useIt(rc);

    Rectangle sq = new Square(5);
    useIt(sq);

    
    //optimization for resolution
    
    
       sq.setHeight(5);
       sq.setWidth(10);
       useIt(sq);
  }
}