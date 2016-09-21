package Bio.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Bio.utility.addPatient;

@WebServlet("/plateletdisorders-baseline-clinicaldata.html")
public class addPatientPlateletsDisorders extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
	
	public void init(ServletConfig config) throws ServletException {
		connection = (Connection) 
				getServletContext().getAttribute("dbConnection");
		System.out.println("been here");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lastName=request.getParameter("lastName");
		String firstName=request.getParameter("firstName");
		String middleInitial=request.getParameter("middleInitial");
		String gender=request.getParameter("gender");
		java.sql.Date dateOfBirth = java.sql.Date.valueOf(request.getParameter("dateOfBirth"));
		String address=request.getParameter("address");
		String civilStatus=request.getParameter("civilStatus");
		String occupation=request.getParameter("occupation");
		java.sql.Date dateOfEntry = java.sql.Date.valueOf(request.getParameter("dateOfEntry"));
		
		addPatient ap=new addPatient();
		ap.addPatient(0, lastName, firstName, middleInitial, gender, 
				dateOfBirth, address, civilStatus, occupation, dateOfEntry,null,null, connection);
		
		System.out.println("ADDED PATIENT");
		if(request.getParameter("action").equals("plateletslabdata")){
			getServletContext().getRequestDispatcher("/plateletdisorders-view-patients.html").forward(request,response);
		}
	}

}
