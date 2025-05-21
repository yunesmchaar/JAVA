package packg;

public class InverserTableau {
	public static double[] inverserTableu(double[] table) {
		double tab[]=new double[table.length];
		for(int i=table.length-1;i>=0;i--) {
			tab[i]=table[table.length-1-i];
		}
		return tab;
	}
	public static void main(String[] args) {
		double[] tab= {1,5,8,9,10,12,18,19};
		double[] invr=inverserTableu(tab);
		for(double val:invr) {
			System.out.print("aore anverse :"+val+"");
		}
	}

}

