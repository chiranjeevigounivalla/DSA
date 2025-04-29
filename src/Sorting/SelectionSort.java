 package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		
//		int num [] = {1,5,3,3,4,6,9,0};
//		int num [] = {9,5,4,7,7,1,8,4};
		int num [] = {7,3,2,1};
		System.out.println("Before Sorting");
		for(int n: num) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("===========");
		
		int temp =0;
		int index =-1;
		int size = num.length;
//		for(int i=0; i<size;i++) {
//			 index =i;
//			for (int j=i; j<size;j++) {
//				if(num[j]>num[i]) {
//					index=j;
//				}
//			}
//			temp = num[index] ;
//			num[index]=num[i];
//			num[i]=temp;
//			
//		}
		
		for(int i=0; i<size-1;i++) {
			 index =i;
			for (int j=i+1; j<size;j++) {
				if(num[index]>num[j]) {
					index=j;
				}
			}
			temp = num[index] ;
			num[index]=num[i];
			num[i]=temp;
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
