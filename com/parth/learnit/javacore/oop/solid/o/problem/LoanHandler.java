package com.parth.learnit.javacore.oop.solid.o.problem;

public class LoanHandler {
	
	private PersonalLoanValidator personalLoanValidator;
	private MortgageLoanValidator mortgageLoanValidator;
	
	public void approvePersonalLoan(User user) {
		if(personalLoanValidator.isValidUserForPersonalLoan(user)) {
			// proceed with personal loan approval
		}
	}
	
	public void approveMortgageLoan(User user) {
		if(mortgageLoanValidator.isValidUserForMortgageLoan(user)) {
			// proceed with personal loan approval
		}
	}
}
