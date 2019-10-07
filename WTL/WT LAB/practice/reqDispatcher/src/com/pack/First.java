package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
      try (PrintWriter out = response.getWriter()) {
         
          out.println("<!DOCTYPE html>");
          out.println("<html>");
          out.println("<head>");
          out.println("<title>Servlet First</title>");            
          out.println("</head>");
          out.println("<body>");
          out.println("<h1>Product Details</h1>");
          
          
          String productId=request.getParameter("productId");
          String productName=request.getParameter("pname");
          String productCategory=request.getParameter("category");
          String productPrice=request.getParameter("price");
          String productQuantity=request.getParameter("quantity");
          String productDescription=request.getParameter("description");
          out.println("<table width=\"50%\">"
                  + "<tr><th>Product Id</th><td>"+productId+"</td></tr>"
                  + "<tr><th>Product Name</th><td>"+productName+"</td></tr>"
                  + "<tr><th>Product Category</th><td>"+productCategory+"</td></tr>"
                  + "<tr><th>Price/Item</th><td>"+productPrice+"</td></tr>"
                  + "<tr><th>Quantity</th><td>"+productQuantity+"</td></tr>"
                  + "<tr><th>Description</th><td>"+productDescription+"</td></tr>"
                  + "</table>");
          
         HttpSession session=request.getSession();
          session.setAttribute("productId", productId);
          request.setAttribute("productId", productId);
          RequestDispatcher rd= request.getRequestDispatcher("Second");
          /*
          Reference==> https://www.javatpoint.com/requestdispatcher-in-servlet
          */
          //INClude method will include response of Second Servlet Into First Sevlet
         // rd.include(request,response);
          
          //THIS method will forward request to Second.java Servlet
          rd.forward(request,response);
          
         
          
          out.println("</body>");
          out.println("</html>");
      }
	}

}
