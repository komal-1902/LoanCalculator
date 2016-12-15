import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoanCalculatorTest {
	Person p;

	@Before
	public void setUp() throws Exception {
		//create person
		p = new Person("Komal", "Female", LoanType.HOME, LocalDate.of(1997, Month.FEBRUARY, 19), 10, 16);

	}

	@After
	public void tearDown() throws Exception {
		//delete person
		p = null;
	}

	@Test
	public void LoanFactoryTestType() {
		//test correct type
		assertEquals(HomeLoanCalculator.class, LoanFactory.getCalculator(p).getClass());
	}
	
	@Test
	public void LoanFactoryTestValue() {
		EMI e = new EMI(12, 22.5, true);
		//test correct value
		assertEquals(e, LoanFactory.getCalculator(p).calculateEMI());
	}

}
