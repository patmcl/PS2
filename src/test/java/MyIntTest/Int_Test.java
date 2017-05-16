package MyIntTest;

import static org.junit.Assert.*;

import org.junit.Test;

import base.MyInteger;

public class Int_Test {
	
	@Test
	public void Test1() {
		MyInteger myint = new MyInteger(10);
		assertTrue(MyInteger.isEven(myint));
		assertFalse(MyInteger.isOdd(myint));
		assertTrue(MyInteger.isPrime(myint));
	}
	
	@Test
	public void Test2() {
		MyInteger int2 = new MyInteger(5);
		assertTrue(MyInteger.isOdd(int2));
		assertFalse(MyInteger.isEven(int2));
		assertFalse(MyInteger.isPrime(int2));
	}
	
	@Test
	public void Test3() {
		MyInteger int3 = new MyInteger(15);
		assertEquals(int3.isEven(), false);
		assertEquals(int3.isOdd(), true);
		assertEquals(int3.isPrime(), true);
	}

}
