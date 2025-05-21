package packg;
import java.util.Arrays;
public class FusionnerDeuxTable {
	public static int[] FusionnerTable(int[] table1,int[] table2) {
		int[] table=new int[table1.length+table2.length];
		System.arraycopy(table1, 0, table, 0, table1.length);
		System.arraycopy(table2, 0, table, table1.length, table2.length);
		return table;
	}
	public static void main(String[] args) {
		int[] tab1= {1,2,3};
		int[] tab2= {4,5,6,7,8,9,0};
		int[] tab=FusionnerTable(tab1,tab2);
		
			System.out.println("table est:"+Arrays.toString(tab));
	}

}
