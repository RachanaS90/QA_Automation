Feature: validating Place API's

Scenario Outline: Verify if place is successfully added using AddPlace API
Given Add Place Payload with "<name>" "<address>" "<language>"
When User calls "AddPlaceAPI" with post http request
Then The api call got sucess with status code 200
And "status" in response body is "OK"

Examples:
   |name | address | language |
   |Time Sqaure| Marol | English|
   |The Leela | Mumbai | French |