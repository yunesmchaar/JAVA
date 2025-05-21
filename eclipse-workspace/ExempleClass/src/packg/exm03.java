package packg;
import java.util.Arrays;
public class exm03 {
  public static void main(String ... args) {
	  int[] tab= {1,9,5,10,17,20};
	  int[] tab1=Arrays.copyOf(tab, 2);
	  System.out.println("Arrays.copy():"+Arrays.toString(tab1));
  }
}
