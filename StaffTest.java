// 34317996
// Kriel L
// Assignment 2

public class StaffTest {
	public static void main (String[] args){
		Staff sf1 = new Staff();
		System.out.println(sf1.toString());
		Staff sf2 = new Staff("15645296", "Jona Mokoena", "jonamokoena@gmail.com", "Mr");
		System.out.println(sf2);
		
		sf1.setId("11665295");
		sf1.setName("Mini Kruger");
		sf1.setEmail("minik34@gmail.com");
		sf1.setTitle("Ms");
		sf1.setOffice("SS-coffee station");
		
		System.out.println("After changing staff 1:");
		System.out.println("The id number is: " + sf1.getId());
		System.out.println("The name is: " + sf1.getName());
		System.out.println("The email is: " + sf1.getEmail());
		System.out.println("The title is: " + sf1.getTitle());
		System.out.println("The office is: " + sf1.getOffice());
	}
}