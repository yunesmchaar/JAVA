package interfaces.formesGeometriques;

import interfaces.formesGeometriques.formes2.TriangleCarre;
import interfaces.formesGeometriques.formes1.*;

public class TestPackages {
    public static void main(String[] args) {
        // Création d’un tableau de formes
        FormesGeometriques[] tabForme = new FormesGeometriques[2];

        // Initialisation des différentes formes
        tabForme[0] = new Rectangle(10, 20);
        tabForme[1] = new TriangleCarre(3, 4, 5);

        // Affichage des surfaces de chaque forme
        for (int i = 0; i < tabForme.length; i++) {
            System.out.println("Surface de la forme " + (i + 1) + " : " + tabForme[i].surface());
        }
    }
}
