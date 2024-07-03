// 34317996
// Kriel L
// Assignment 2

public class FacultyTest {
	public static void main (String[] args){
		Faculty f1 = new Faculty();
		System.out.println(f1.toString());
		Faculty f2 = new Faculty("24356189", "J. Smith", "24356189@mynwu.ac.za", "Professor");
		System.out.println(f2);
		
		f1.setId("24451623");
		f1.setName("Tina Meyer");
		f1.setEmail("tinameyer@gmail.com");
		f1.setRank("Head of BSc IT");
		f1.setOffice("E2-B03");
		
		System.out.println("After changing faculty 1:");
		System.out.println("The id number is: " + f1.getId());
		System.out.println("The name is: " + f1.getName());
		System.out.println("The email is: " + f1.getEmail());
		System.out.println("The rank is: " + f1.getRank());
		System.out.println("The office is: " + f1.getOffice());
	}
}