package com.Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JunitTest {

	@Test
	public void JunitTest() {
		assertEquals("error in add()", 39, Calci.add(8, 31)); 
		assertEquals("error in add()", 22, Calci.add(8, 14)); 
		}
	public void JunitTestFails() {
		assertEquals("error in add()", 00, Calci.add(8, 31)); 
		assertEquals("error in add()", 12, Calci.add(8, 14)); 
		}
	
	public void JunitsubTest() {
		assertEquals("error in sub()", 10, Calci.substract(12, 2)); 
		assertEquals("error in sub()", 7, Calci.substract(19, 12)); 
		}
	public void JunitsubTestFails() {
		assertEquals("error in sub()", 0, Calci.substract(12, 2)); 
		assertEquals("error in sub()", 0, Calci.substract(19, 12)); 
		}
	public void JunitMulTest() {
		assertEquals("error in multiply()", 1, Calci.multiply(1, 1)); 
		assertEquals("error in multiply()", 16, Calci.multiply(8, 2)); 
		}
	public void JunitMulTestFails() {
		assertEquals("error in multiply()", 0, Calci.multiply(1, 1)); 
		assertEquals("error in multiply()", 0, Calci.multiply(8, 2)); 
		}
	public void JunitDivTest() {
		assertEquals("error in devide()", 4, Calci.devide(32, 8)); 
		assertEquals("error in devide()", 2, Calci.devide(12, 6)); 

		}
	public void JunitDivTestFails() {
		assertEquals("error in devide()", 0, Calci.devide(24, 6)); 
		assertEquals("error in devide()", 0, Calci.devide(12, 6)); 

		}
}
