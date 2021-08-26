package hackerrank;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */

class Student2 implements Comparable<Student2>{
	
	private String name;
	private int id;
	private double cgpa;
	
	Student2(int id, String name, double cgpa){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getCgpa() {
		return cgpa;
	}
	
	public int compareTo(Student2 s) {
		System.out.println("this--" + this.getName() + " | s--" + s.getName());
        if(this.getCgpa() == s.getCgpa()) {
            if(this.getName() == s.getName()) return s.getId() - this.getId();
            return this.getName().compareTo(s.getName());
        }
        return this.getCgpa() < s.getCgpa() ? 1 : -1;
    }
}

class Priorities{

	public List<Student2> getStudents(List<String> events) {
		// TODO Auto-generated method stub
		PriorityQueue<Student2> q = new PriorityQueue<Student2>();
		
		for(String e : events) {
			String[] s = e.split(" ");
			
			if(s[0].equals("ENTER")) {
				String name = s[1];
				double cgpa = Double.parseDouble(s[2]);
				int id = Integer.parseInt(s[3]);

				q.add(new Student2(id, name, cgpa));
				
				System.out.println("ENTER");
				for(Student2 ss : q) {
					System.out.print(ss.getName() + " " + ss.getCgpa()  + " " + ss.getId() + " " );
				}
			}
			if(s[0].equals("SERVED")) {
				System.out.println("1");
				System.out.println("s ->" + q.poll().getName());
				
				System.out.println("SERVED");
				for(Student2 ss : q) {
					System.out.print(ss.getName() + " " + ss.getCgpa()  + " " + ss.getId() + " " );
				}
			}
		}
		
		List<Student2> list = new ArrayList<>();
		
		for(Student2 s : q) {
			list.add(s);
		}
		
		return list;
	}
	
}

class Java51{
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		scanner.nextLine();
		List<String> events = new ArrayList<>();
		
		for(int i=0; i<t; i++) {
			String s = scanner.nextLine();
			events.add(s);
		}
		
		System.out.println(events.toString());
		Priorities priorities = new Priorities();
		List<Student2> students = priorities.getStudents(events);
	
		for(Student2 s : students) {
			System.out.println(s.getName() + " " + s.getCgpa() + " " + s.getId());
		}
	}
	
}