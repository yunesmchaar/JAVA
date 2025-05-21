package pack;
import java.util.ArrayList;
import java.util.List;

public class testListe {

	public static void main(String args[]) {
	      List<String> noms = new ArrayList<>();

	        noms.add("Youness");
	        noms.add("Fatima");
	        noms.add("Ali");
            noms.set(1, "Achraf");
            noms.remove(1);
	        System.out.println("Premier nom: " + noms.get(0));

	        for (String nom : noms) {
	            System.out.println("Nom: " + nom);
	        }

	        noms.remove("Ali");
	        System.out.println("Taille après suppression: " + noms.size());
	    }
	}

