package com.parth.learnit.javacore.oop.solid.o.problem;

public class OpenClosedPrincipleDemo {
	
	public static void main(String[] args) {
		LoanHandler loadHandler = new LoanHandler();
		User user = new User();
		
		loadHandler.approvePersonalLoan(user);
		loadHandler.approveMortgageLoan(user);
	}
}
