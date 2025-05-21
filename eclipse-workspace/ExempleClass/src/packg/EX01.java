package packg;
import java.util.Arrays;
public class EX01 {
	public static void main(String ...args) {
		int[] tab= {10,20,30,40,50};
		int[] supTab1= {1,2,3};
		int[] supTab2= {4,5,6};
		int[] data = {7,8,9};
		int[] supTab=new int[supTab1.length+supTab2.length];
		//tableaux de exercice 1
		int[] tab1= new int[tab.length];
		//tableaux de exercice 2
		int[] tab2=Arrays.copyOf(tab, 3);
		//tableau de exercice 3
		int[] tab3=Arrays.copyOfRange(tab, 1, 4);
		//preparation de la table 1
		System.arraycopy(tab, 0, tab1, 0, tab.length);
		System.out.println("les elements copy dans le tableaux sont:"+Arrays.toString(tab1));
        //preparation de la table 2
		System.out.println("Top 3 scores :"+Arrays.toString(tab2));
		//preparation de la table 3
		System.out.println("top scores entre 1 et 4:"+Arrays.toString(tab3));
        //un programmation qui prend deux tableaux
		System.arraycopy(supTab1, 0, supTab, 0, supTab1.length);
		System.arraycopy(supTab2, 0, supTab, supTab1.length, supTab2.length);
		System.out.println("resultat:"+Arrays.toString(supTab));
		//creer une nouvelle version du tableau avec 5 elements
		int[] nouvTab=Arrays.copyOf(data, 5);
		System.out.println("nouvelle tableau:"+Arrays.toString(nouvTab));
		
	}

}
