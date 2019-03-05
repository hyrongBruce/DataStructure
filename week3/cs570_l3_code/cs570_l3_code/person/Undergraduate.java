package week3.cs570_l3_code.cs570_l3_code.person;

public class Undergraduate extends Student{
	private String enterYear;
	
	
	//constructor
	public Undergraduate(String name, int age, String address, double gPA, String enterYear) {
		super(name, age, address, gPA);
		this.enterYear = enterYear;
	}
	
	
	//Method
	public String getEnterYear() {
		return enterYear;
	}
	
	public void setEnterYear(String enterYear) {
		this.enterYear = enterYear;
	}
//	public enum year{
//		Freshman, Sophomore, Junior, Senior
//	}


	@Override
	public String toString() {
		return super.getCredentials()+" Most important is that my GPA=" + super.getGPA() +". I'm now a " + enterYear+ "." ;
	}
	
	
}
