package pack;
import java.util.Random;
public class exe03 {
      public static void main(String [] args) {
    	  Random rn=new Random();
    	  System.out.println("Entier aleatoire:"+rn.nextInt());
    	  System.out.println("Entier entre 0 et 9:"+rn.nextInt(10));
    	  System.out.println("Float:"+rn.nextFloat());
    	  System.out.println("Double:"+rn.nextDouble());
    	  System.out.println("Booleen:"+rn.nextBoolean());
      }
}
