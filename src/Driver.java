import java.time.LocalDate;
import java.util.Scanner;

public class Driver 
{
	public static void main(String args[])
	{
		Person p = new Person("Komal", "Female", "HOME", LocalDate.now(), 10, 16);
		System.out.println(LoanFactory.getCalculator(p).calculateEMI());
	}
}
