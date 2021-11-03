<%-- 
    Document   : Show
    Created on : 27-10-2021, 12:09:26
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="lpx solid black">
            <tr>
                <th>ID_EMP</th>
                <th>NAME_EMP</th>
                <th>BIRTHDAY</th>
                <th>ID_ROOM</th>
            </tr>
            <c:forEach items="${listS}" var="x">
                <tr>
                    <td>${x.idemp}</td>
                    <td>${x.name}</td>
                    <td>${x.dob}</td>
                    <td>${x.idroom}</td>
                    <td>
                        <a href="#">Update</a>
                        <a href="#" onclick="showMess(${x.idemp})">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <a href="Add.jsp">Create Student</a>
    </body>
</html>
