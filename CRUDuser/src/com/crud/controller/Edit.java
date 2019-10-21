package com.crud.controller;


import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.crud.database.connect;
import com.crud.model.User;

/**
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	public Connection connectSQL = connect.getJDBCConnection();

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Edit() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<User> userList = new ArrayList<>();
		String id = request.getParameter("id");
		request.setAttribute("id", id);
		String sql="SELECT * FROM cruduser.user where id=?";
		
		try {
		
		
		PreparedStatement pre = connectSQL.prepareStatement(sql);
		
		pre.setString(1,request.getParameter("id"));
		ResultSet rs = pre.executeQuery();
		System.out.println(id);
		
			
		
			
		
		while (rs.next()) {
			int id1 = rs.getInt("id");
			String ten = rs.getString("ten");
			String tuoi = rs.getString("tuoi");
			String diachi = rs.getString("diachi");
			String gioitinh = rs.getString("gioitinh");
			String anh=rs.getString("anh");
			int checkbox = rs.getInt("checkbox");
		
			
			User user = new User();
			user.setId(id1);
			user.setTen(ten);
			user.setTuoi(tuoi);
			user.setDiachi(diachi);
			user.setGioitinh(gioitinh);
			user.setAnh(anh);
			
			user.setCheckbox(checkbox);
			
			userList.add(user);
			
		}
		request.setAttribute("userList", userList);
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("edit.jsp");
		requestDispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String checkbox=request.getParameter("checkbox");
		
		int sex=0;
		System.out.println("========================================"+checkbox);

				String sql = "UPDATE cruduser.user  SET ten=?,tuoi=?,diachi=?,gioitinh=?,anh=?,checkbox=? where id=?";

				try {

					PreparedStatement pre = connectSQL.prepareStatement(sql);

					pre.setString(1, request.getParameter("ten"));
					pre.setString(2, request.getParameter("tuoi"));
					pre.setString(3, request.getParameter("diachi"));
					pre.setString(4, request.getParameter("gioitinh"));
					
					pre.setString(5, request.getParameter("anh"));
					
					if(checkbox==null)
					{
						sex=0;
					}
					else {
						sex=1;
					}
					System.out.println("========================================"+sex);
					pre.setInt(6,sex);
					pre.setString(7, request.getParameter("id"));
					pre.executeUpdate();

				} catch (SQLException e) {

					e.printStackTrace();
				}

				response.sendRedirect("home");
			}

		}



