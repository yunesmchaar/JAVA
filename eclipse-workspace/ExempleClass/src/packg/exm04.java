package packg;
import java.util.Scanner;
import java.util.Arrays;
public class exm04 {
	public static void main(String ... args) {
		final int N=10;
		int[] tab=new int[N];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<tab.length;i++) {
			System.out.println("Entrez un valeur:");
			int nb = scanner.nextInt();
			tab[i]=nb;
		}
		for(int i=0;i<tab.length;i++) {
			System.out.println("T["+i+"]="+tab[i]);
		}
		int[] tab1=Arrays.copyOf(tab,5);
		System.out.println("nouv tab creer:"+Arrays.toString(tab1));
		
		
		
	}

}
