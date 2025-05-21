package packg;

public class exm02 {
	        final int N = 4;
	        int[][] tabTriangulaire = new int[N][];

	        // Initialisation des lignes : chaque ligne i a i+1 éléments
	        for (int i = 0; i < N; i++) {
	            tabTriangulaire[i] = new int[i + 1]; // ligne i a i+1 colonnes
	        }

	        // Remplissage avec des valeurs (par exemple, avec i+j)
	        for (int i = 0; i < tabTriangulaire.length; i++) {
	            for (int j = 0; j < tabTriangulaire[i].length; j++) {
	                tabTriangulaire[i][j] = i + j;
	            }
	        }

	        // Affichage
	        for (int i = 0; i < tabTriangulaire.length; i++) {
	            for (int j = 0; j < tabTriangulaire[i].length; j++) {
	                System.out.print(tabTriangulaire[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}