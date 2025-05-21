package pack;

public class exm1 {
    public static void main(String[] args) {
        double[][] tab = new double[3][];
        tab[0] = new double[2];
        tab[1] = new double[3];
        tab[2] = new double[4];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i * j;
                System.out.println("tab[" + i + "][" + j + "] = " + tab[i][j]);
            }
        }
    }
}

