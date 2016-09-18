package Bio.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bio.utility.addPatient;

@WebServlet({"/aapnhmds-baseline-clinicaldata.html",
	"/leukemia-baseline-clinicaldata.html",
	"/lymphoma-baseline-clinicaldata.html"})
public class addPatientAapnhmdsLeukemia extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection connection;
	
	public void init(ServletConfig config) throws ServletException {
		connection = (Connection) 
				getServletContext().getAttribute("dbConnection");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int patientIdNum=Integer.parseInt(request.getParameter("patientIDNumber"));
		String lastName=request.getParameter("lastName");
		String firstName=request.getParameter("firstName");
		String middleInitial=request.getParameter("middleInitial");
		String gender=request.getParameter("gender");
		java.sql.Date dateOfBirth = java.sql.Date.valueOf(request.getParameter("dateOfBirth"));
		String address=request.getParameter("address");
		String civilStatus=request.getParameter("civilStatus");
		String occupation=request.getParameter("occupation");
		java.sql.Date dateOfEntry = java.sql.Date.valueOf(request.getParameter("dateOfEntry"));
		String tissueSpecCollected=request.getParameter("specimen");
		String[] specimen=request.getParameterValues("specimen[]");
		
		addPatient ap=new addPatient();
		ap.addPatient(0, lastName, firstName, middleInitial, gender, 
				dateOfBirth, address, civilStatus, occupation, dateOfEntry, tissueSpecCollected, specimen, connection);
		
		if(request.getParameter("action").equals("aapnhmds")){
			getServletContext().getRequestDispatcher("/aapnhmds-view-patients.html");
		}
		else if(request.getParameter("action").equals("coagulation")){
			getServletContext().getRequestDispatcher("/coagulationdisease-view-patients.html");
		}
		else if(request.getParameter("action").equals("leukemia")){
			getServletContext().getRequestDispatcher("/leukemia-baseline-generaldata.html");
		}
		else if(request.getParameter("action").equals("lymphoma")){
			getServletContext().getRequestDispatcher("/lymphoma-view-patients.html");
		}
	}

}
