import java.util.Scanner;

public class Arrays {
	//private static int i;
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String [] args) {
		//int [] myArray = new int [25];
//		for(i=0; i<myArray.length; i++) {
//			myArray[i]= i*10;
//		}
		//printArray(myArray);
	
	
//	public static void printArray(int [] array) {
//		for(i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
//	}
	
	int[] myIntegers = getIntegers(5);
	for(int i=0; i<myIntegers.length; i++) {
		System.out.println(myIntegers);
	}

	}

	public static int[] getIntegers(int number) {
		System.out.println("Enter "+ number + "ineteger value");
		int [] values = new int[number];
		for(int i = 0; i<values.length; i++) {
			values[i] = scan.nextInt();
		}
		return values;
	
		}
	}
	