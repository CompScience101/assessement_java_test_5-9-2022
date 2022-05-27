# Assessment Test REST API

> My REST API to implement retailer's rewards program.

## Running java REST API without go docker container (option #1)
1. Pick a java web server like Apache Tomcat.
2. make sure java environment(1.5 version) is installed on your local machine
3. Create a folder that is named "assessment-java-5-9-2022" in the application section of your web server, for example if you are using
    Apache Tomcat, then create the folder in the webapps folder.
4. Copy my files from my repository into the folder created in the previous step.
5. Run the java server and note the port that your java server is running on so that you can use it
    with the client requests.
   NOTE: you may need to allow this program in your OS's firewall to run it successfully, in Windows OS you may get a "Windows Security Alert" prompt,
   please make sure the public network checkbox is selected, then choose "Allow Access" button, then click "yes" if you are prompted to allow the program to 
   make changes to the computer.


## Unit Testing
1. copy my code(all files) to your local hard drive and to the java web server that you are testing my 
    application from.
2. make sure java environment(1.5 version) is installed on your local machine
3. open my project in your java IDE, make sure that the libraries are configured with the project, 
    you can these libraries in the path "\WEB-INF\lib" of the "assessment-java-5-9-2022" project.
4. Then run the file titled "TestRunner.java"(this file is in the directory "/java/main/src" of the 
    "assessment-java-5-9-2022" project), to run my unit test. If all is setup up correctly 
    all my test will pass and you will see the sentence "Printing testing class successful: true"
    on the IDE's console window screen. If you want different test input change the test case in the
    "MemberPointsTest.java" file, then re-run the test. 



## Using Endpoints
- When using all the endpoints, you need to replace 8080 (for me it was 8080 with apache tomcat server) with the port of your java web server.
- When using the "Create transaction" endpoint, please make sure to provide a integer value for the "cost" field of your json.
  Use http://localhost:8080/api/transaction to communicate from the client to the api.
- When using the "Get Health" endpoint you don't need to pass any data, just use the url and path specified and if it succeeds
  you will get a 200 status response along with content body of the running status, otherwise you will get no response from the 
  server if it is not available. Use http://localhost:8080/api/health to communicate from the client to the api.
- When using the "Get Member Points Summary" endpoint you don't need to pass any data, just use the url and path specified 
  and if it succeeds you will get a 200 status response along with content body of the total points summary of last three 
  months for each customer, otherwise you will get no response.
  The data for this endpoint is manually generated in the java file titled "ThreemonthsummaryServlet.java"
## Endpoints

### Get Health
``` bash
# URL: api/health
# Method: GET  
# HTTP/1.1
# Response sample
# code: 200
# content: {running: "true"}
```

### Create Transaction
``` bash
# URL: api/transaction 
# Method:POST 
# HTTP/1.1

# Request sample
# {
#   "cost": 120,
# }

# Response sample
# Code: 201
# Content: {
#   "reward": 90
# }
```

### Get Member Points Summary (from past three months)
``` bash
# URL: api/threemonthsummary
# Method:GET
# HTTP/1.1
# Response sample
# Code: 200
# Content: [{
#   "name": "John" 
#   "points": 150
# },{
#   "name": "Fred" 
#   "points": 200
# },{
#   "name": "Larry" 
#   "points": 300
# }]
```

## Errors and questions
if you run into any errors, please contact me as soon as possible by phone or by email, and I will try to help or rewrite my code.



```


### Writer

Nicholas Donald
