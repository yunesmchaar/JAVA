/*
 * Exercice
 Dans une classe, il y a 5 étudiants, chacun ayant des notes dans cinq modules.
 1. Générer aléatoirement 25 notes (comprises entre 0 et 20) et les enregistrer dans un fichier texte 
nommé Notes.txt. Chaque ligne du fichier représente un étudiant, et chaque colonne correspond à un 
module.
 2. Ensuite, lire ces notes à partir du fichier Notes.txt dans un programme principal et calculer la moyenne 
de chaque étudiant.
 */
package pack;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class EX02 {
	public static void main(String [] args) {
		 int nb=5;
		 Random rn=new Random();
		   try(BufferedWriter File=new BufferedWriter(new FileWriter("C:\\Users\\Yunes\\eclipse-workspace\\PreparationExamen\\src\\Notes.txt"))){
			  try(Scanner scanner=new Scanner(System.in)){
			   System.out.println("Veuillez entrer 5 Etudiants: :");
			   for(int i=1;i<=nb;i++) {
				   System.out.print("nom de l'etudiant("+i+"):");
				   String nom=scanner.nextLine();
				   int note=rn.nextInt(21);
				   File.write("Nom:"+nom+" | "+"Note:"+note);
				   File.newLine();
			   }
			   }
		   }catch(IOException e) {
			   e.printStackTrace();
		   }
		   try(BufferedReader file=new BufferedReader(new FileReader("C:\\Users\\Yunes\\eclipse-workspace\\PreparationExamen\\src\\Notes.txt"))){
			   String ligne;
	            int total = 0;
	            int compteur = 0;

	            System.out.println("Contenu du fichier :");
	            while ((ligne = file.readLine()) != null) {
	                System.out.println(ligne);

	                // Trouver "Note:" et lire la valeur après
	                int indexNote = ligne.indexOf("Note:");
	                if (indexNote != -1) {
	                    String noteStr = ligne.substring(indexNote + 5).trim(); // après "Note:"
	                    int note = Integer.parseInt(noteStr);
	                    total += note;
	                    compteur++;
	                }
	            }

	            if (compteur > 0) {
	                double moyenne = total / (double) compteur;
	                System.out.printf("Moyenne des notes : %.2f\n", moyenne);
	            } else {
	                System.out.println("Aucune note trouvée.");
	            }
			   }catch(IOException e) {
			   e.printStackTrace();
		   }
		
	}

}
