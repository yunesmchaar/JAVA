package pack;
import java.util.Scanner;
public class Etudiant {
      protected String nom;
      protected String prenom;
      protected double age;
      protected int nb;
      protected double somme;
      Scanner scanner=new Scanner(System.in);
      public Etudiant(String nom,String prenom,double age,int nb) {
    	  this.nom=nom;
    	  this.prenom=prenom;
    	  this.age=age;
    	  this.nb=nb;
      }
      public void CalculerSomme() {
    	   somme=0;
    	  for(int i=1;i<=nb;i++) {
    		  System.out.println("Entrez la note de matiare numero "+i);
    		  double note=scanner.nextDouble();
    		  somme+=note;
    	  }
    	  
      }
      public void afficherInfo() {
    	  System.out.println("----------------------------------------------------------");
    	  System.out.println("|L'Etudiante de ?|");
    	  System.out.println("----------------------------------------------------------");
    	  System.out.println("|Nom :           |"+nom);
    	  System.out.println("|Prenom:         |"+prenom);
    	  System.out.println("|Age:            |"+age);
    	  System.out.println("----------------------------------------------------------");
    	  System.out.println("|Moyenne:            |"+somme/nb);
      }

public static void main(String args[]) {
	int nbB;
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Entrez le nombre de matiere:");
	Etudiant ET=new Etudiant("youness","mchaar",24,4);
	ET.CalculerSomme();
	ET.afficherInfo();
}
}

