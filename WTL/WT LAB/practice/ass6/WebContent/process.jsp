<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>

<%
    //------------------LOGOUT FUNCTION
    
    String logoutCheck=request.getParameter("logout");

	
    if(logoutCheck!=null)
    {
    	
        session.invalidate();
        %>
        <script>
   // alert();        
    location.href="index.html";
   
        </script>
        <%
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(logoutCheck==null)
            {
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
           /*  Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "mysql");
            Statement st=con.createStatement();
            String query="Select *,count(*) as cnt from credentials where uname='"+username+"' and password='"+password+"'";
            
            ResultSet rs=st.executeQuery(query);
            rs.next();  */
            
          //  if(rs.getInt("cnt")==1){
        	  out.println(username+password);
        	  if(username.equals("djuk")&&password.equals("djuk")){
                out.print("<h1>Login Successful.</h1>");
                %>
                <form action="process.jsp" method="POST">
                    <input type="submit" value="logout" name="logout">
                </form>
                
                <%
                session.setAttribute("loggedIn", true);
                session.setAttribute("username", username);
                out.print("Login Status:"+session.getAttribute("loggedIn"));
            }
            else
            {
                if(session.isNew())
				{
                out.print("Login Status:"+session.getAttribute("loggedIn"));
					}
                out.print("<h1>login Failed.</h1>\n<h2>Invalid Credentials.</h2>");
                
            }
            
/* rs.close();
con.close();
st.close(); */
}
            %>
       
    </body>
</html>