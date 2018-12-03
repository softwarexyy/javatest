package nxy;

public abstract class Person {	//抽象类
	private String name;
	private int age;
	public Person(String n, int a) {
		this.name = n;
		this.age = a;
		System.out.println("You have create a person:" + this.name);
	}
	
	public Person() {	// default constructor
		System.out.println("you have create a Person object");
		this.name = "unkown";
		this.age = 0;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(Person other) {
		System.out.println("call equals_function");
		return (this.name == other.name)&&(this.age == other.age);
	}
	
	public abstract String getDescript();	//抽象函数，具体实现交给子类
}
