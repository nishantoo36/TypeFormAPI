@apiTest
Feature: GetUserDetailsAPI

  Scenario Outline:Validate the Response Data of Get User API
    When user set endPoint as "<endPoint>"
    Then verify sttusCode as "<statusCode>"
    Then verify name as "<name>"
    Then verify height as "<height>"
    Then verify mass as "<mass>"
    Then verify hair_color as "<hair_color>"
    Then verify skin_color as "<skin_color>"
    Then verify eye_color as "<eye_color>"
    Then verify birth_year as "<birth_year>"
    Then verify gender as "<gender>"
    Then verify homeworld as "<homeworld>"
    Then verify film as "<films>"
    Then verify vehicle as "<vehicles>"
    Then verify starship as "<starships>"
    Then verify created is not Empty
    Then verify edited is not Empty
    Then verify Url as "<url>"

    Examples:
      | endPoint  | statusCode | name           | height | mass | hair_color | skin_color | eye_color | birth_year | gender | homeworld                       | films                         | vehicles                          | starships                          | url                            |
      | people/1/ | 200        | Luke Skywalker | 172    | 77   | blond      | fair       | blue      | 19BBY      | male   | http://swapi.dev/api/planets/1/ | http://swapi.dev/api/films/1/ | http://swapi.dev/api/vehicles/14/ | http://swapi.dev/api/starships/12/ | http://swapi.dev/api/people/1/ |
      | people/1/ | 200        | Luke Skywalker | 172    | 77   | blond      | fair       | blue      | 19BBY      | male   | http://swapi.dev/api/planets/1/ | http://swapi.dev/api/films/2/ | http://swapi.dev/api/vehicles/30/ | http://swapi.dev/api/starships/22/ | http://swapi.dev/api/people/1/ |