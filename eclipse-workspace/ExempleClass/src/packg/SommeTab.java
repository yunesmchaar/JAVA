package packg;

public class SommeTab {
	
 public static double somme(double[] tableau) {
	 double som=0;
	 for(int i=0;i<tableau.length;i++) {
		 som+=tableau[i];
	 }
	 return som;
 }
 public static void main(String...args) {
	 double[] tab= {1,1,1,1,1,1};
	 System.out.println("la somme des elements d'un tableaux est:"+somme(tab));
	 
 }
}
