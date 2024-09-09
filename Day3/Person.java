package Java_Programs.Day3;

public class Person {


	private String name;
	private int age;
	
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	
	public String getName() {
		return this.name;
		
	}

	public int getAge() {
		return this.age;
		}
	
	public static void main(String[] args) {
		
		Person p= new Person("Gaurav",26);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		     	
	}
	}


