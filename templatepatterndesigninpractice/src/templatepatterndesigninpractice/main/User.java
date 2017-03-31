package templatepatterndesigninpractice.main;

public class User {

	protected String name;
	protected String surname;
	protected String email;
	protected String phoneNumber;
	
	public User() {
		this.name = null;
		this.surname = null;
		this.email = null;
		this.phoneNumber = null;
	}
	
	public User(UserBuilder builder) {
		this.name = builder.name;
		this.surname = builder.surname;
		this.email = builder.email;
		this.phoneNumber = builder.phoneNumber;
	}

	public static class UserBuilder extends User {
		
		public UserBuilder(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}
		
		public UserBuilder setEMail(String email) {
			this.email = email;
			return this;
		}
		
		public UserBuilder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", email="
				+ email + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
