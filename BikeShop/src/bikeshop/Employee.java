package bikeshop;
public class Employee extends Person {
	
	Boss boss;
	int id;
	

	public Employee()
	{
		
	}
	
	public Employee(String fn, String ln) {
		super(fn, ln);
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String fn, String ln, int id)
	{
		super(fn,ln);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	//inner class of the bike shops employees, the boss
	public class Boss
	{
		final int ID = 666;
		String lastName;
		public Boss(String lastName)
		{
			this.lastName = lastName;
		}
		
		public String getName()
		{
			String r = ("Mr." + this.lastName);
			return r;
		}
		
		public int getID()
		{
			return this.ID;
		}
		
		public void employeeRequest()
		{
			System.out.println("Whats the issue? I'm a very busy individual");
		}
	}
	
	//get boss
	
	public void getBoss()
	{
		boss = new Boss("George");
		boss.employeeRequest();
	}

}
