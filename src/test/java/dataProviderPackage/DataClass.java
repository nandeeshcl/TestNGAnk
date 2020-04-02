package dataProviderPackage;

import org.testng.annotations.DataProvider;

public class DataClass {
	
	@DataProvider(name="testData")
	public static Object[][] getData()
	{
		
		   Object[][]  data = new Object[3][2];
		
		   
		   data[0][0]="appu@gmail.com";
		   data[0][1]="appu123";
		   
		   data[1][0]="shivu@gmail.com";
		   data[1][1]="shivu123";
		   
		   data[2][0]="raghu@gmail.com";
		   data[2][1]="raghu123";
		   
		   
		   return data;
	}

}
