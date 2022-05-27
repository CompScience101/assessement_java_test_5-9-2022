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
				  // Do required initialization
				  String name = request.getParameter("name");//swapped with ternary statements in doPost,
				  
				  // Set response content type
				  response.setContentType("text/html");
				  
				  /* Create customer Data for json */
				  JSONArray arr = new JSONArray(); // root json structure
				  // initailize data for past transactions json object
				  int []month1 = {25,89,50,200,250,300,78};
				  int []month2 = {56,81,58,205,249,17,89};
				  int []month3 = {76,34,5,270,400,234,500};
				  CustomerObj obj1 = new CustomerObj(month1, month2, month3);//store data for easy retrieval for summary json
				  JSONObject jsonObj1 = new JSONObject();
				  jsonObj1.put("name", "John");
				  int points1 = 0;
				  for(int x=0; x<month1.length; x++){
					  points1 = points1 + calculator.calc(month1[x]);
				  }
				  for(int y=0; y<month2.length; y++){
					  points1 = points1 + calculator.calc(month2[y]);
				  }
				  for(int z=0; z<month3.length; z++){
					  points1 = points1 + calculator.calc(month3[z]);
				  }
				  jsonObj1.put("points", points1);
				  arr.put(jsonObj1);
				  // initailize data for json object
				  int []month4 = {55,50,50,700,440,210,46};
				  int []month5 = {44,81,33,23,29,75,18};
				  int []month6 = {400,34,75,90,80,88,97};
				  CustomerObj obj2 = new CustomerObj(month4, month5, month6);//store data for easy retrieval for summary json
				  JSONObject jsonObj2 = new JSONObject();
				  jsonObj2.put("name", "Fred");
				  int points2 = 0;
				  for(int x=0; x<month4.length; x++){
					  points2 = points2 + calculator.calc(month4[x]);
				  }
				  for(int y=0; y<month5.length; y++){
					  points2 = points2 + calculator.calc(month5[y]);
				  }
				  for(int z=0; z<month6.length; z++){
					  points2 = points2 + calculator.calc(month6[z]);
				  }
				  jsonObj2.put("points", points2);
				  arr.put(jsonObj2);
				  // initailize data for json object
				  int []month7 = {602,399,123,278,75,108,62};
				  int []month8 = {83,90,29,174,355,184,192};
				  int []month9 = {11,875,621,76,51,56,59};
				  CustomerObj obj3 = new CustomerObj(month7, month8, month9);//store data for easy retrieval for summary json
				  JSONObject jsonObj3 = new JSONObject();
				  jsonObj3.put("name", "Larry");
				  int points3 = 0;
				  for(int x=0; x<month7.length; x++){
					  points3 = points3 + calculator.calc(month7[x]);
				  }
				  for(int y=0; y<month8.length; y++){
					  points3 = points3 + calculator.calc(month8[y]);
				  }
				  for(int z=0; z<month9.length; z++){
					  points3 = points3 + calculator.calc(month9[z]);
				  }
				  jsonObj3.put("points", points3);
				  arr.put(jsonObj3);
				  response.setStatus(HttpServletResponse.SC_OK);				  // response status
				  PrintWriter out = response.getWriter();
				  out.println(arr.toString(2));//respond with json
		  }catch(Exception ex1){
			  System.out.println("Error in doGet: "+ex1.getMessage());
		  }
	}
	

}
