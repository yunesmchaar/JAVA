package packg;
import java.util.Arrays;
public class Exmp1 {
   public static void main(String[] args) {
	   double[] tab= {1,2,3,7,8};
	   double[] tab1=new double[10];
	   System.arraycopy(tab,0,tab1,0,tab.length);
	   System.out.println("la taille d'un tableaux :"+tab1.length);
	   System.out.println("System.arraycopy():"+Arrays.toString(tab1));
	   
	   
   }
}
