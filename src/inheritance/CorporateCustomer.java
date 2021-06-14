package inheritance;

public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumber;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
