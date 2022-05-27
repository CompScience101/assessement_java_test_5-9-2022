package main.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HealthServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HealthServlet(){
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
				  // Actual logic goes here.
				  PrintWriter out = response.getWriter();
				  out.println("{ \"running\": true}");
		  }catch(Exception ex1){
			  System.out.println("Error in HealthServlet doGet while writing response: "+ex1.getMessage());
		  }
	}
}
