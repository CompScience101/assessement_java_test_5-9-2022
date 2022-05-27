package main.src;

import java.io.IOException; 
import java.io.PrintWriter;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.*;


public class TransactionServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TransactionServlet(){
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

	public void doPost(HttpServletRequest request, HttpServletResponse response){		
		  try{
			  	// Set response content type
				//response.setContentType("text/html");
				// Retrieve parameter from html request
			  
			  String data = (String) request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
			  //System.out.println("data: "+data);//test works
			  int cost=0;
			  try{
				  /*parse data*/
				  JSONObject jsonObj1 = new JSONObject(data);
				  cost = jsonObj1.getInt("cost");
			  }catch(Exception ex){
				  //send user the error
				  response.setStatus(HttpServletResponse.SC_BAD_REQUEST);//Reply with error
				  System.out.println("invalid payment, user needs to instead use a integer with no decimal places, and include it in the cost value of the json object");
				  response.getWriter().print( "{\"error\": \"invalid payment, please make sure you use a integer with no decimal places. and include it in the cost value of the json object\"}");//TEST PRINT
	                //response.getWriter().print(ex1.getMessage()+", requestedPath: "+requestedPath);//APP PRINT
	                response.getWriter().close();
			  } 
			  		/*calculate reward points and send to user*/
				    int points = calculator.calc(cost);
				    System.out.println("rewarding user "+points+" points");
					response.setStatus(HttpServletResponse.SC_CREATED);//Reply with error
					response.getWriter().print("{\"reward\": "+points+"}");//TEST PRINT
	                //response.getWriter().print(ex1.getMessage()+", requestedPath: "+requestedPath);//APP PRINT
	                response.getWriter().close();
			}catch(Exception ex1){
					//	send user the error
	                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);//Reply to request with 400 http error
	                try {
						response.getWriter().print("Internal error, please try again later");
						response.getWriter().close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//TEST PRINT
	                //response.getWriter().print(ex1.getMessage()+", requestedPath: "+requestedPath);//APP PRINT
	                
			}
	  }
}

