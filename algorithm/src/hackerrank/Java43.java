package hackerrank;
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Java43{
	public static void main(String []argh)
	{
		Map<String, Integer> map= new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			
			map.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			
			try {
				System.out.println(s + "=" + map.get(s).intValue());
			}
			catch(NullPointerException e) {
				System.out.println("Not found");
			}
		}
	}
}



