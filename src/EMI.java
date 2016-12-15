
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
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (eligible ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(emiValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EMI other = (EMI) obj;
		if (eligible != other.eligible)
			return false;
		if (Double.doubleToLongBits(emiValue) != Double.doubleToLongBits(other.emiValue))
			return false;
		if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
			return false;
		return true;
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
