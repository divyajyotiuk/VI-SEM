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
   
           session.removeAttribute("uname");
           session.setAttribute("uname", null);
            request.getSession(false).invalidate();
            response.sendRedirect("index.html");
                      
            
            %>
</body>
</html>