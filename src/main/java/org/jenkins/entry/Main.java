package org.jenkins.entry;

public class Main {

	public static void main(String... args) {
		System.out.println("Stagging......");
	}

	void initializePerson(Person p) {
		p.name = "";
		p.prenom = "";
	}

	public static class Person {
		public Person(String name, String prenom) {
			this.name = name;
			this.prenom = prenom;
		}

		String name;
		String prenom;
	}
}
