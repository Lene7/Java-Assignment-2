// 34317996
// Kriel L
// Assignment 2

public class StudentTest {
	public static void main (String[] args){
		Student s1 = new Student();
		System.out.println(s1.toString());
		Student s2 = new Student("12345678", "Joe Doe", "joedoe12@gmail.com");
		System.out.println(s2);
		
		s1.setId("1334668");
		s1.setName("Andy Travis");
		s1.setStatus("Active");
		s1.setEmail("andytrav@gmail.com");
		
		System.out.println("After changing student 1:");
		System.out.println("The id number is: " + s1.getId());
		System.out.println("The name is: " + s1.getName());
		System.out.println("The status is: " + s1.getStatus());
		System.out.println("The email is: " + s1.getEmail());
	}
}