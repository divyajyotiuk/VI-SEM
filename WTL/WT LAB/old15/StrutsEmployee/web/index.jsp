<%-- 
    Document   : index
    Created on : 9 Apr, 2018, 10:25:13 AM
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
        <h1>Employee Details</h1>
        <s:form action="Employee" method="POST">
            <s:textfield name="id" label="Enter ID"></s:textfield>
            <s:textfield name="name" label="Enter Name"></s:textfield>
            <s:textfield name="dept" label="Enter Dept"></s:textfield>
            <s:textfield name="salary" label="Salary"></s:textfield>
            
            <s:submit value="ADD Employee"></s:submit>
        </s:form>
    </body>
</html>
