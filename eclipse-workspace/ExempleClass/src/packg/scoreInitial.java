package packg;

public class scoreInitial {
    
    public static void main(String[] args) {
        int[] tab = scoreInitial();  // Appel correct à la méthode

        System.out.println("Affichage d'un tableau :");
        afficheTableau(tab);        // Appel à la bonne méthode
    }

    public static int[] scoreInitial() {
        int[] score = {1, 8, 9, 10, 99};
        return score;
    }

    public static void afficheTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("T[" + i + "] = " + tableau[i]);
        }
    }
}

