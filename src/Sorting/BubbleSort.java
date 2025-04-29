package Sorting;

public class BubbleSort {

	public static void main(String [] args) {
//		int num [] = {1,5,3,3,4,6,9,0};
		int num [] = {7,3,2,1};
		System.out.println("Before Sorting");
		for(int n: num) {
			System.out.print(n+" ");
		}
		int size =num.length;
		int temp =0;
		System.out.println();
		System.out.println("==============");
		for(int i=0; i<size;i++) {
			for(int j=0;j<size-1;j++) {
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j]=num[j+1];
					num[j+1]= temp;
				}
				System.out.println();
				for(int n: num) {
					System.out.print(n+" ");
				}
			}
			
			System.out.println();
			System.out.println("==============");
			System.out.println();
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
