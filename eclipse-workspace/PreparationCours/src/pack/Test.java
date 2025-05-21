package pack;
import java.util.Scanner;
public class Test {
	
 public static void main(String args[]) {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Entrez un nombre:");
	 int nb=scanner.nextInt();
	 double fac=1;
	 for(int i=1;i<=nb;i++) {
        fac=fac*i;		 
	 }
	 System.out.println("le facterielle de "+nb+"est:"+fac);
 }
}
