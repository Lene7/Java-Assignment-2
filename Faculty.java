// 34317996
// Kriel L
// Assignment 2

public class Faculty {
	private String id;
	private String name;
	private String rank;
	private String office;
	private String email;
	
	public Faculty(){
		
	}
	
	public Faculty (String id, String name, String email, String rank){
		this.id = id;
		this.name = name;
		this.email = email;
		this.rank = rank;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getRank(){
		return this.rank;
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
	
	public void setRank(String rank){
		this.rank = rank;
	}
	
	public void setOffice(String office){
		this.office = office;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString() {
		return "The id number is: " + getId() + "\nThe name is: " + getName() + "\nThe email is: " +getEmail() + "\nThe rank is: " + getRank();
	}
	
}