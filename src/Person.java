import java.time.LocalDate;

public class Person {
	private String name, gender, loanType;
	private LocalDate dob;
	private long amount;
	private int tenure;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public LocalDate getDate() {
		return dob;
	}
	public void setDate(LocalDate dob) {
		this.dob = dob;
	}
	public Person(String name, String gender, String loanType, LocalDate date, long amount, int tenure) {
		super();
		this.name = name;
		this.gender = gender;
		this.loanType = loanType;
		this.dob = date;
		this.amount = amount;
		this.tenure = tenure;
		
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public Person(String name, String gender, LocalDate dob) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

}
