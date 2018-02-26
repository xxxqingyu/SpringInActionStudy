package spittr.data.model;

public class Spitter {
	
	private long id;
	
	private String username;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	public Spitter() {
		// TODO Auto-generated constructor stub
	}
	
	public Spitter(String username,String password,String firstName,String lastName) {
		this(0, username, password, firstName, lastName);
	}
	
	public Spitter(long id,String username,String password,String firstName,String lastName) {
		this.id=id;
		this.username=username;
		this.password=password;
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
