package pack;

import java.io.*;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Veuillez entrer 3 phrases :");
            String pTxt = scanner.nextLine();
            String dTxt = scanner.nextLine();
            String tTxt = scanner.nextLine();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Yunes\\eclipse-workspace\\PreparationExamen\\src\\EX1.txt"))) {
                writer.write(pTxt);
                writer.newLine();
                writer.write(dTxt);
                writer.newLine();
                writer.write(tTxt);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Yunes\\eclipse-workspace\\PreparationExamen\\src\\EX1.txt"))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                System.out.println(ligne);
                String[] mots = ligne.split("");
                for(String mot : mots) {
                	System.out.println("Mot: "+mot);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


