package week3.cs570_l3_code.cs570_l3_code.person;

public class Student extends Person{
	private double GPA;
	//setter & getter
	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}
	//constructor
	public Student(String name, int age, String address, double gPA) {
		// TODO Auto-generated constructor stub
		super(name, age, address);
		GPA = gPA;
	}
	/* Better using getCredentials() here, to make everything clear
	 * Also take care of using keywords :double or Double, although we have auto-box
	 * */
	@Override
	public String toString() {
		return super.getCredentials()+" Most important is that my GPA=" + GPA ;
	}	
}
