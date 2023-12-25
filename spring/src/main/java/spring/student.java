package spring;

public class student {
	
	private String id;
	private String name;
	private String address;
	
 	
	public student(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String getId() {
		
		return id;
		
	}
	public void setId(String id) {
		this.id = id;
		System.out.println("hi");
		
	}
	public String getName() {
		
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getAddress() {
		return address;
		
	}
	public void setAddress(String address) {
		this.address = address;
		
		
	}


	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
