package BinarySearch;

public class FindElemetBinarySearch {

	public static void main(String[] args) {
		int[ ] num = {2, 3, 4, 5, 6, 7, 8};
		int n=0;
	int position=	findElement(num,n);
	System.out.println("Position: "+position);
	}

	private static int findElement(int[] num, int n) {
		
		int left =0;
		int right = num.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			if(num[mid] ==n) {
				return mid;
			}else if(num[mid]< n) {
				left = mid +1;
			}else {
				right =mid-1;
			}
		}
		return -1;
	}

}
