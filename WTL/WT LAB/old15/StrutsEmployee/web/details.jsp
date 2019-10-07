<%-- 
    Document   : details
    Created on : 9 Apr, 2018, 10:42:11 AM
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
    <center>
        <h1>Employee Details</h1>
        <h3>Employee id: <s:property value="id"></s:property></h3>
        <h3>Employee Name: <s:property value="name"></s:property></h3>
        <h3>Employee Department: <s:property value="dept"></s:property></h3>
        <h3>Employee Salary: <s:property value="salary"></s:property></h3>
    </center>
    </body>
</html>
