package packg;
import java.util.Scanner;
public class TestCours {
	public static void main(String[] args) {
	final int N=10;
	Scanner scanner=new Scanner(System.in);
	double tab1[]=new double[N];
	for(int i=0;i<tab1.length;i++) {
		System.out.println("Entrez un valeur:");
		double nb=scanner.nextDouble();
		tab1[i]=nb;
	}
	for(int i=0;i<tab1.length;i++) {
		System.out.println("******** element  Numero "+i+"**********");
		System.out.println("T["+i+"]="+tab1[i]);
	}
	
	
	}
}
