package demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test1 
	{		
			@Test
			public void testCase1() 
				{
					System.out.println("Hello Sir");
				}
			
			@Test
			public void testCase2() 
				{
					int a = 2;
					int b = 7;
					int c = a+b;
					
					Assert.assertEquals(c, "7");
					
				}
			@Test(enabled=true)
			public void additionV() 
			{
				int a = 12;
				int b = 16;
				int c ;
				c =  a + b;
				System.out.println(c);
			}
			
			
			@Parameters({"val"})
			@Test(enabled = true)
			public void rev(String val) 
			{
				
				StringBuilder input1 = new StringBuilder();
				input1.append(val);
				input1 = input1.reverse();
				System.out.println(input1);
			}
			
			@Test(dataProvider ="getData")
			public void details(String username, String password) 
				{
					System.out.println(username);
					System.out.println(password);
				}
			@DataProvider
			public Object[][] getData() {
				Object[][] data = new Object[3][2];
				
				data[0][0] ="FirstName";
				data[0][1] ="Last Name";
				
				data[1][0]= "2nd First name";
				data[1][1]= "2nd Last name";
				
				data[2][0]= "3rd first name";
				data[2][1]= "3rd Last Name";
				
				return data;
			}
			
			//TestNG Listerners   
			
			// whenever test case fails it will re root to one specific code 
			
			
			
			
	}
