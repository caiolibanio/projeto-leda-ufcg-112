package tests;

import junit.framework.Assert;

import main.JobImpl;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Guilherme Gadelha, Armstrong Goes, Daniell Azevedo, Caio Libanio
 *
 */
public class JobImplTest {
	JobImpl j1;
	JobImpl j2;
	JobImpl j3;
	
	@Before
	public void setup() {
		j1 = new JobImpl(100, -20, 50);
		j2 = new JobImpl(100, -19, 50);
	}
	
	@Test
	public void testConstructor(){
		
		//Testing the constructor of the Jobs
		try {
			j1 = new JobImpl(-1, -20, 50);
		} catch (Exception e) {
			Assert.assertEquals("Number of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(10001, -20, 50);
		} catch (Exception e) {
			Assert.assertEquals("Number of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(20000, -20, 50);
		} catch (Exception e) {
			Assert.assertEquals("Number of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(-10000, -20, 50);
		} catch (Exception e) {
			Assert.assertEquals("Number of process invalid.", e.getMessage());
		}
		
		
		try {
			j1 = new JobImpl(100, -21, 50);
		} catch (Exception e) {
			Assert.assertEquals("Priority of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(100, 20, 50);
		} catch (Exception e) {
			Assert.assertEquals("Priority of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(100, -22, 50);
		} catch (Exception e) {
			Assert.assertEquals("Priority of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(100, 21, 50);
		} catch (Exception e) {
			Assert.assertEquals("Priority of process invalid.", e.getMessage());
		}

		
		try {
			j1 = new JobImpl(100, -20, 0);
		} catch (Exception e) {
			Assert.assertEquals("Length of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(100, -20, 101);
		} catch (Exception e) {
			Assert.assertEquals("Length of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(100, -20, -1);
		} catch (Exception e) {
			Assert.assertEquals("Length of process invalid.", e.getMessage());
		}
		
		try {
			j1 = new JobImpl(100, -20, 102);
		} catch (Exception e) {
			Assert.assertEquals("Length of process invalid.", e.getMessage());
		}
		
	}
	
	//Testing the equals() method
	@Test
	public void testEquals() {
		Assert.assertEquals(false, j1.equals(j2));
		
		for(int i = 1; i < 100; i++){
			j1.setNumber(i);
			j1.setPriority(-20);
			j1.setLength(i);
			j2.setNumber(i);
			j2.setPriority(-20);
			j2.setLength(i);
			Assert.assertEquals(true, j1.equals(j2));
		}
		
		for(int i = 1; i < 100; i++){
			j1.setNumber(i);
			j1.setPriority(-20);
			j1.setLength(i);
			j2.setNumber(i + 1);
			j2.setPriority(-20);
			j2.setLength(i + 1);
			Assert.assertEquals(false, j1.equals(j2));
			
		}
	}
	
	//Testing if the length of the Jobs are correct
	@Test
	public void testGetLength() {
		for(int i = 1; i < 100; i++){
			j1.setLength(i);
			Assert.assertEquals(i, j1.getLength());
		}
	}
	
	//Testing if the priority of the Jobs are correct
	@Test
	public void testGetPriority() {
		for(int i = -20; i < 20; i++){
			j1.setPriority(i);
			Assert.assertEquals(i, j1.getPriority());
		}
	}
	
	//Testing if the number of the Jobs are correct
	@Test
	public void testGetNumber() {
		for(int i = 1; i < 100; i++){
			j1.setNumber(i);
			Assert.assertEquals(i, j1.getNumber());
		}
	}
	
	//Testing the toString() method
	@Test
	public void testToString() {
		for(int i = 1; i < 100; i++){
			j1.setNumber(i);
			j1.setPriority(-20);
			Assert.assertEquals("<Number: " + j1.getNumber() + ", Priority: " 
					+ j1.getPriority() + ", Length: " + j1.getLength() + ">", j1.toString());
		}
	}
}
