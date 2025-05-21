package packg;

public class EX11 {

public static int trouverMax(int[] tab) {
		int Max=tab[0];
	for(int i=1;i<tab.length;i++) {
	   if(tab[i]>=Max) {
		   Max=tab[i];   
		   }
	   }
	return Max;	
}
public static void main(String...args) {
	int[] tab= {1,9,7,9,0,3,5};
	//la methode foreach
	for(int t:tab) {
		System.out.println(t);
	}
	//miantennent je chercher le Maximum d'un Element dans le tableaux
	int max=trouverMax(tab);
	System.out.println("le maximum d'un tableau est:"+max);

}
}
