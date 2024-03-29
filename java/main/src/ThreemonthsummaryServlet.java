package main.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.*;

public class ThreemonthsummaryServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ThreemonthsummaryServlet(){
		super();
	}
	
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		resp.setHeader("Access-Control-Allow-Origin", "*"); 
		//resp.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS"); 
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, User-Agent"); //need for chrome browser preflight, tested Authorization header for GMAIL api
		//resp.setHeader("Access-Control-Max-Age", "86400"); //not needed
		//resp.setHeader("Allow", "GET, HEAD, POST, TRACE, OPTIONS");//needed? , //Tell the browser what requests we allow. 
		//setAccessControlHeaders(resp); //used in online example
		resp.setStatus(HttpServletResponse.SC_OK); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {			
		  try{
				  // Set response content type
				  response.setContentType("text/html");
				  
				  /* Create customer Data for json */
				  JSONArray arr = new JSONArray(); // root json structure
				  // initailize data for past transactions json object
				  int []month1 = {25,89,50,200,250,300,78};
				  int []month2 = {56,81,58,205,249,17,89};
				  int []month3 = {76,34,5,270,400,234,500};
				  //CustomerObj obj1 = new CustomerObj(month1, month2, month3);//store data for easy retrieval for summary json
				  JSONObject jsonObj1 = new JSONObject();//customer object
				  jsonObj1.put("name", "John");//add key
				  int points1 = 0;
				  int monthlypoints1 = 0; 
				  //calculate points
				  for(int x=0; x<month1.length; x++){
					  points1 = points1 + calculator.calc(month1[x]);
					  monthlypoints1 = monthlypoints1 + calculator.calc(month1[x]);
				  }
				  JSONArray jsonArr1 = new JSONArray(month1);
				  jsonObj1.put("month1", jsonArr1);//add key
				  jsonObj1.put("month1_total_points", monthlypoints1);
				  System.out.println("John month1 points "+monthlypoints1);//test
				  monthlypoints1 = 0;//reset
				  for(int y=0; y<month2.length; y++){
					  points1 = points1 + calculator.calc(month2[y]);
					  monthlypoints1 = monthlypoints1 + calculator.calc(month2[y]);
				  }
				  JSONArray jsonArr2 = new JSONArray(month2);
				  jsonObj1.put("month2", jsonArr2);//add key
				  jsonObj1.put("month2_total_points", monthlypoints1);
				  System.out.println("John month2 points "+monthlypoints1);//test
				  monthlypoints1 = 0;//reset
				  for(int z=0; z<month3.length; z++){
					  points1 = points1 + calculator.calc(month3[z]);
					  monthlypoints1 = monthlypoints1 + calculator.calc(month3[z]);
				  }
				  JSONArray jsonArr3 = new JSONArray(month3);
				  jsonObj1.put("month3", jsonArr3);//add key
				  jsonObj1.put("month3_total_points", monthlypoints1);
				  System.out.println("John month3 points "+monthlypoints1);//test
				  jsonObj1.put("threemonthsummary_points", points1);//add key
				  arr.put(jsonObj1);//store customer
 				  // initailize data for past transactions json object
				  int []month4 = {55,50,50,700,440,210,46};
				  int []month5 = {44,81,33,23,29,75,18};
				  int []month6 = {400,34,75,90,80,88,97};
				  //CustomerObj obj2 = new CustomerObj(month4, month5, month6);//store data for easy retrieval for summary json
				  JSONObject jsonObj2 = new JSONObject();//customer object
				  jsonObj2.put("name", "Fred");//add key
				  int points2 = 0;
				  int monthlypoints2 = 0;
				  //calculate points
				  for(int x=0; x<month4.length; x++){
					  points2 = points2 + calculator.calc(month4[x]);
					  monthlypoints2 = monthlypoints2 + calculator.calc(month4[x]);
				  }
				  JSONArray jsonArr4 = new JSONArray(month4);
				  jsonObj2.put("month1", jsonArr4);//add key
				  jsonObj2.put("month1_total_points", monthlypoints2);
				  System.out.println("Fred month1 points "+monthlypoints2);//test
				  monthlypoints2 = 0;//reset
				  for(int y=0; y<month5.length; y++){
					  points2 = points2 + calculator.calc(month5[y]);
					  monthlypoints2 = monthlypoints2 + calculator.calc(month5[y]);
				  }
				  JSONArray jsonArr5 = new JSONArray(month5);
				  jsonObj2.put("month2", jsonArr5);//add key
				  jsonObj2.put("month2_total_points", monthlypoints2);
				  System.out.println("Fred month2 points "+monthlypoints2);//test
				  monthlypoints2 = 0;//reset
				  for(int z=0; z<month6.length; z++){
					  points2 = points2 + calculator.calc(month6[z]);
					  monthlypoints2 = monthlypoints2 + calculator.calc(month6[z]);
				  }
				  JSONArray jsonArr6 = new JSONArray(month6);
				  jsonObj2.put("month3", jsonArr6);//add key
				  jsonObj2.put("month3_total_points", monthlypoints2);
				  System.out.println("Fred month3 points "+monthlypoints2);//test
				  jsonObj2.put("threemonthsummary_points", points2);//add key
				  arr.put(jsonObj2); //store customer
				  // initailize data for past transactions json object
				  int []month7 = {602,399,123,278,75,108,62};
				  int []month8 = {83,90,29,174,355,184,192};
				  int []month9 = {11,875,621,76,51,56,59};
				  //CustomerObj obj3 = new CustomerObj(month7, month8, month9);//store data for easy retrieval for summary json
				  JSONObject jsonObj3 = new JSONObject();//customer object
				  jsonObj3.put("name", "Larry");//add key
				  int points3 = 0;
				  int monthlypoints3 = 0;
				  //calculate points
				  for(int x=0; x<month7.length; x++){
					  points3 = points3 + calculator.calc(month7[x]);
					  monthlypoints3 = monthlypoints3 + calculator.calc(month7[x]);
				  }
				  JSONArray jsonArr7 = new JSONArray(month7);
				  jsonObj3.put("month1", jsonArr7);//add key
				  jsonObj3.put("month1_total_points", monthlypoints3);
				  System.out.println("Larry month1 points "+monthlypoints3);//test
				  monthlypoints3 = 0;//reset
				  for(int y=0; y<month8.length; y++){
					  points3 = points3 + calculator.calc(month8[y]);
					  monthlypoints3 = monthlypoints3 + calculator.calc(month8[y]);
				  }
				  JSONArray jsonArr8 = new JSONArray(month8);
				  jsonObj3.put("month2", jsonArr8);//add key
				  jsonObj3.put("month2_total_points", monthlypoints3);
				  System.out.println("Larry month2 points "+monthlypoints3);//test
				  monthlypoints3 = 0;//reset
				  for(int z=0; z<month9.length; z++){
					  points3 = points3 + calculator.calc(month9[z]);
					  monthlypoints3 = monthlypoints3 + calculator.calc(month9[z]);
				  }
				  JSONArray jsonArr9 = new JSONArray(month9);
				  jsonObj3.put("month3", jsonArr9);//add key
				  jsonObj3.put("month3_total_points", monthlypoints3);
				  System.out.println("Larry month3 points "+monthlypoints3);//test
				  jsonObj3.put("threemonthsummary_points", points3);//add key
				  arr.put(jsonObj3);//store customer
				  response.setStatus(HttpServletResponse.SC_OK);				  // response status
				  PrintWriter out = response.getWriter();
				  System.out.println("sending user json; "+arr.toString(2));
				  out.println(arr.toString(2));//respond with json
		  }catch(Exception ex1){
			  System.out.println("Error in doGet: "+ex1.getMessage());
		  }
	}
	

}
