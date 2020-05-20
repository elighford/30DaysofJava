import java.util.Scanner;

public class SweetProgram {

	public static void main(String[] args) {
		System.out.println("Enter your name");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		System.out.println(s);
		
		if(s.equals("Eligh")) {
			System.out.println("Hey Eligh!");
		}else if(s.equals("Sally")){
			System.out.println("Hey Eligh");
		}else{
			System.out.println("You're not welcome here");
		}
		
		int i=0;//initialization
		
		do {
			System.out.println("i is:"+ i);
			i++;//update
		}while(i<10); {//condition
			
		
		input.close();
		
}
	
}
	
}
