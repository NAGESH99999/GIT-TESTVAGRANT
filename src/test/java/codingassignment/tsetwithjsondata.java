package codingassignment;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import io.ous.jtoml.ParseException;

public class tsetwithjsondata {

	
	
	@DataProvider(name="dp")
	public Sting[] readJson() throws IOException, ParseException
	
	{
		
		JSONParser jsonparser = new JSONParser();

		FileReader reader =new FileReader("H:\\new practice\\assignment\\src\\test\\resources\\rcbteam.json");
		  
		Object obj=jsonparser.parse(reader);
		
		JSONObject rcbjsonobj=(JSONObject)obj;
		
		String name=(String) rcbjsonobj.get("name");
		String place=(String) rcbjsonobj.get("location");
		
		
		System.out.println("name:"+name);
		System.out.println("location:"+place);
		
		
		JSONArray array=(JSONArray)rcbjsonobj.get("player");
		
				   
		   
		
	for(int i=0;i<array.size();i++) 
	{
		
	   JSONObject player=(JSONObject) array.get(i);
	   
	   
	  
	   String country=(String) player.get("country");
	   String role=(String) player.get("role");
	   String price=(String) player.get("price-in-crores");
	   
	   System.out.println("player "+i+"....");
	   System.out.println("country: "+country);
	   System.out.println("role: "+role);

		
	}
	return array;
}

	
	
	@Test(dataprovider="data")
	
	void validateforiegnplayers()
	
	{
		int foriegnplayers=0;
		int indianplayers=0;
		int wicketkeepar=0;
		
		if(role.equals("wicket-keepar"))
		{
			wicketkeepar++;
		}
		elseif(country.equals("India"))
		{
			indianplayers++;
		}
		else
			
		{
			foriegnplayers++;
			
		}
		
		System.out.println("count of wicketkeepar: "+wicketkeepar);
		   System.out.println("count of indianplayers: "+indianplayers);
		   System.out.println("count of foriegnplayers: "+foriegnplayers);
	}
	}
	