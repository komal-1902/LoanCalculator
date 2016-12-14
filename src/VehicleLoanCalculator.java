
public class VehicleLoanCalculator extends LoanCalculator {

	public VehicleLoanCalculator(Person person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	double rateCalculator(String gender, double slab) {
		// TODO Auto-generated method stub
		double rate = 0;
		if(slab >= 1 && slab < 10){
			rate = 12.75;
		}
		else if(slab > 10){
			rate = 13;
		}
		if(gender.equalsIgnoreCase("female")){
			rate = rate - 0.5;
		}
		return rate;
	}

}
