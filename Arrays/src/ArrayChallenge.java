import java.lang.reflect.Array;
import java.util.Scanner;
public class ArrayChallenge {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int [] myIntegers = getIntegers(5);
		for(int i=0; i<myIntegers.length; i++) {
			System.out.println("Element "+ i +" type value was "+ myIntegers[i]);
		}
		int[] sorted= sortIntegers(myIntegers);
		printArray(sorted);

	}
//	public static void assignNumbers() {
//		System.out.println("Enter ");
//	}
	public static int[] getIntegers(int number) {
		System.out.println("Enter "+ number + "Integer values:/r");
		int[] values = new int[number];
		
		for(int i=0; i<values.length; i++) {
			values[i] = scan.nextInt();
		}
		return values;  
	}
	public static void printArray(int[] values) {
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]); 
		}
	}
	 public static int[] sortIntegers(int[] values) {
		 int [] sortedArray = new int[values.length];
		 for(int i=0; i<values.length; i ++) {
			sortedArray[i]= values[i];
		 }
		 boolean flag=true;
		 int temp;
		 while(flag) {
			 flag=false;
			 for(int i=0; i<sortedArray.length-1; i++) {
				 if(sortedArray[i]<sortedArray[i+1]) {
					 temp = sortedArray[i];
					 sortedArray[i]=sortedArray[i+1];
					 sortedArray[i+1]=temp;
					 flag=true;
				 }
			 }
		 }
		 return sortedArray;
		 
	 }

}
