package com.purnima.jain.domain.model;

public class Person {

	private String firstName;
	private String lastName;

	private Person(Builder builder) {
		firstName = builder.firstName;
		lastName = builder.lastName;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(Person copy) {
		Builder builder = new Builder();
		builder.firstName = copy.firstName;
		builder.lastName = copy.lastName;

		return builder;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
	}

	public static final class Builder {
		private String firstName;
		private String lastName;

		private Builder() {
		}

		public Builder firstName(String val) {
			firstName = val;
			return this;
		}

		public Builder lastName(String val) {
			lastName = val;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
}
