
public class MySweetProgram {

	public static void main(String[] args) {
		int[][] data = { 
				{4, 5, 3, 24},
				{3, 23, 1, 4, 100, 69, 333},
				{5, 4, 23, 3},
};
		
		for(int i=0; i< data.length; i++) {
			for(int j=0; j< data[i].length; j++) 
			{
				System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
	

