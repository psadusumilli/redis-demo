package inheritance;

public class Child extends Parent{
	
	private final String  firstName, lastName;
	
	public Child() {
		this.firstName = null;
		this.lastName = null;
	}
	
	public Child(String firstName, String lastName ) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public static String who() {
		return "Child";
	}
	
	public String getFirstName() {
		return firstName;
	}

	
	
	public String getLastName() {
		return lastName;
	}


	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Child))
			return false;
		Child other = (Child) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
	
	
	
	
}
