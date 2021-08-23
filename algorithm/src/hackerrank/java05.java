package hackerrank;

import java.util.Scanner;

public class java05 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner("java 100\n" + 
				"cpp 65\n" + 
				"python 50");
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            
            System.out.printf("%-15s %03d\n", s1, x);
        }
        System.out.println("================================");
        
	}
	
}
