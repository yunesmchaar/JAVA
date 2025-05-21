package packg;
import java.util.Scanner;
public class CalculerMoyenne {
	public static double Moyenne(double[] table) {
		double somme=0;
		for(int i=0;i<table.length;i++) {
			somme+=table[i];
		}
		
		return somme/table.length;
	}
	public static void main(String[] args) {
	    final int N=5;
        Scanner scanner=new Scanner(System.in);
        double[] tab=new double[N];
        for(int i=0;i<tab.length;i++) {
	        System.out.println("Entrez des valeurs:");
	        double nb=scanner.nextDouble();
	         tab[i]=nb;
  }
        System.out.println("la Moyenne d'un votre tableau:"+Moyenne(tab));
        
	}
}
