package TestPackage;

import org.junit.Assert;
import org.junit.Test;

import Q3_2.NVector;

public class TestNVectorTest {

	//test NVector(double ...v)
	@Test
	public void NVector() {
		System.out.println("run test the varag constructor");
		NVector x = new NVector(1,2,3,4);
		
		NVector notExpected = new NVector();
		
		//Test condition
		Assert.assertTrue(!x.equals(notExpected));
	}
	
	//test NVector.equals
	@Test
	public void testEquals() {
		System.out.println("run test equals");
		double a = 3, b = 2, c = 5, d = 1;
		
		NVector x = new NVector(a,c);
		NVector y = new NVector(a,c);
		NVector z = new NVector(b,d);
		
		boolean result1 = x.equals(y);
		boolean result2 = y.equals(z);
		
		boolean expected1 = true;
		boolean expected2 = false;
		
		//Test Condition
		Assert.assertTrue(result1==(expected1) && result2 == expected2);
		
	}
	
	@Test
	public void testGet() {
		System.out.println("run test get");
		double a = 5, b = -6, c = 190.5, d = 8, e = 3.14;
		int  f = 2;
		
		NVector find = new NVector(a,c,d,e,b);
		double result = find.get(f);
		double expected = d;
		
		Assert.assertTrue(result == expected);
	}

	// testing NVector.add
    @Test
    public void testAdd() {
	System.out.println("run test add");
	double a = 1, b = 2, c = -3, d = 4;

	NVector x = new NVector(a, b);
	NVector y = new NVector(c, d);

	NVector result = x.add(y);

	NVector expected = new NVector(-2,6);   // fill in missing code

	// test condition using the equals() method:
	Assert.assertTrue(result.equals(expected));
    }
    
    
	@Test
	public void testSprod() {
		System.out.println("run test sprod");
		double a=2, b=3, c=4, d=5;
		NVector one = new NVector(a,b);
		NVector two =new NVector(c,d);
		
		double result = one.sprod(two);
		double expected = 23;
		
		Assert.assertTrue(result == expected);
	}

	
	//Testing toSrting
	//need to figure out how to run this one
	@Test
	public void testToString() {
		System.out.println("run test toString");
		double a = 1, b = 2, c = -3, d = 4;

		NVector x = new NVector(a, b, c, d);
//		NVector y = new NVector(a, b, c, d);
		
		String result = x.toString();
		String expected = "Vector elements : ["+ a + " " + b + " " + c + " " + d + "]";
//		StringBuilder other = y.toString1();
		System.out.println(result);
//		System.out.println(other);
		System.out.println(expected);
		Assert.assertTrue(result.equals(expected));		
	}
	
	
	

}
