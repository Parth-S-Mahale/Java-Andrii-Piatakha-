package com.parth.learnit.javacore.oop.solid.o.solution;

public class MortgageLoanHandler implements LoanHandler{
	
	private LoanValidator loanValidator;
	
	public MortgageLoanHandler(LoanValidator loanValidator) {
		this.loanValidator = loanValidator;
	}
	
	@Override
	public void approveLoan(User user) {
		if(loanValidator.isValid(user)) {
			// proceed with loan approval
		}
	}
	
}
