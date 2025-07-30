package ArrayList;

public class QuestionArrayList {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 6, 8, 7, 9, 4, 2 };
		int even=0;
		int odd=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even=arr[i];
				System.out.println(even);
			}
			
		}
	}
}
