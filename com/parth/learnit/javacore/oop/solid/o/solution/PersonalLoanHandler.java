package com.parth.learnit.javacore.oop.solid.o.solution;

public class PersonalLoanHandler implements LoanHandler {
	
	 private LoanValidator loanValidator;
	 
	 public PersonalLoanHandler(LoanValidator validator) {
		 this.loanValidator = validator;
	 }
	 
	 @Override
	 public void approveLoan(User user) {
		 if(loanValidator.isValid(user)) {
			 // proceed with loan approval
		 }
	 }
}

