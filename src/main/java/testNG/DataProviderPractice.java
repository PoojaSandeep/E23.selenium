package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider ="getData")
	public void addPhoneTOCart(String pname, String PModel, int price, int qty)
	{
		System.out.println(pname+"->"+PModel+"->"+price+"->"+qty);
	}
	
	@DataProvider
	public Object[][] getData()
	{//3 data sets of 4 information each
		Object[][] data=new Object[3][4];
		
		data[0][0]="Samsung";
		data[0][1]="A80";
		data[0][2]=12000;
		data[0][3]=19;
		
		data[1][0]="Iphone";
		data[1][1]="I90";
		data[1][2]=670000;
		data[1][3]=10;
		
		data[2][0]="Vivo";
		data[2][1]="V090";
		data[2][2]=6700;
		data[2][3]=5;
		
		return data;
		
	}
	
}
