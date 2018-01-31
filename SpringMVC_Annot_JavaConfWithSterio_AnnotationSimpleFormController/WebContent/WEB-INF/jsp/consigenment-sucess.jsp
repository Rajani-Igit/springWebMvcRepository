<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consigenment-Succsess</title>
</head>
<body>
<h2>${pageContext.request.contextPath }</h2>
   <h2>Consigenment Order Details</h2>
   <table>
      <tr>
        <th>OrderId</th>
        <th>Status</th>
        <th>MobileNo</th>
        <th>TrackId</th>
      </tr>
      <c:forEach items="${listConsigenmentStatus}" var="consigenment">
         <tr>
            <td>${consigenment.orderId }</td>
            <td>Sucess</td>
           <%--  <c:when test="${consigenment.status}">
                 <td>Sucess</td>
            </c:when>
            <c:otherwise>
                 <td>Again Try</td>
            </c:otherwise> --%>
            <td>${consigenment.mobileNo}</td>
            <td>${consigenment.tractId}</td>
        </tr>
      </c:forEach>
      
   </table>
   
   <%
      Enumeration enumer =  request.getAttributeNames();
   while(enumer.hasMoreElements()){
	   String str =(String) enumer.nextElement();
	   System.out.println(str);
   }
    %>
</body>
</html>