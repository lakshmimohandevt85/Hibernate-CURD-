package bean;


public class Student {

	// properties declared as private
	
	private int id;
	private String name;
	private String email;
	private int address;
	
	// default constructor
	public Student(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	
	
	
	
	}
