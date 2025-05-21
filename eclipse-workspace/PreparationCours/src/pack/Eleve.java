package pack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Eleve {
       protected String nom;
       protected String prenom;
       protected long NumInscription;
       protected int nb;
       protected double somme;
       protected double note;
       Scanner scanner=new Scanner(System.in);
       List<Double> Notes= new ArrayList<>();
       public Eleve(String nom,String prenom,long NumInscription) {
    	   this.nom=nom;
    	   this.prenom=prenom;
    	   this.NumInscription=NumInscription;
       }
       public String getNom(String nom) {
    	   return nom;
       }
       public String getPrenom(String prenom) {
    	   return prenom;
       }
       public long getNumInscription(long NumInscription) {
    	   return NumInscription ;
       }
       public void ajouterNotes() {
    	   System.out.println("Entrez les nombres des Notes:");
    	   nb=scanner.nextInt();
    	   for(int i=1;i<=nb;i++) {
    	do {
    	   System.out.println("Entrez la note numero "+i+":");
    	    note=scanner.nextDouble();
    		   }while(note<0 || note>20 );
    	Notes.add(note);
    	   }   
       }
       public double CalculMoyenne() {
    	   somme=0;
    	   for(double Note:Notes) {
    		   somme+=Note;
    	   }
    	   return somme/nb;
       }
       public void afficherMoyenneEleve() {
    	   System.out.println("le Moyenne :"+CalculMoyenne());
       }
       public void afficherInfoEleve() {
    	   System.out.println("**********************Eleve********************************");
    	   System.out.println("Nom:"+nom);
    	   System.out.println("Prenom:"+prenom);
    	   System.out.println("Numero Inscription:"+NumInscription);
    	   afficherMoyenneEleve();
       }
       public void afficherListeDesNotes() {
    	   int i=0;
    	   System.out.println("---------------------les Notes sont-----------------------------------");
    	   for(double note:Notes) {
    		   System.out.println("Numero "+i+":"+note);
    		   i+=1;
    	   }
       }
public static void main(String args[]) {
	Eleve el=new Eleve("Youness","mch",1234567);
	el.ajouterNotes();
	el.CalculMoyenne();
	el.afficherInfoEleve();
	el.afficherListeDesNotes();
}
       
}
