package hackerrank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
	public String whatsYourName() {
		// TODO Auto-generated method stub
		return "I have many names and types.";
	}
}

class Jasmine extends Flower{

	@Override
	public String whatsYourName() {
		// TODO Auto-generated method stub
		return "Jasmin";
	}
	
}

class Lily extends Flower{
	
	@Override
	public String whatsYourName() {
		// TODO Auto-generated method stub
		return "Lily";
	}
	
}

class Region {
	public Flower yourNationalFlower() {
		return new Flower();
	}
}

class WestBengal extends Region{

	@Override
	public Flower yourNationalFlower() {
		// TODO Auto-generated method stub
		return new Jasmine();
	}
	
}

class AndhraPradesh extends Region{
	
	@Override
	public Flower yourNationalFlower() {
		// TODO Auto-generated method stub
		return new Lily();
	}
	
}


public class Java62 {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}