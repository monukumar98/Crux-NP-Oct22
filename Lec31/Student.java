package Lec31;

public class Student {

	int age;
	String name;

	
	public void Intro_yourSelf() {

		System.out.println("My Name is " + this.name + " and age is " + this.age);

	}

	public void SayHey(String name) {

		System.out.println(name + " Say Hey " + this.name);

	}

	public static void fun(int x) {
		System.out.println("I am in Fun" + x);
	}

	static {
		System.out.println("Hey All Welcome to Coding Blocks");
	}
	static {
		System.out.println("Hey All Welcome to Coding Blocks 2");
	}

}
