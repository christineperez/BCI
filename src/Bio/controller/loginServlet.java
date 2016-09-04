package Bio.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bio.model.AccountBean;
import Bio.utility.sql.SQLOperations;



import java.sql.Connection;

@WebServlet("/sample.html")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
	
	public void init() throws ServletException {
		connection = SQLOperations.getConnection();
		if (connection != null) {
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("connection is READY.");
		} else {
			System.err.println("connection is NULL.");
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("loginUsername")!=null && request.getParameter("loginPassword")!=null){

				String username=request.getParameter("loginUsername");
				String password=request.getParameter("loginPassword");
				
				if(connection!=null){
					if(SQLOperations.loginCheck(username, password, connection)){
						System.out.println("successful connection: Admin");

						AccountBean account = 
						  SQLOperations.searchAccount(username, connection);
			
						request.setAttribute("user", account);
						
						getServletContext().getRequestDispatcher("/home.html")
						.forward(request, response);
					}
					
					else{
						request.setAttribute("error","Invalid Username or Password");
						System.out.println("Invalid username and password");
						RequestDispatcher rd=request.getRequestDispatcher("index.html");
						rd.include(request, response);
					}
				}
				//else error 
				else{
					System.out.println("invalid connection");
				}
			
		}
		
	}

}
