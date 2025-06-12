package pack;
import java.io.*;
public class exe02 {
     public static void main(String [] args) {
    	 try(BufferedWriter WFile=new BufferedWriter(new FileWriter("C:\\Users\\Yunes\\eclipse-workspace\\PreparationExamen\\src\\file.txt"))){
    		 WFile.write("je suis mchaar youness");
    		 WFile.newLine();
    		 WFile.write("Bonjour,je suis dans un cafe");
    	 }catch (IOException e) {
    		 e.printStackTrace();
    	 }
         try(BufferedReader RFile=new BufferedReader(new FileReader("C:\\Users\\Yunes\\eclipse-workspace\\PreparationExamen\\src\\file.txt"))){
        	 
        	 String ligne;
        	 while((ligne=RFile.readLine())!=null) {
        		 System.out.println(ligne);
        	 }
        	 
         }catch (IOException e) {
        	 e.printStackTrace();
         } 	 
     }
}
