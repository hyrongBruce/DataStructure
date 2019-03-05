package week3.cs570_l3_code.cs570_l3_code.person;

/**
 * This class is for creating persons
 * @author seantrinh
 *
 */
public class Person {
	//Attributes
	private String name;
	private int age;
	private String address;
	
	//Constructor
	/**
	 * This method creates a new person with the given name, age, and address
	 * @param name The name
	 * @param age The age
	 * @param address The address
	 */
	public Person (String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//Methods
	/**
	 * This method returns the name of the person
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method sets the name of the person
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCredentials() {
		return "My name is " + name + ", I am " + age + " years old, and I live in " + address + ".";
	}
	
	//Main method
	public static void main(String[] args) {
		Person p1 = new Person("Bob", 42, "New Jersey");
		System.out.println("Person 1's name is " + p1.getName());
		System.out.println(p1.getCredentials());
		
		Student s1 = new Student("Rong", 25, "NJ", 4.0);
		System.out.println(s1.getName()+" :GPA = "+s1.getGPA());
		System.out.println(s1.toString());
		
		Undergraduate u1 = new Undergraduate("Sophie", 24, "Hoboken", 3.9, "FreshMan");
		System.out.println(u1.getName()+" is now a "+u1.getEnterYear());
		System.out.println(u1.toString() );
	}
	/* Remember, student and undergraduate is a student, so Student[] arr =... can include subclass type
	 */
	
}