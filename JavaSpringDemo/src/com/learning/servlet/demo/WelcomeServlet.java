package com.learning.servlet.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")		//Annotation used to declare a servlet. Tells the compiler that this class is 
									//HTTP Servlet. Classes annotated with @WebServlet must extend the 
									//javax.servlet.http.HttpServlet class
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//1. Create the data (model) and add it to the request object
		String welcomeMessage[] = {" Welcome ", " Starting Spring course "};
		request.setAttribute("myWelcomeMessage", welcomeMessage); // Called by the server (via the service method) to 
																  // allow a servlet to handle a GET request. 
		
		//2. Retrieve request dispatcher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Welcome.jsp");
		
		//3. Forward request to the view
		requestDispatcher.forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
