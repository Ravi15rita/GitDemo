package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlace addPlacePayload(String name, String language,String address)
	{
		AddPlace p=new AddPlace();
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");
		p.setName(name);
		List<String> myList =new ArrayList<String>();
		myList.add("Shoe park");
		myList.add("Shop");
		p.setTypes(myList);
		Location l =new Location();
		p.setLocation(l);
		l.setLat(-38.383494);
		l.setLng(33.427362);
		return p;
	}
	
	public String deletePlacePayload(String placeId) {
		return "{\r\n    \"place_id\":\""+placeId+"\"\r\n}";
	}

}
