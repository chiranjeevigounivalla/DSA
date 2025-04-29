package Sorting;

public class InsertionSort {

	public static void main(String args[]) {
		
		int num[] = {2,1};
		int size =num.length;
		System.out.println();
		System.out.println("Before Sorting");
		for(int n: num) {
			System.out.print(n+" ");
		}
		for(int i=1;i<size;i++) {
			
		int j =i-1;
		int key = num[i];
		
		while (j>=0 && num[j]>key) {
			num[j+1] = num[j];
			j--;
		}
		num[j+1] =key;
			
		System.out.println();
		System.out.println("===========");
		for(int n: num) {
			System.out.print(n+" ");
		}	
		}
		System.out.println();
		System.out.println("After Sorting");
		for(int n: num) {
			System.out.print(n+" ");
		}
	}
}
