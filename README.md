# playerMs
player Microservice

requests: 
Create a microservice which serves the contents of player.csv through REST API.

 The service should expose two REST endpoints:

GET /api/players - returns the list of all players.
GET /api/players/{playerID} - returns a single player by ID.
 
After implementing the basic functionality consider the following (as time allows): testing, edge cases, optimizations, deployment.

# what I would have done differently
 1. insert the csv into DB tables (by a function reading csv), and then fetch the data from the DB. in order to design a better data model and optimize runtime.
 2. handling players in cash
 3. handle special edge cases in convert from csv - as special chars, empty or null values when fields are required
 4. handle authorization user in controller
 5. add validation
 6. handle tests to check exeption handling, nulls, special cases and more
