package com.crud.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crud.database.connect;


/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	public Connection connectSQL = connect.getJDBCConnection();
	PreparedStatement pre =null;
	ResultSet resultSet =null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		request.setAttribute("id",id);
		
       
        String sql ="DELETE FROM cruduser.user WHERE id= ?";
		
		
		
		try {
			
			PreparedStatement pre = connectSQL.prepareStatement(sql); 
								
			pre.setString(1,request.getParameter("id"));
				
				pre.executeUpdate();
				
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
	response.sendRedirect("home");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
