package Sorting;

public class WorkSheet {

	public static void main(String[] args) {
		int num[] = {9,4,5,7,7,2,1,8,4};
		int size = num.length;
		int index =-1;
		int temp =0;
		for(int i=0;i<size;i++) {
			index =i;
			for(int j=i+1;j<size;j++) {
				if(num[index]>num[j]) {
					index =j;
				}
			}
			temp=num[index];
			num[index]=num[i];
			num[i]=temp;
		}
		
		System.out.println();
		System.out.println("After Sorting");
		for(int n: num) {
			System.out.print(n+" ");
		}

		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1;j++) {
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("After Sorting");
		for(int n: num) {
			System.out.print(n+" ");
		}
	}
	
}
	
