package java_8_features;

@FunctionalInterface
public interface myinterface{
  int printno(int no);
  default void printanotherno(int no){
    System.out.println("no="+no);
  }
}