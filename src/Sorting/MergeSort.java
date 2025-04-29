package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int num[]= {5,6,3,8,9,10,4,5,6,87,43,0,1};
		int l=0;
		int r= num.length-1;
		
	mergeSort(num,l,r);
	System.out.println();
	System.out.println("After Sorting");
	for(int n: num) {
		System.out.print(n+" ");
	}
	}

	private static void mergeSort(int[] num, int l, int r) {
		if(l<r) {
		int mid= (l+r)/2;
		mergeSort(num,l,mid);
		
		mergeSort(num,mid+1,r);
	
		merge(num,l,mid,r);
		System.out.println("Merging");
		for(int n: num) {
			System.out.print(n+" ");
		}
		}
		
	}

	private static void merge(int[] num, int l, int mid, int r) {
		
		for(int i=l;i<=mid-l+1;i++) {
			for(int j = mid-l+1;j<=r-mid;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
	}

}
