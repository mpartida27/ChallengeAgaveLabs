package challenge.agave.tests;

import org.testng.annotations.Test;

import challenge.agave.base.Data;
import challenge.agave.base.LimitTesting;

public class LimitTestingTests {
	
	@Test(dataProvider="ages", dataProviderClass = Data.class)
	public void testing(Object ages) 
	{
		LimitTesting limitTesting = new LimitTesting();
		limitTesting.checkAge(ages);
	}

}
