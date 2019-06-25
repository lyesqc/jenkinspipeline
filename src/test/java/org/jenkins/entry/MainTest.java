package org.jenkins.entry;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {

	@Test
	public void initializePersonTest(){
		Main main = new Main();
		Main.Person  p  = new Main.Person("Bensaada", "Lyes");
		Main.initializePerson(p);
		assertTrue(p.name == "" && p.prenom =="");
	}
}
