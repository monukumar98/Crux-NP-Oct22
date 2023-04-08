package Lec31;

public class Person {
	private int age ;
	private String name ;

	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
		throw	new Exception("Bklol age -ve nhi hota hai ");
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);
	}

}
