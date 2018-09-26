import java.net.URI;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.response.QueryResponse;
import com.rallydev.rest.util.Fetch;

public class ConnectRally {

	public static void testcaseresult(){
		RallyRestApi restApi=null;
		
		try
		{
			System.out.println("Inside Rally class");
			restApi=new RallyRestApi(new URI("https://rally1.rallydev.com"),"");
			QueryRequest userRequest=new QueryRequest("User");
			userRequest.setFetch(new Fetch("Username","Sub"));
			
			QueryResponse userqueryResponse=restApi.query(userRequest);
			JsonArray userqueryResult=userqueryResponse.getResults();
			JsonElement userqueryelemnt=userqueryResult.get(0);
			JsonObject userqueryobj=userqueryelemnt.getAsJsonObject();
			String userRef=userqueryobj.getAsString();
				
		System.out.println("Name:"+ userRef);	
		}
		catch(Exception e){
			
		}
	}
	
	
}
