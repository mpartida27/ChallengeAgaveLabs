package challenge.agave.base;

import org.testng.annotations.DataProvider;

public class Data {
	
	 @DataProvider (name = "user_data")
	public Object[][] getData()
	{
		Object[][] data = new Object[1][4];
		
		data[0][0] = "Mario Partida";
		data[0][1] = "mario.partida@gmail.com";
		data[0][2] = "6221007102";
		data[0][3] = "//Users//drivers//test.pdf";
		return data;
	}
	 
	@DataProvider(name = "ages")
	public Object[][] getAge() {
		Object[][] age = new Object[14][1];

		age[0][0] = -1;
		age[1][0] = "uno";
		age[2][0] = null;
		age[3][0] = "";
		age[4][0] = 1;
		age[5][0] = 4;
		age[6][0] = 5;
		age[7][0] = 6;
		age[8][0] = 17;
		age[9][0] = 18;
		age[10][0] = 59;
		age[11][0] = 60;
		age[12][0] = 10000;
		age[13][0] = 0;

		return age;
	}

}
