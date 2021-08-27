package hackerrank;
import java.util.Scanner;

class MyCalculator1 {

    /*
    * Create the method long power(int, int) here.
    */
	public long power(int n, int p) throws Exception {
		// TODO Auto-generated method stub
		
		if(n==0 && p ==0) throw new Exception("n and p should not be zero.");
		if(n<0 || p <0) throw new Exception("n or p should not be negative.");
		int result=1;
		for(int i=0; i<p; i++) {
			result*=n;
		}		
		return result;
	}
    
}

public class Java53 {
    public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
