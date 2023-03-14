<%@page import="Dto.Marks"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<Marks> list1=(List<Marks>)request.getAttribute("li"); %>
<table border="1">
<tr>
<th>id</th>
<th>Roll_no</th>
<th>Standard</th>
<th>Kannada</th>
<th>Science</th>
<th>Maths</th>
<th>Percentage</th>
<th>result</th>
</tr>
<%for(Marks d1:list1){ %>
<tr>
<td><%=d1.getId() %></td>
<td><%=d1.getRoll_no() %></td>
<td><%=d1.getStandard()%></td>
<td><%=d1.getKannada() %></td>
<td><%=d1.getScience() %></td>
<td><%=d1.getMaths() %></td>
<td><%=d1.getPercentage()%></td>
<td><%=d1.getResult()%></td>
<%} %>
</tr>
</table>
<button><a href="logout"> <button>Logout</button> </a></button>
</body>
</html>