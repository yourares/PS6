package base;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import domain.PersonDomainModel;

public class Person_Test {
	private static PersonDomainModel Per;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void Perstest() {
		Per.setFirstName("Kate");
		Per.setLastName("Lily");
		Per.setCity("Newark");
		Per.setPostalCode(19712);
		Per.setStreet("281 Thorn Ln");
	}
	@Test
	public void Addperson() {
		PersonDAL.addPerson(Per);
	}
	
	@Test
	public void Getperson() {
		String LastName = Per.getLastName();
		assertEquals("Lily",LastName);
	}
	
	@Test
	public void Deleteperson() {
		PersonDAL.deletePerson(Per);
	}

	@Test
	public void Updateperson() {
		Per.setLastName("Felix");
		PersonDAL.updatePerson(Per);
	}

}