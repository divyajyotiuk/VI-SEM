<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
            
           response.setHeader("Cache-Control", "no-cache");
           response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
             response.setDateHeader("Expires", 0);
            
        if(session.getAttribute("uname")==null)
        {
            response.sendRedirect("index.html");
        }
        else
        {
            out.println("Welcome  "+session.getAttribute("uname") + "!");
        }
        
        %>
        <a href="logout.jsp">Log out!</a>
</body>
</html>