<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Search-Plans</title>
</head>
<body>
   <h2>Search Plans Here</h2>
 <form action="${pageContext.request.contextPath}/search-plans.htm" >
 PlanName   :<input type="text"  name="planName" /><br/>
 Type       :<select name="type"><option>PostPaid</option><option>PrePaid</option></select><br/>
 Validity   :<input type="text" name="validity" /><br/>
 Amount     :<input type="text" name="amount" >  
             <input type="submit" value="search">
</form>
</body>
</html>