package com.Web.AutoTest.Method;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestAPI_GET {

	//GET Method
	public void get(String url){
	try {
	CloseableHttpClient httpclient=HttpClients.createDefault();
	HttpGet httpget=new HttpGet(url);
	CloseableHttpResponse httpresponse=httpclient.execute(httpget);
	
	//Response status code
	int statuscode=httpresponse.getStatusLine().getStatusCode();
	System.out.println("Status code is:"+statuscode);
	
	//Response Json String
	String responsestring=EntityUtils.toString(httpresponse.getEntity(),"UFT-8");
	
	JSONObject responsejson=new JSONObject(responsestring);
	System.out.println("Respose Json is:"+responsejson);
	
	//Response Headers
	Header[] headersarray=httpresponse.getAllHeaders();
	HashMap<String,String> allheaders=new HashMap<String,String>();
	for(Header headers:headersarray){
		allheaders.put(headers.getName(), headers.getValue());
	}
	
	System.out.println("Headers array is:"+allheaders);
	
	} catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
