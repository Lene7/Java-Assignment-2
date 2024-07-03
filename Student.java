// 34317996
// Kriel L
// Assignment 2

public class Student {
	private String id;
	private String name;
	private String status;
	private String email;
	
	public Student(){
		
	}
	
	public Student (String id, String name, String email){
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getStatus(){
		return this.status;
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
	
	public void setStatus(String status){
		this.status = status;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString() {
		return "The id number is: " + getId() + "\nThe name is: " + getName() + "\nThe email is: " +getEmail();
	}
	
}