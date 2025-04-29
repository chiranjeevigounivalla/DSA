package LinearSearch;

public class FindElementLinearSearch {
	
	public static void main (String[] args) {
		System.out.println("Hello");
		
		int[ ] num = {2, 3, 4, 5, 6, 7, 8};
		int n=8;
		findElement(num,n);
	}

	private static void findElement(int[] num,int n) {
		int size = num.length;
		for (int i=0;i<size;i++) {
			int l = num[i];
			if(l==n) {
				System.out.println("Found Element at: "+ i );
			}
		}
	}

}
