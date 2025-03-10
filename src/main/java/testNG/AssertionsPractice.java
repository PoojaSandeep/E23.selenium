package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsPractice {
	
	@Test
	//Run | Debug ! defvvf
	public void demoTest()
	{
		String a="hello";
		SoftAssert sa=new SoftAssert();
		
		System.out.println("Step 1");
		System.out.println("Step 2");
		
		Assert.assertEquals(0, 1);//fail
		
		System.out.println("step 3");
		System.out.println("step 4");
		
		Assert.assertEquals(1, 0);
		System.out.println("step 5");
		
		sa.assertAll();
	}

}
