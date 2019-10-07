<%-- 
    Document   : result
    Created on : 9 Apr, 2018, 8:00:59 AM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Num1: <s:property value="num1"></s:property></p>
        Num2: <s:property value="num2"></s:property>
        <br>SUM:<s:property value="result"></s:property>
    </body>
</html>
