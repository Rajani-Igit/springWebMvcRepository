<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Matching-Results</title>
</head>
<body>
   <h3>Matching Plans Are</h3>
   <table>
      <thead>
         <tr>
            <th>PLANNAME</th>
            <th>AMOUNT</th>
            <th>TALKTIME</th>
            <th>VALIDITY</th>
            <th>ROAMING</th>
         </tr>
      </thead>
      <tbody>
       <c:forEach items="${plansList}" var="plan">
         <tr>
            <td>${plan.planName}</td>
            <td>${plan.amount}</td>
            <td>${plan.talktime}</td>
            <td>${plan.validity}</td>
            <c:choose>
		     <c:when test="${plan.roaming}"><td>Applied</td></c:when>
		     <c:otherwise><td>NotApplied</td></c:otherwise>
 		   </c:choose>
         </tr>
         </c:forEach>
      </tbody>
   </table>
</body>
</html>