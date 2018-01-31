<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>Add ConsigenMent Details</h2>
  <form:form modelAttribute="">
    <table>
       <tr>
          <td>
             <table>
               <th><b>From Address</b></th>
               <tr><form:input path="fromName"/></tr></br>
               <tr><form:input path="fromMobile"/></tr></br>
               <tr><form:input path="fromAddressLine1"/></tr></br>
               <tr><form:input path="fromAddressLine2"/></tr></br>
               <tr><form:input path="fromCity"/></tr></br>
               <tr><form:input path="fromState"/></tr></br>
               <tr><form:input path="fromCountry"/></tr></br>
               <tr><form:input path="fromZipcode"/></tr></br>
               <tr><form:input path="fromEmail"/></tr></br>
             </table>
          </td>
          
          <td>
            <table>
               <th><b>To Address</b></th>
               <tr><form:input path="toName"/></tr></br>
               <tr><form:input path="toMobile"/></tr></br>
               <tr><form:input path="toAddressLine1"/></tr></br>
               <tr><form:input path="toAddressLine2"/></tr></br>
               <tr><form:input path="toCity"/></tr></br>
               <tr><form:input path="toState"/></tr></br>
               <tr><form:input path="toCountry"/></tr></br>
               <tr><form:input path="toZipcode"/></tr></br>
               <tr><form:input path="toEmail"/></tr></br>
             </table>
          </td>
       </tr>
       <tr>
         CourierService : <form:input path="sericeName"/></br>
         CourierType    : <form:select path="courierType"></br>
             <form:option value="open">open</form:option>
             <form:option value="closed">closed</form:option>
         </form:select>
         Weight : <form:input path="weight"/>
         Amount : <form:input path="amount"/>
         Shipment Days :<form:input path="noOfDays"/>
       </tr>
  </table>
  <input type="submit" value="courier">
  </form:form>
</body>
</html>