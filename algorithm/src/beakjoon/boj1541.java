package beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.script.ScriptException;

public class boj1541 {
	public static void main(String[] args) throws IOException, ScriptException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		ScriptEngineManager mgr = new ScriptEngineManager();
//	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
//	    String foo = "40+2";
//	    System.out.println(engine.eval(foo));
		
		String[] s = br.readLine().split("-");
		int sum=0;
		String[] p = s[0].split("\\+");
		for(String t : p) {
			sum+=Integer.valueOf(t);
		}
		for(int i=1; i<s.length; i++) {
			p = s[i].split("\\+");
			for(String t : p) {
				sum-=Integer.valueOf(t);
			}
		}
		System.out.println(sum);
		br.close();
		
	}
}
