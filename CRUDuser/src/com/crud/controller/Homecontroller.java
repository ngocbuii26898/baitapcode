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


@WebServlet("/home")
public class Homecontroller extends HttpServlet {
	public Connection connectSQL = connect.getJDBCConnection();
	PreparedStatement pre =null;
	ResultSet resultSet =null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Homecontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> userList = new ArrayList<>();
		
		try {	
			String sql = "SELECT * FROM cruduser.user ";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			ResultSet rs = pre.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String ten = rs.getString("ten");
				String tuoi = rs.getString("tuoi");
				String diachi = rs.getString("diachi");
				String gioitinh = rs.getString("gioitinh");
				String anh =rs.getString("anh");
				int checkbox =rs.getInt("checkbox");
				String congviec =rs.getString("congviec");
				String thongtin =rs.getString("thongtin");
				
				User user = new User();
				user.setId(id);
				user.setTen(ten);
				user.setTuoi(tuoi);
				user.setDiachi(diachi);
				user.setGioitinh(gioitinh);
				user.setAnh(anh);
				user.setCheckbox(checkbox);
				user.setCongviec(congviec);
				user.setThongtin(thongtin);
				userList.add(user);
				
			}
			request.setAttribute("userList", userList);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(request, response);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
			}

}
