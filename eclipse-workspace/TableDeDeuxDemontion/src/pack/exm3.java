package pack;

public class exm3 {
	public static void main(String[] args) {

	double[][] matrice = new double[3][5];
	for(int i=0; i < 3; i++) {
		for(int j=0;j<5;j++) {
			matrice[i][j]=i*j;
		}
	}
	double somme=0;
	for(double[] tab:matrice) {
		for(double val:tab) {
			somme+=val;
		}
	}
	System.out.print("la somme="+somme);
}
}