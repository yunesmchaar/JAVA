package packg;
import java.util.Arrays;
public class ExmArraysOfRange {
  public static void main(String...args) {
	  int[] tab= {1,7,9,6};
	  int[] tab1=Arrays.copyOfRange(tab,1,4);
	  System.out.println("Arrays.copyOfRange():"+Arrays.toString(tab1));
  }
}
