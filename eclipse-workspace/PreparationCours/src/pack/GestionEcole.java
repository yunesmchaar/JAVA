package pack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class GestionEcole {
	
      class ecole{
    	  public String nomE;
    	  public long NmMatriculation;
    	  List<String> ecol= new ArrayList<>();
    	  public ecole(String Enom,long NmMatriculation) {
    		  this.nomE=Enom;
    		  this.NmMatriculation=NmMatriculation;
    	  }
      class eleve extends ecole{
    	  public String nom;
    	  public String prenom;
    	  public int age;
    	  public eleve(String nom,String prenom,int age) {
    		  super(nomE,NmMatriculation);
    		  this.nom=nom;
    		  this.prenom=prenom;
    		  this.age=age;
    	  }
      }
      }
}
