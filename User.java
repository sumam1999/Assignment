package eduSmart;

abstract class User {
	
	private String name;
	private String email;
	private int userId;
	
  public User(String name, String email, int userId)
    {
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public int getUserId() 
	{
		return userId;
	}
	
	public void setUserId(int userId) 
	{
		this.userId =userId;
	}
	
	public abstract void viewProfile();
	

	final void displayWelcome() {
		System.out.println("\n Welcome to EduSmart LMS, " + name + "!");
	}
}
