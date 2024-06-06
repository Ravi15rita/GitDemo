import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class GraphQl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String response=given().log().all().header("Content-Type","application/json").body("{\"query\":\"mutation($locationName: String!,$characterName:String!,$episodeName:String!)\\n{\\n  createLocation(location: {name : $locationName, type:\\\"SouthZone\\\", dimension:\\\"234\\\" })\\n  {\\n    id\\n  }\\n  createCharacter(character:{name:$characterName,type:\\\"Macho\\\",status:\\\"alive\\\",species:\\\"human\\\",gender:\\\"Male\\\",image:\\\"png\\\",originId:7296,locationId:7296})\\n  {\\n    id\\n  }\\n  createEpisode(episode:{name:$episodeName,air_date:\\\"1950\\\",episode:\\\"Prime\\\"})\\n  {\\n    id\\n  }\\n  deleteLocations(locationIds:[7298,6416])\\n  {\\n    locationsDeleted\\n  }\\n}\",\"variables\":{\"locationName\":\"Sydney\",\"characterName\":\"Baskin Robin\",\"episodeName\":\"Manifest\"}}")
		.when().post("https://rahulshettyacademy.com/gq/graphql")
		.then().extract().response().asString();
		
		System.out.println(response);
		JsonPath js= new JsonPath(response);
		String characterName=js.getString("data.character.name");
		//Assert.assertEquals(characterName, "Robin");
		
		System.out.println(characterName);
		

	
	//Mutation
	String Mutationresponse=given().log().all().header("Content-Type","application/json").body("{\"query\":\"mutation($locationName: String!,$characterName:String!,$episodeName:String!)\\n{\\n  createLocation(location: {name : $locationName, type:\\\"SouthZone\\\", dimension:\\\"234\\\" })\\n  {\\n    id\\n  }\\n  createCharacter(character:{name:$characterName,type:\\\"Macho\\\",status:\\\"alive\\\",species:\\\"human\\\",gender:\\\"Male\\\",image:\\\"png\\\",originId:7296,locationId:7296})\\n  {\\n    id\\n  }\\n  createEpisode(episode:{name:$episodeName,air_date:\\\"1950\\\",episode:\\\"Prime\\\"})\\n  {\\n    id\\n  }\\n  deleteLocations(locationIds:[7298,6416])\\n  {\\n    locationsDeleted\\n  }\\n}\",\"variables\":{\"locationName\":\"Sydney\",\"characterName\":\"Baskin Robin\",\"episodeName\":\"Manifest\"}}")
			.when().post("https://rahulshettyacademy.com/gq/graphql")
			.then().extract().response().asString();
	
			 System.out.println(Mutationresponse);
			 
			 JsonPath js1= new JsonPath(Mutationresponse);
			 
			
	
	
}
}
