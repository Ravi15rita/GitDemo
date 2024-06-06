Feature: Validating place API's
 @AddPlace @Regression
  Scenario Outline: Verify if place is being Successfully added using AddPlaceAPI
  	Given Add place payload with "<name>" "<language>" "<address>"
  	When user calls "AddPlaceAPI" with "POST" http request
  	Then the API call is success with status code 200
  	And "status" in response body is "OK"
  	And "scope" in response body is "APP"
  	And verify place_id created maps to "<name>" using "<getPlaceAPI>"

 Examples:
 		|name  | language|address						|
 		|Ravi  | English |World cross center|
 		|Roshan| Hindi   |World 1st   center|
 		
 @DeletePlace @Regression
Scenario: Verify if Delete functionality is working
	
		Given DeletePlace Paylod
		When user calls "deletePlaceAPI" with "POST" http request
		Then the API call is success with status code 200
		And "status" in response body is "OK"
		