package pack;
import java.io.*;
public class exe01 {
      public static void main(String [] args) {
    	  try(BufferedReader newReader=new BufferedReader(new FileReader("C:\\Users\\Yunes\\eclipse-workspace\\PreparationExamen\\src\\file.txt"))){
    		  String ligne;
    		  while((ligne=newReader.readLine())!=null) {
    			  System.out.println(ligne);
    		  }
    	  }catch(IOException e) {
			  e.printStackTrace();
		  }
    		  
    	  }
      }
