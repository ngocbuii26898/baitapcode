package com.crud.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.database.connect;


/**
 * Servlet implementation class Adduser
 */
@WebServlet("/Adduser")
public class Adduser extends HttpServlet {
	public Connection connectSQL = connect.getJDBCConnection();
PreparedStatement pre =null;
ResultSet resultSet =null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adduser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("adduser.jsp");
		requestDispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String sql ="INSERT INTO  cruduser.user (ten,tuoi,diachi,gioitinh) values(?,?,?,?)";
			
		
		try {
				
			PreparedStatement pre = connectSQL.prepareStatement(sql);
								
				pre.setString(1, request.getParameter("ten") );
				pre.setString(2, request.getParameter("tuoi") );
				pre.setString(3,request.getParameter("diachi"));
				pre.setString(4,request.getParameter("gioitinh"));
				
				
				
				pre.executeUpdate();

				
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		response.sendRedirect("home");
		
		
	}	
	}

