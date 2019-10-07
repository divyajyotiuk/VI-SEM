<%-- 
    Document   : index
    Created on : 9 Apr, 2018, 7:40:17 AM
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
        <h1>Addition</h1>
        <s:form action="Addition" method="POST">
            <s:textfield name="num1" label="Enter First Number"></s:textfield>
            <s:textfield name="num2" label="Enter Second Number"></s:textfield>
            
            <s:submit value="Find Sum" ></s:submit>
            
        </s:form>
    </body>
</html>
