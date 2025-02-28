package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SampleTest {
	
	@Test
	public void createCustomer()//fail
	{
		//Assert.fail();//purposefully fail
		System.out.println("Create");
	}
	
	@Test
	
	public void modifyCustomer()//fail-skip
	{
		System.out.println("Modify");
	}

	@Test

	public void deleteCustomer()//fail
	{
		System.out.println("delete");
	}	

}
