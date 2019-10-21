package com.crud.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.crud.database.connect;


/**
 * Servlet implementation class Loadimg
 */
@WebServlet("/Loadimg")
public class Loadimg extends HttpServlet {
	public Connection connectSQL = connect.getJDBCConnection();
	ResultSet resultSet =null;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loadimg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("upload.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
		List<FileItem> items;
		String ten= "";
		String anh="";
		String tuoi="";
		String gioitinh="";
		String diachi="";
		String checkbox="";
		String congviec="";
		String thongtin="";
		int sex=0;
		String cv="";
		
		try {
			
			items = servletFileUpload.parseRequest(request);
			for (FileItem item : items) {
				 
				if (item.getFieldName().equals("ten")) {
					 ten = item.getString();
				}
				else if (item.getFieldName().equals("tuoi")) {
					tuoi = item.getString();
				} 
				else if (item.getFieldName().equals("diachi")) {
					diachi = item.getString();
				}
				else if (item.getFieldName().equals("gioitinh")) {
					gioitinh = item.getString();
				}
				
				else if (item.getFieldName().equals("anh")) {
					if (item.getSize() > 0) {
						 String pathProject = getServletContext().getRealPath("/resource/");
						String originalFileName =item.getName();
						anh = originalFileName;//lay dung ten anh 
						
						
						//// final String dir = pathProject.substring(0, pathProject.lastIndexOf("classes\\")) + "WebContent\\resources\\avatar\\";
						// String originalFileName = item.getName();
						// int index = originalFileName.lastIndexOf(".");
						// String ext = originalFileName.substring(index + 1);
						// String fileName = System.currentTimeMillis() + "." + ext;
						 File fileIO = new File(pathProject + anh);//tao duong anh + ten file de luu anh vo 
						 item.write(fileIO);
						//file = item.getString();
						
								}
				}
				else if (item.getFieldName().equals("checkbox")) {
					checkbox = item.getString();
					if(checkbox==null)
					{
						sex=0;
					
					}
					else {
						
						sex=1;
						
					}
					
				}
				else if (item.getFieldName().equals("congviec")) {
					congviec = item.getString();
					
					if(congviec=="dihoc")
					{
						cv="dihoc";
					
					}
					else {
						
						cv="dilam";
						
					}
					System.out.println("kq option="+congviec);
			
			}
				else if (item.getFieldName().equals("thongtin")) {
					thongtin = item.getString();
				} 
			}
			
		String sql ="INSERT INTO   cruduser.user (ten,anh,tuoi,gioitinh,diachi,checkbox,congviec,thongtin) values(?,?,?,?,?,?,?,?)";
			 
			PreparedStatement pre = connectSQL.prepareStatement(sql);
		System.out.println(ten+anh+tuoi+gioitinh+diachi+sex+cv);
			pre.setString(1,ten);
			
			pre.setString(2,anh);
			pre.setString(3,tuoi);
			pre.setString(4,gioitinh);
			pre.setString(5,diachi);
			pre.setInt(6,sex);
			pre.setString(7,cv);
			pre.setString(8,thongtin);
			
			pre.executeUpdate();	
			
			
			
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("home");
	}
	
	}


