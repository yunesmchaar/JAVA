package packg;
import java.util.Scanner;

public class tp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = 10;
        int[] tab1 = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Entrez une valeur : ");
            int nb = scanner.nextInt();
            tab1[i] = nb;
        }

        scanner.close();

        System.out.println("Voici les valeurs que vous avez entrées :");
        for (int i = N-1; i >=0; i--) {
            System.out.println("tab1[" + i + "] = " + tab1[i]);
        }
        int somme=0;
        for(int i=0;i<N;i++) {
        	somme +=tab1[i];
        }
        System.out.println("la somme des elements tab:"+somme);
        int min =0;
        for(int i=0;i<N;i++) {
        	if(min>tab1[i]) {
        		min=tab1[i];
        	}else {
        		i++;
        	}
        }
        System.out.println("le minimum de tableaux est:");
    }
}

