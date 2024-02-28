
public class Array {

	
		static boolean twice(int[] arr) {
		for(int i=0;i<=arr.length;i++) {
			for(int j=1;j<=arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
				
		}

		}
		return false;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,3,4,6,7,8}; 
		twice(arr);
		
}
}
