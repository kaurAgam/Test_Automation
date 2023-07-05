package Day11;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_dataproviders {

	@Test(dataProvider="getData")
	public void printTestData(String userName,String password) {
		System.out.println("UserName : "+userName);
		System.out.println("Password:"+password);
	}
	@DataProvider
	public String[][] getData(){
		String[][] data=new String[4][2];
		data[0][0]="Avni";
		data[0][1]="abc@123";
		data[1][0]="falguni";
		data[1][1]="xyz@123";
		data[2][0]="Mark";
		data[2][1]="shxx*yi9";
		data[3][0]="Maitri";
		data[3][1]="hello@123";
		return data;
	}


}
