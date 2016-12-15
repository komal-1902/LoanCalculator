import java.time.LocalDate;
import java.time.Month;

public class Driver 
{
	public static void main(String args[])
	{
		Person p = new Person("Komal", "Female", LoanType.HOME, LocalDate.of(1997, Month.FEBRUARY, 19), 10, 16);
		System.out.println(LoanFactory.getCalculator(p).calculateEMI());
	}
}
