
public class EMI {
	private double rate, emiValue;
	private boolean eligible;

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getEmiValue() {
		return emiValue;
	}

	public void setEmiValue(double emiValue) {
		this.emiValue = emiValue;
	}

	public boolean isEligible() {
		return eligible;
	}

	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}

	public EMI(double rate, double emiValue, boolean eligible) {
		super();
		this.rate = rate;
		this.emiValue = emiValue;
		this.eligible = eligible;
	}
	
	@Override
	public String toString() {
		return "EMI [rate=" + rate + ", emiValue=" + emiValue + ", eligible=" + eligible + "]";
	}
}
