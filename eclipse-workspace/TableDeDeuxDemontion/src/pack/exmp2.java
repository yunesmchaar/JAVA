package pack;
import java.util.Scanner;
public class exmp2 {
	public static void main(String[] args) {
		int lignes=2;
		int colonnes=3;
		Scanner scanner=new Scanner(System.in);
		double[][] tab=new double[lignes][colonnes];
		
		for(int i=0;i<lignes;i++) {
			for(int j=0;j<colonnes;j++) {
				System.out.print("Entrez la valeur pour tableau:tab["+i+"]["+j+"]=");
				tab[i][j]=scanner.nextDouble();				
			}
		}
		for(int i=0;i<lignes;i++) {
			for(int j=0;j<colonnes;j++) {
				System.out.print(tab[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
