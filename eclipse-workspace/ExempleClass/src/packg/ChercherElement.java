package packg;
import java.util.Scanner;
public class ChercherElement {
   public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   final int N=5;
	   double[] tab=new double[N];
	   for(int i=0;i<tab.length;i++) {
		   System.out.println("Entrez des valeurs:");
		   double nb=scanner.nextDouble();
		   tab[i]=nb;
	   }
	   System.out.println("Entrez l'element qui chercher:");
	   int nbr=scanner.nextInt();
	   int val=0;
	    for(int i=0;i<tab.length;i++) {
	    	if(tab[i]==nbr) {
	    		val++;
	    	}
	    }
	    if(val>0) {
	    	System.out.println("Votre valeur("+nbr+")  existe dans la liste");
	    }else {
	    	System.out.println("Votre valeur("+nbr+") n'existe pas dans la liste ");
	    }
	    scanner.close();
   }
}
