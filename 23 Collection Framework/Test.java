import java.io.BufferedReader;
import java.io.InputStreamReader;

import ArrayList.Demo;

public class Test {

	public static void main(String[] args) {
     
		Demo d=new Demo();
		InputStreamReader ib=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ib);
		
		System.out.println("enter ducatid:");
		  d.setDucatId(Integer.parseInt(br.readLine()));
	}

	
		
	}

}
