//package utilities;
//
//import java.io.IOException;
//
//import org.testng.annotations.DataProvider;
//
//public class DataProviders {
//
//	//Dataprovider 1
//	@DataProvider(name="LoginData")
//	public String[][] getData() throws IOException {
//		String path="C:\\Users\\marte\\eclipse-workspace\\HybridFramework\\HybridFramework_Selenium\\testData\\OpenCartDataDriven.xlsx"; //taking xl file from desktop
//		
//		ExcelUtility xlutil= new ExcelUtility(path); //creating an object for XLUtility
//		
//		int totalrows=xlutil.getRowCount("Sheet1");
//		int totalcols=xlutil.getCellCount("Sheet1", 1);
//		
//		String logindata[][]=new String[totalrows][totalcols]; //created for 2 dimension array which can store data
//		
//		for(int i=1;i<=totalrows;i++) //1 //read the data from xl storing in 2 dimensional array
//		{
//			for(int j=0;j<totalcols;j++)//0  //i is rows and j is col
//			{
//				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j); //1,0
//			}
//		}
//		return logindata; //returning 2D array
//	}
//	
//	//Dataprovider 2
//	//Dataprovider 3
//	//Dataprovider 4
//	}
