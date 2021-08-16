package mn.jagaa.javasyntax;

import java.math.BigDecimal;

public class InterestCalculator {
	BigDecimal principal; // Үндсэн
	BigDecimal interest; // Хүү

	public InterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}

	public BigDecimal calcTotal(int noOfYears) {
		return principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
	}
}
