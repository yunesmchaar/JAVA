package packg;
import java.util.Arrays;
public class exmp2 {
    public static void main(String[] args) {
    	double tab[]= {1,2,3,4,5};
    	double[] tab1=new double[3];
    	System.arraycopy(tab, 0, tab1, 0, tab1.length);
    	System.out.println("System.arraycopy():"+Arrays.toString(tab1));
    }
}
