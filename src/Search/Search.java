package Search;

public class Search {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5,6,7,8,9,10};
		int target =3;
		int position = findElementLinearSerach(num, target);
		
		if(position!=-1) {
		System.out.println("Element Found at Position: "+position);
		}
		else {
			System.out.println("No Elment Found");
		}
		int position1 = findElementBinarySerach(num, target);
		if(position1!=-1) {
			System.out.println("Element Found at Position: "+position1);
			}
			else {
				System.out.println("No Elment Found");
			}
		
		int position3 = findElementBinarySerach2(num, target,0,num.length-1);
		if(position3!=-1) {
			System.out.println("Element Found at Position: "+position3);
			}
			else {
				System.out.println("No Elment Found");
			}
		

	}

	private static int findElementLinearSerach(int[] num, int target) {
		int steps =0;
		int size = num.length-1;
		for(int i=0;i<size;i++) {
			steps++;
			if(num[i]==target) {
				System.out.println("Steps taken to found element: "+steps);
				return i;
			}
		} 
		return -1;
	}
	
	private static int findElementBinarySerach(int[] num, int target) {
		int left =0;
		int right =num.length-1;
		int steps =0;
		while(left<=right) {
			int mid = (left+right)/2;
			steps++;
			if(num[mid] ==target) {
				System.out.println("Steps taken to found element: "+steps);
				return mid;
			}else if(num[mid]<target) {
				left = mid +1;
			}
			else {
				right = mid-1;
			}
		}
		return -1;
	}

	private static int findElementBinarySerach2(int[] num, int target, int left, int right) {
		int mid = (left+right)/2;
		int steps =0;
		if(num[mid]==target) {
			System.out.println("Steps taken to found element: "+steps);
			return mid;
		}else if(num[mid]<target){
			left = mid+1;
			return findElementBinarySerach2( num, target,  left, right);
		}
		else {
			right =mid-1;
			return findElementBinarySerach2( num, target,  left, right);
		}
		
		
	}
	
	
}
