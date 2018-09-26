package com.Web.AutoTest.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Web.AutoTest.Method.RestAPI_GET;

public class TC_GET_Method {

	//public TestBase base;
	String serviceUrl;
	String url;
	String apiUrl;
	
	@BeforeMethod
	public void setup(){
		try {
			System.out.println("Inside setup");
			/*base=new TestBase();
			serviceUrl=prop.getProperty("URL");
			apiUrl=prop.getProperty("ServiceURL");*/
			
					url="https://reqres.in/api/users?page=2";
					System.out.println(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	@Test
	public void getMethod(){
		
		try {
			RestAPI_GET restclient=new RestAPI_GET();
			restclient.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
