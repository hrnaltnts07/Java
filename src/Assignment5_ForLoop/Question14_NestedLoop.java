package Assignment5_ForLoop;

public class Question14_NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=7;
		
		
		for(int i =1; i<=rows; i++) {
			System.out.print("#");
			for(int j=1; j<i; j++) {
				
				System.out.print(" ");
			}
			System.out.println("#");
			
		}


	}

}