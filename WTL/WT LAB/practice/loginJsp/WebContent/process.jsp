<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
 String uname=request.getParameter("uname");
           String password=request.getParameter("password");
           
       /*    Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","mysql");
           PreparedStatement ps=con.prepareStatement("select * from credentials");
           ResultSet rs=ps.executeQuery();
           boolean flag=false;
           while(rs.next())
           {
               String uid=rs.getString("uname");
               String paswd=rs.getString("password");
              if(uid.equals(uname) && paswd.equals(password))
              {
                 flag=true;
                   
                 break;
              }
          } */

           
           if(uname.equals("djuk") && password.equals("djuk"))
        	 // if(flag==true)
           {
               
               session.setAttribute("uname", uname);
                   response.sendRedirect("home.jsp");  
                   
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
               
           }
           else
           {
               %>
               <script>
               alert("Invalid credentials");
               location.href="index.html";
               </script>
               <%
        	  // out.print("Log in unsuccessful");
               //response.sendRedirect("index.html");
           }
           %>
         <!--   <br><br><div>
               <a href="logout.jsp">Log Out!</a>
           </div> -->
</body>
</html>