package pack;

public class testHeritage {
     public class ecole{
    	 protected String nomE;
    	 protected String NumMatriculation;
    	 public ecole(String nomE,String NumMatriculation) {
    		 this.nomE=nomE;
    		 this.NumMatriculation=NumMatriculation;
    	 }
     }
     public class eleve extends ecole{
    	protected String nom;
    	protected String prenom;
    	public long NumInscription;
    	
    	public eleve(String nomE,String nom,String prenom,long NumInscription) {
    		super(nomE);
    		this.nom=nom;
    		this.prenom=prenom;
    		this.NumInscription=NumInscription;
    	}
     }
}
