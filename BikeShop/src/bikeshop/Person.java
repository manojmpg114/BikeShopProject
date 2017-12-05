package bikeshop;
public class Person {

	String firstName;
	String lastName;
	
	public Person()
	{
		
	}
	public Person(String fn, String ln)
	{
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
