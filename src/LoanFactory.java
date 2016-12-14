
public class LoanFactory {
	public static LoanCalculator getCalculator (Person person) {
	
		switch(person.getLoanType()){
		case "HOME":
			return new HomeLoanCalculator(person);
		case "PERSONAL":
			return new PersonalLoanCalculator(person);
		case "VEHICLE":
			return new VehicleLoanCalculator(person);
		default:
			return null;
		}
	}
	
	
}
