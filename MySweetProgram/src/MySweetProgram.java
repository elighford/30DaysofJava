import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("students.txt"));
		
		List<String> students = new ArrayList<String>();
		
		while(input.hasNextLine()) {
			students.add(input.nextLine());
		
		}
		
		for(int i=0; i<students.size(); i++) {
			System.out.println("name: " + students.get(i));
		}
		input.close();
}
}
