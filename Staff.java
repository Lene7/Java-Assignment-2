// 34317996
// Kriel L
// Assignment 2

public class Staff {
	private String id;
	private String name;
	private String title;
	private String office;
	private String email;
	
	public Staff(){
		
	}
	
	public Staff (String id, String name, String email, String title){
		this.id = id;
		this.name = name;
		this.email = email;
		this.title = title;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public String getOffice(){
		return this.office;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setOffice(String office){
		this.office = office;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString() {
		return "The id number is: " + getId() + "\nThe name is: " + getName() + "\nThe email is: " +getEmail() + "\nThe title is: " + getTitle();
	}
	
}