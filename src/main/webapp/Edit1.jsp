<%@page import="Dto.Marks"%>
<%@page import="Dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
<style type="text/css">

.k{
width:300px;
	margin-left: 500px;
	margin-top: 100px;
	font-family: serif;
	font-size: 20px;
	font-weight: 
bold;
box-shadow: 10px 10px 30px #c5f6fa;
padding-left: 25px;
padding-bottom: 25px;
padding-top: 25px;
border: 1px solid #c5f6fa;
background-color:#e3fafc;
}
h1{
font-size: 25px;
}
.m{
margin-bottom: 10px;
}
input {
	margin-left: 10px;
}

a:hover,button:hover {
background-color: #c5f6fa;
font-weight: bold;	
}
.b{
margin-left: 120px;
margin-top: 10px;
}
</style>
</head>
<body>

<div class="k">
<h1>Add marks</h1>
<form action="MT" method="post">
Standard:<input type="text" name="Standard" class="m"><br>
Roll_no:<input type="text" name="roll" class="m"><br>
Kannada:<input type="text" name="sub1" class="m"><br>
Science:<input type="text" name="sub2" class="m"><br>
maths:<input type="text" name="sub3" class="m"><br>
percentage:<input type="text" name="total" class="m"/><br> 
Result:<input type="text" name="result" class="m"/><br> 
<button>submit</button>
</form>
</div>
</body>
</html>