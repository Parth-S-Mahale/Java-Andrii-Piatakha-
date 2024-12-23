package com.parth.learnit.javacore.oop.solid.o.solution;

public class OpenClosedPrincipleDemo {
	
	public static void main(String[] args) {
		
		User user = new User();
		
		LoanHandler loanHandler = new PersonalLoanHandler(new PersonalLoanValidator());
		loanHandler.approveLoan(user);
		
		LoanHandler loanHandler2 = new MortgageLoanHandler(new MortgageLoanValidator());
		loanHandler2.approveLoan(user);
	}
	
}
