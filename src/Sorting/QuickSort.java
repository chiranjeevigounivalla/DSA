package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		 int num[]= {4,7,3,1,5,6};
		 
		 int low = 0;
		 int high = num.length-1;
		 
		 quicksort(num,low,high);
		 
		 System.out.println();
			System.out.println("After Sorting");
			for(int n: num) {
				System.out.print(n+" ");
			}
	}

	private static void quicksort(int[] num, int low, int high) {
		
		System.out.println("low: "+low+" high: "+high);
		if(low<high) {
			int  pivalue = pivalue(num,low,high);
			
			quicksort(num,low,pivalue-1);

			quicksort(num,pivalue+1,high);
			
		}
		
	}

	private static int pivalue(int[] num, int low, int high) {
		int i =low-1;
		int pivot = num[high];
		for(int j=low;j<high;j++) {
			if(num[j]<pivot) {
				i++;
				int temp = num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
		int temp = num[i+1];
		num[i+1]=num[high];
		num[high]=temp;
		
		 System.out.println();
			System.out.println("================ poivalue Sort");
			for(int n: num) {
				System.out.print(n+" ");
			}
			 System.out.println();
		return i+1;
	}

}
