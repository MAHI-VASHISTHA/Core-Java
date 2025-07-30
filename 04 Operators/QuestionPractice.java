package demo;

public class QuestionPractice {
public static void main(String[] args) {
	
	int[] arr= {2,8,6,3,1,15,16,14,18,10,2,0,1,8,6};
	
	int even=0;
	int odd=0;
	
	for(int i:arr) {
	if(i%2==0)
	{
		even++;

	}
	else {
		odd++;

		
	}
	}
	System.out.println("Even Numbers: "+even);
	System.out.println("odd Numbers: "+odd);


}
}