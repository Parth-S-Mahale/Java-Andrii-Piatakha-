package com.parth.learnit.javacore.oop.solid.s.problem;

public class MailboxSettingsService {
	
//	private String newSecondaryEmail;
//	
//	public String getChangedEmail() {
//		return newSecondaryEmail;
//	}
//	
//	public void setChangedEmail(String newSecondaryEmail) {
//		 this.newSecondaryEmail = newSecondaryEmail;
//	}
	
	public void changeSecondaryEmail(User user, String newSecondaryEmail) {
		if(hasAccess(user)) {
			user.setSecondaryEmail(newSecondaryEmail);
		}
	}
	
	public boolean hasAccess(User user) {
		if(user.getRole() == Role.ADMIN) {
			return true;
		} else {
			return false;
		}
	}
}
